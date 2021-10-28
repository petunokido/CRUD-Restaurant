package com.testepratico.Teste.service;

import com.testepratico.Teste.controller.IngredientsController;
import org.springframework.stereotype.Service;

@Service
public class IngredientsService
{
    private final IngredientsController ingredientsRepository;

    public IngredientsService(IngredientsController ingredientsRepository) {
        this.ingredientsRepository = ingredientsRepository;
    }
}
