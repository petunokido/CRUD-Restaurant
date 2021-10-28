package com.testepratico.Teste.service;

import com.testepratico.Teste.repository.ChefRepository;
import org.springframework.stereotype.Service;

@Service
public class ChefService
{
    private final ChefRepository chefRepository;

    public ChefService(ChefRepository chefRepository) {
        this.chefRepository = chefRepository;
    }
}
