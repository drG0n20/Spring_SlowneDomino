package com.drg0n20.slowneDomino.repositiories;

import com.drg0n20.slowneDomino.model.WordEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordEntryRepository extends JpaRepository<WordEntry, Long> {
}
