package com.example.cricketstats.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cricketstats.model.*;
import com.example.cricketstats.service.*;

@RestController
@RequestMapping("/cricket")

public class Homecontroller {

	

	    @Autowired
	    private cricketservice s;

	    @GetMapping
	    public List<cricket> set1() {
	        return s.get1();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<cricket> set2(@PathVariable Long id) {
	        Optional<cricket> stat= s.get2(id);
	        return stat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public ResponseEntity<cricket> set3(@RequestBody cricket cric) {
	    	cricket savedstat = s.get3(cric);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedstat);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<cricket> set4(@PathVariable Long id, @RequestBody cricket cric) {
	        if (!s.get2(id).isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        cric.setId(id);
	        cricket updatedstat = s.get3(cric);
	        return ResponseEntity.ok(updatedstat);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> set5(@PathVariable Long id) {
	        if (!s.get2(id).isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        s.get4(id);
	        return ResponseEntity.noContent().build();
	    }
	}


