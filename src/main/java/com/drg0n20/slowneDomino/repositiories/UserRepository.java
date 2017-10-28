package com.drg0n20.slowneDomino.repositiories;

import com.drg0n20.slowneDomino.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);
}