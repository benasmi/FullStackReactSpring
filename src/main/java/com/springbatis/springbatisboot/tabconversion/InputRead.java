/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.sound.midi.*;
/**
 *
 * @author Karolis
 */
public class InputRead {

    /**
     * @param args the command line arguments
     */
    private static String fileName="test1.mid";
         
    /*
    Method to read midi file
    */
    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;
    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

    
    private ArrayList<Chord> Chords;
    
    //Cache key is note's pitch because at the same time the same note can be played once
    //Cache value is chord's number
    private HashMap<Integer,Integer> ExistingNotesCache;
    
    public ArrayList<Chord> readFile(InputStream path) throws Exception{
        
        
//        File file =new File(path); // Midi file
//        //checking if file format is correct
//        if((file == null)||(!file.getName().substring(file.getName().lastIndexOf('.')+1).equals("mid"))){
//            throw new InvalidMidiDataException();
//        }
        Sequence sequence = MidiSystem.getSequence(path);
        
        int trackNumber = 0;
        for (Track track :  sequence.getTracks()) {
            
            Chords = new ArrayList<Chord>();
            ExistingNotesCache = new HashMap<Integer, Integer>();
            
            trackNumber++;            
            
            Chord chord = new Chord();
            long previousTick = 0;
            int chordNumber=0;
            
            
            for (int i=0; i < track.size(); i++) { 
                MidiEvent event = track.get(i);                
                
                MidiMessage message = event.getMessage();
                if (message instanceof ShortMessage) {
                    ShortMessage sm = (ShortMessage) message;
                    
                     if(previousTick!=event.getTick()){
                            if(chord.getNotes().size()!=0){
                                Chords.add(chord);
                                chord = new Chord();
                                chordNumber++;
                            }
                        }
                    if (sm.getCommand() == NOTE_ON) {
                        
                        
                        int key = sm.getData1();
                        int octave = (key / 12)-1;
                        int note = key % 12;
                        String noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();                        
                        
                        Note start_note = new Note(key); //create a note
                        start_note.setTickStart(event.getTick()); //set tick start

                        chord.addNote(start_note);
                        
                        ExistingNotesCache.put(key, chordNumber);// add to playing notes cache
                        
                        
                    } else if (sm.getCommand() == NOTE_OFF) {
                        int key = sm.getData1();
                        int octave = (key / 12)-1;
                        int note = key % 12;
                        String noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();                        
                        
                        int end_note_chord = findNoteInCache(key);
                        if(end_note_chord!=-1)
                            Chords.get(end_note_chord).getNoteByPitch(key).setTickEnd(event.getTick());       
                        
                        
                        
                    } 
                } 
                
                previousTick=event.getTick();
            }
            
            if(chord.getNotes().size()!=0){
                Chords.add(chord);
                chord = new Chord();
            }
            if (trackNumber == 3) {
                return Chords;
            }
        }
        return Chords;
    }
    
    private int findNoteInCache(int pitch){
        if(ExistingNotesCache.get(pitch)!=null){
            int number = ExistingNotesCache.get(pitch);
            ExistingNotesCache.remove(pitch);
            return number;
        }
        return -1;
    }
    
}
