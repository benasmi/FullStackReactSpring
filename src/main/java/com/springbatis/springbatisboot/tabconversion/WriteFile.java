/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbatis.springbatisboot.tabconversion;

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
    
    public String writeToFile(ArrayList<Tab> Tabs, int stringsCount){
        StringBuilder b = new StringBuilder();

            b.append("[");
            for(Tab tab : Tabs){
                b.append(" [");
                for(int i=0;i<stringsCount;i++){
                    if(tab.get(i)!=null){
                        b.append(" ["+(i+1)+","+tab.get(i).toString()+"]");
                    }
                }
                b.append(" ]");
            }
            b.append(" ]");

            return b.toString();
        }


}
