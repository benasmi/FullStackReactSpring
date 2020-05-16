/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;

/**
 *
 * @author Kukul
 */
public class Tab {
    
    private String[] tuning = new String[] {"E2", "A2", "D3", "G3", "B3", "E4"};
    private Integer[] strings;
    public int size;

    public Tab(String[] Tuning) {
        strings = new Integer[Tuning.length];
        tuning = Tuning;
        size = 0;
    }
    
    public Tab() {
        strings = new Integer[tuning.length];
        size = 0;
    }

    public void put(int index, int x)
    {
        strings[index] = x;
        size++;
    }
    
    public Integer get(int index)
    {
        if (index > 0 && index < tuning.length) {
            return strings[index];
        }
        return null;
    }
    
    public Integer getHighest()
    {
        Integer maxFret = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i] > maxFret) {
                maxFret = strings[i];
            }
        }
        return maxFret;
    }
    
    public Integer getLowest()
    {
        Integer minFret = 100;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i] < minFret) {
                minFret = strings[i];
            }
        }
        return minFret;
    }
    
    @Override
    public String toString()
    {
        String noteString = new String();
        noteString = "(";
        for (Integer s : strings)
        {
            if (s != null) {
                noteString += s + " ";
            }
            else noteString += "- ";
        }
        
        noteString += ")";
        return noteString;
    }
}
