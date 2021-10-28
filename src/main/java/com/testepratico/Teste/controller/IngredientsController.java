package com.testepratico.Teste.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientsController
{
    private final IngredientsController ingredientsController;

    public IngredientsController(IngredientsController ingredientsController) {
        this.ingredientsController = ingredientsController;
    }


}
