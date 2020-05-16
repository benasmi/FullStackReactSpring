package com.springbatis.springbatisboot.Controllers;

import com.springbatis.springbatisboot.Mappers.PaymentMapper;
import com.springbatis.springbatisboot.Models.Payment;
import com.springbatis.springbatisboot.Models.ReservationId;
import com.springbatis.springbatisboot.tabconversion.Chord;
import com.springbatis.springbatisboot.tabconversion.InputRead;
import com.springbatis.springbatisboot.tabconversion.NoteID;
import com.springbatis.springbatisboot.tabconversion.Tab;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/midiconversion")
class PhotoConversion {

    @PostMapping("/convert")
    public ArrayList<Tab> getPaymentsByReservation(@RequestBody MultipartFile file){

        InputRead iRead = new InputRead();
        NoteID converter = new NoteID();
        ArrayList<Chord> chords = null;
        try {
            chords = iRead.readFile(file.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder b = new StringBuilder();
        ArrayList<Tab> tabs = converter.findTabs(chords);
        for (int i = 0; i < chords.size(); i++) {
            //System.out.println(chords.get(i) + "\t\t" + tabs.get(i));
            b.append(chords.get(i) + "\t\t" + tabs.get(i));
        }

        return tabs;

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