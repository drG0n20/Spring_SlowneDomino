package com.drg0n20.slowneDomino.service;

import com.drg0n20.slowneDomino.dto.DominoDto;
import com.drg0n20.slowneDomino.model.DominoEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DominoService {

    List<DominoEntry> getAll();

    DominoDto getWords(String word);

    Page<DominoEntry> getPage(Pageable page);
}
