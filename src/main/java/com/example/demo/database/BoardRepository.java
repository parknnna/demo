package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}