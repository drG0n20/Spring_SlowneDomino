package com.drg0n20.slowneDomino.service.DominoServiceImpl;

import com.drg0n20.slowneDomino.Application;
import com.drg0n20.slowneDomino.dto.DominoDto;
import com.drg0n20.slowneDomino.model.DominoEntry;
import com.drg0n20.slowneDomino.repositiories.DominoEntryRepository;
import com.drg0n20.slowneDomino.service.DominoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@EntityScan(
        basePackageClasses = {Application.class, Jsr310JpaConverters.class}
)

@Service
public class DominoServiceImpl implements DominoService {

    @Autowired
    private DominoEntryRepository dominoEntryRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<DominoEntry> getAll() {
        return dominoEntryRepository.findAll();
    }

    @Override
    public DominoDto getWords(String word) {
        return null;
    }

    @Override
    public Page<DominoEntry> getPage(Pageable page) {
        return dominoEntryRepository.findAll(page);
    }

//    @Override
//    DominoDto getWordsSaved(String word) {
//        DominoDto result = new DominoDto();
//        result.setWord(word);
//        DominoEntry dominoEntry = new DominoEntry();
//        dominoEntry.setWord(word);
//        dominoEntryRepository.save(dominoEntry);
//        return result;
//    }
}
