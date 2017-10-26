package com.drg0n20.slowneDomino.repositiories;

import com.drg0n20.slowneDomino.model.DominoEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DominoEntryRepository extends JpaRepository<DominoEntry, Long> {
}
