package com.example.cricketstats.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricketstats.dao.cricketresp;
import com.example.cricketstats.model.cricket;

@Service
public class cricketservice {


    @Autowired
    private cricketresp cr;
//select
    public List<cricket> get1() {
        return cr.findAll();
    }
//select particular
    public Optional<cricket> get2(Long id) {
        return cr.findById(id);
    }
//save
    public cricket get3(cricket cric) {
        return cr.save(cric);
    }
//delete
    public void get4(Long id) {
        cr.deleteById(id);
    }
}


