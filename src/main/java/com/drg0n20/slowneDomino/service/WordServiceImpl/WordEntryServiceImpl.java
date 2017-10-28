package com.drg0n20.slowneDomino.service.WordServiceImpl;


import com.drg0n20.slowneDomino.model.WordEntry;
import com.drg0n20.slowneDomino.repositiories.WordEntryRepository;
import com.drg0n20.slowneDomino.service.WordEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WordEntryServiceImpl implements WordEntryService {

    @Autowired
    private WordEntryRepository wordEntryRepository;

    @Override
    public void addWord(String word) {
        WordEntry wordEntry = new WordEntry();
        wordEntry.setWord(word);
//        wordEntry.setDateTime(LocalDateTime.now());
        wordEntryRepository.save(wordEntry);
    }

    @Override
    public List<WordEntry> findAll() {
        return wordEntryRepository.findAll();
    }
}
