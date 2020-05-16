/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Karolis
 */
public class Chord {
    
    private ArrayList<Note> Notes;
    public int size;
    
    public Chord(){
        Notes = new ArrayList<Note>();
        size = 0;
    }
    
    public Chord(ArrayList<Note> Notes){
        this.Notes=Notes;
        size = 0;
    }

    public ArrayList<Note> getNotes() {
        return Notes;
    }
    
    public Note getNote(int index){
        if(index<Notes.size()){
            return Notes.get(index);
        }
        return null; 
    }
    
    public Note getNoteByPitch(int pitch){
        for(Note note : Notes){
            if(note.getPitch()==pitch){
                return note;
            }
        }
        return null; 
    }
    
    public void addNote(Note note){
        Notes.add(note);
        size++;
    }
    
    public void sortChord(boolean ascending)
    {
        if (ascending) {
            Collections.sort(Notes);
        }
        else Collections.sort(Notes, Collections.reverseOrder()); 
    }
    @Override
    public String toString()
    {
        String noteString = new String();
        noteString = "(";
        for (Note n : Notes)
        {
            noteString += n + " ";
        }
        
        noteString += ")";
        return noteString;
    }
}
