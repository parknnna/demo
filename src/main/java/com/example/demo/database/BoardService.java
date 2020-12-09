package com.example.demo.database;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	 

	@GetMapping("/users")
    public HashMap<String,List> hello() {
		HashMap<String,List> result = new HashMap<>();
		List<BoardEntity> list = boardRepository.findAll();
        result.put("message", list);

        return result;
	}
	
	@GetMapping("/user")
    public HashMap<String,Optional> user(@RequestParam("id") Long id) {
		HashMap<String,Optional> result = new HashMap<>();
		Optional<BoardEntity> list = boardRepository.findById(id);
        result.put("message", list);

        return result;
    }


}