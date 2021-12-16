package com.example.sping_portfolio.individual.sam.controllers;

import com.example.sping_portfolio.individual.sam.data.music;
import com.example.sping_portfolio.individual.sam.data.music_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class sam {
    @Autowired
    private music_service db;

    @GetMapping("/sam")
    public String sam() {
        return "sam";
    }

    //database
    @GetMapping("/sam/music")
    public String music(Model model) {
        List<music> list = db.listAll();

        model.addAttribute("music_query", list);

        return "samdb";
    }

    @PostMapping("/sam/music")
    public String music_comit(@RequestParam("song") String song,
                                 @RequestParam("artist") String artist) {

        music entry = new music();
        entry.setSong(song);
        entry.setArtist(artist);

        db.commit(entry);
        return "redirect:/sam/music";
    }
}