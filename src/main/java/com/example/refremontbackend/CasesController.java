package com.example.refremontbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CasesController {
    @Autowired
    private CasesService casesService;

    @GetMapping
    public ResponseEntity<List<Cases>> getAllCases(){
        return new ResponseEntity<>(casesService.casesList(), HttpStatus.OK);
    }
}
