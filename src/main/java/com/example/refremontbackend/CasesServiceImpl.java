package com.example.refremontbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasesServiceImpl implements CasesService{
    @Autowired
    private CasesRepository casesRepository;

    @Override
    public List<Cases> casesList() {
        return casesRepository.findAll();
    }
}
