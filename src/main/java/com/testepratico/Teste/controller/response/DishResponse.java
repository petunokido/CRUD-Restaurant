package com.testepratico.Teste.controller.response;

import com.testepratico.Teste.model.Chef;
import com.testepratico.Teste.model.Dish;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DishResponse
{

    private Long id;

    private String name;

    private Long price;

    private Long ingredientsId;

    private Long chefId;

    public DishResponse dishResponseResponse (Dish dish)
    {
        this.id = dish.getId();
        this.name = dish.getName();
        this.price = dish.getPrice();
        this.ingredientsId = getIngredientsId();
        this.chefId = getChefId();
        return this;
    }
}
