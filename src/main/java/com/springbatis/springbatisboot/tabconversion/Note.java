/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;

/**
 *
 * @author Karolis
 */
public class Note implements Comparable<Note>{
    
    private int pitch;
    private long tickStart;
    private long tickEnd;
    
    public Note(){
        tickStart=-1;
        tickEnd=-1;
        pitch=-1;
    }
    
    public Note(int pitch){
        this.pitch=pitch;
        tickStart=-1;
        tickEnd=-1;
        pitch=-1;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public int compareTo(Note t) {
        int compare = (pitch > t.pitch) ? 1 : 0;
        if(compare == 0){
            compare = (pitch == t.pitch) ? 0 : -1;
        }
        return compare;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(pitch);
    }
    
    public long getTickStart() {
        return tickStart;
    }

    public long getTickEnd() {
        return tickEnd;
    }
    
    public void setTickStart(long tickStart) {
        this.tickStart = tickStart;
    }

    public void setTickEnd(long tickEnd) {
        this.tickEnd = tickEnd;
    }
    
    public long getTickLength(){
        return tickEnd-tickStart;
    }
    
    
    
}
