package com.drg0n20.slowneDomino.service;

import com.drg0n20.slowneDomino.model.WordEntry;

import java.util.List;

public interface WordEntryService {

    List<WordEntry> findAll();
    void addWord(String word);
}