package com.example.refremontbackend;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CasesService {
    List<Cases> casesList();

}
