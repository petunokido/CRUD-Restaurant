package com.testepratico.Teste.controller.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DishRequest
{

    private String name;
    private Long price;

}
