package com.testepratico.Teste.controller.response;

import com.testepratico.Teste.model.Dish;
import com.testepratico.Teste.model.Ingredients;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class IngredientsResponse
{
    private Long id;
    private String name;
    private Long price;
    private Long dishId;

    public IngredientsResponse ingredientsResponse(Ingredients ingredients)
    {
        this.id = ingredients.getId();
        this.name = ingredients.getName();
        this.price = ingredients.getPrice();
        this.dishId = getDishId();
        return this;
    }
}
