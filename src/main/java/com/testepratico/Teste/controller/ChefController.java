package com.testepratico.Teste.controller;

import com.testepratico.Teste.service.ChefService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChefController
{
    private final ChefService chefService;

    public ChefController(ChefService chefService) {
        this.chefService = chefService;
    }


}
