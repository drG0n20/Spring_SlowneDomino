package com.drg0n20.slowneDomino.controller;

import com.drg0n20.slowneDomino.dto.DominoDto;
import com.drg0n20.slowneDomino.model.DominoEntry;
import com.drg0n20.slowneDomino.service.DominoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/domino")
public class DominoController {

    @Autowired
    private DominoService dominoService;

    @GetMapping("/{word}")
    public DominoDto addedWords(@PathVariable String word){
        return dominoService.getWords(word);
    }

    @GetMapping
    public List<DominoEntry> findAll(){
        return dominoService.getAll();
    }

    @GetMapping("/page")
    public Page<DominoEntry> getPage(@RequestParam(name = "size", defaultValue = "5") Integer pageSize,
                                               @RequestParam(name = "index", defaultValue = "1") Integer pageNumber,
                                               @RequestParam(name = "sortDirection", defaultValue = "ASC") Sort.Direction sortDirection,
                                               @RequestParam(name = "sortProperties", defaultValue = "id") String property) {

        Pageable page = new PageRequest(pageNumber, pageSize, sortDirection, property);
        return dominoService.getPage(page);
    }
}
