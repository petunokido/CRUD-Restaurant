package com.testepratico.Teste.controller.response;

import com.testepratico.Teste.model.Chef;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ChefResponse
{
    private Long id;
    private String name;
    private Long salary;

    public ChefResponse chefResponse(Chef chef)
    {
        this.id = chef.getId();
        this.name = chef.getName();
        this.salary = chef.getSalary();
        return this;
    }
}
