package com.testepratico.Teste.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Dishes")

public class Ingredients
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Salary is mandatory")
    private Long price;

    @ManyToMany
    @JoinTable(
            name = "dish_ingredients",
            joinColumns = @JoinColumn(name = "ingredients_id"),
            inverseJoinColumns = @JoinColumn(name = "dish_id")
    )
    private Set<Dish> dishIngredients;
}
