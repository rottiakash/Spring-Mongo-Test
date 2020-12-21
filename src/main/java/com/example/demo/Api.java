package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Api {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping
    public List<Data> getAll() {
        List<Data> result = this.dataRepository.findAll();
        result.sort(new UsnComparator());
        return result;
    }

    @PostMapping
    public Data add(@RequestBody Data data) {
        return dataRepository.save(data);
    }

    @GetMapping("/student/{usn}")
    public Data getStudent(@PathVariable String usn) {
        return dataRepository.findByUsn(usn);
    }

    @GetMapping("/major")
    public List<Data> customStudent() {
        return dataRepository.major();
    }
}
