package com.testepratico.Teste.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Dishes")

public class Dish

{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Price is mandatory")
    private Long price;

    @ManyToMany(mappedBy = "dishIngredients")
    private Set<Ingredients> ingredients;

    @ManyToOne
    @JoinColumn(name = "chef_id" )
    private Chef chef;
}
