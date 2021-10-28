package com.testepratico.Teste.exceptions;

public class DishNotFound extends RuntimeException{

    public DishNotFound()
    {
        super("Dish not found");
    }
}
