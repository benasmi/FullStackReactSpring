package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.tabconversion.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@RestController
@RequestMapping("/midiconversion")
class PhotoConversion {

    @PostMapping("/convert")
    public String getPaymentsByReservation(@RequestBody MultipartFile file){

        InputRead iRead = new InputRead();
        NoteID converter = new NoteID();
        ArrayList<Chord> chords = null;
        try {
            chords = iRead.readFile(file.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WriteFile writer = new WriteFile();

        return writer.writeToFile(converter.findTabs(chords), 6);

    }

    class TabChord{
        public ArrayList<Tab> tab;
        public ArrayList<Chord> chord;


        public TabChord(ArrayList<Tab> tab, ArrayList<Chord> chord) {
            this.tab = tab;
            this.chord = chord;
        }

        public ArrayList<Tab> getTab() {
            return tab;
        }

        public void setTab(ArrayList<Tab> tab) {
            this.tab = tab;
        }

        public ArrayList<Chord> getChord() {
            return chord;
        }

        public void setChord(ArrayList<Chord> chord) {
            this.chord = chord;
        }
    }
}