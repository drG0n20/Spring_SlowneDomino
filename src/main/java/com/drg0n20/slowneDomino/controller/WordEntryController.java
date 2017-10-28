package com.drg0n20.slowneDomino.controller;

import com.drg0n20.slowneDomino.model.WordEntry;
import com.drg0n20.slowneDomino.service.WordEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/word-entry")
public class WordEntryController {

    @Autowired
    private WordEntryService wordEntryService;

    @GetMapping
    public List<WordEntry> findAll() {
        return wordEntryService.findAll();
    }

    @PutMapping("/{word}")
    public void addWord(@PathVariable String word) {
        wordEntryService.addWord(word);
    }

}
