/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;

import java.util.ArrayList;

/**
 *
 * @author Kukul
 */
public final class NoteID {
    private final int maxFret = 18;
    private String[] tuning = new String[] {"E2", "A2", "D3", "G3", "B3", "E4"};    
    
    enum Pitches
    {
        C(12), D(14), E(16), F(17), G(19), A(21), B(23);
        
        private int action;
        
        public int getAction(){
            return this.action;
        }
        
        private Pitches(int action){
            this.action=action;
        }
    }    
    
    public int calcPitch(String note)
    {
        int octave, deviation = 0;
        char n;
        octave = Character.getNumericValue(note.charAt(note.length() - 1));
        n = note.charAt(0);
        if (note.length() == 3) {
            char dev = note.charAt(1);
            if (dev == '#') {
                deviation = 1;
            }
            if (dev == 'b') {
                deviation = -1;
            }
        }
        return Pitches.valueOf(String.valueOf(n)).getAction() + deviation + 
                octave * 12; 
        
    }
    
    private Integer calcFret(int pitch, int stringPitch)
    {
        if (stringPitch > pitch || pitch - stringPitch > maxFret ) {
            return -1;
        }
        else return pitch - stringPitch;
    }
    
    public int[] possibleFrets(int pitch)
    {
        int[] frets = new int[tuning.length];
        for (int i = 0; i < frets.length; i++) {
            frets[i] = calcFret(pitch, calcPitch(tuning[i]));
        }
        return frets;
    }
    
    public void changeTunning(String[] newTuning)
    {
        tuning = newTuning;        
    }    
    
    public ArrayList<Tab> findTabs(ArrayList<Chord> chords)
    {
        ArrayList<Tab> tabs = new ArrayList<>();
        for (int i = 0; i < chords.size(); i++) {
            tabs.add(findTab(tabs, chords.get(i)));
        }
        
        return tabs;
    }
        
    private Tab findTab(ArrayList<Tab> tabs, Chord chord)
    {
        Tab tab = new Tab(tuning);
        placeChord(tab, chord);
        
        return tab;
    }
    
    private void placeChord(Tab tab, Chord chord)
    {
        chord.sortChord(true);
        placeNote(tab, chord.getNote(chord.size - 1).getPitch());
        for (int i = 0; i < chord.getNotes().size() - 1; i++) {
            placeNote(tab, chord.getNote(i).getPitch());            
        }
    }
    
    
    // Puts a single note in a tab according to the least fret difference in the tab
    private void placeNote(Tab tab, int pitch)
    {
        int[] frets = possibleFrets(pitch);
        int index = -1;

        if (tab.size == 0) {
            int minFret = maxFret;
            for (int i = 0; i < frets.length; i++) {
                if (frets[i] > -1 && frets[i] < minFret && tab.get(i) == null) {
                    minFret = frets[i];
                    index = i;
                }
            }
        }
        else {
            int minDiff = maxFret;
            for (int i = 0; i < frets.length; i++) {
                int Diff = Math.max(Math.abs(tab.getHighest() - frets[i]), 
                        Math.abs(tab.getLowest() - frets[i]));
                if (frets[i] > -1 && Diff < minDiff && tab.get(i) == null) {
                    minDiff = Diff;
                    index = i;
                }
            }
        }             
        if (index > -1) {
            tab.put(index, frets[index]);
        }
        
    }

}
