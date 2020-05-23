/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;


import com.springbatis.springbatisboot.Models.TabUnit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Karolis
 */
public class WriteFile {
    
    private String name = "";
    
    private void createFile(String name){
        try{
            File file = new File(name);
            if(file.createNewFile()){
                System.out.println("File successfully created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An error in file creation occured");
        }
    }
    
    public ArrayList<ArrayList<TabUnit>> writeToFile(ArrayList<Tab> Tabs, int stringsCount){
        //StringBuilder b = new StringBuilder();

            //b.append("[");
            ArrayList<ArrayList<TabUnit>> mainList = new ArrayList<>();
            for(Tab tab : Tabs){
                //b.append(" [");
                ArrayList<TabUnit> tmp = new ArrayList<>();
                for(int i=0;i<stringsCount;i++){
                    if(tab.get(i)!=null){
                        tmp.add(new TabUnit(i+1,tab.get(i)));
                        //tmp.add(i+1);
                        //tmp.add(tab.get(i));
                       // b.append(" ["+(i+1)+","+tab.get(i).toString()+"]");
                    }
                }
                mainList.add(tmp);
                //b.append(" ]");
            }
            //b.append(" ]");
            return mainList;
        }


}


