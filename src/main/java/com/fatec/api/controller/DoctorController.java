package com.fatec.api.controller;

import com.fatec.api.model.bean.Doctor;
import com.fatec.api.model.dao.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor) {
        repository.save(doctor);

        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
    }

    @GetMapping
    public void read() {

    }

    @PutMapping
    public void update() {

    }

    @DeleteMapping
    public void delete() {

    }
}
