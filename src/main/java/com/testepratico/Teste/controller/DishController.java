package com.testepratico.Teste.controller;

import com.testepratico.Teste.controller.request.DishRequest;
import com.testepratico.Teste.controller.response.DishResponse;
import com.testepratico.Teste.model.Dish;
import com.testepratico.Teste.service.DishService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DishController
{
    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/dishes")
    public List<DishResponse> getDishes()
    {
        List<Dish> dishes = dishService.findAll();
        List <DishResponse> dishResponse = new ArrayList<>();
        for (Dish dish: dishes)
        {
            dishResponse.add(new DishResponse().dishResponseResponse(dish));
        }

        return dishResponse;
    }

    @GetMapping ("/get-dish-by-id/{id}")
    public DishResponse getDishById(@PathVariable Long id)
    {
        Dish dish = dishService.findById(id);

        return new DishResponse().dishResponseResponse(dish);
    }

    @PostMapping(value = "/create-player")
    public List<Dish> createDishesList (@RequestBody List<DishRequest> createDishRequest) {
        return dishService.createDishesList(createDishRequest);

    }

    @PutMapping(value = "/dish-update/{id}")
    public Dish updateDish(@PathVariable(value = "id") Long id, @RequestBody DishRequest updateDishRequest) {
        return dishService.updateDish(id,updateDishRequest.getName(),updateDishRequest.getPrice());
    }

    }

    @DeleteMapping (value = "/dish-delete/{id}")
    public void deleteById(@PathVariable(value = "id") Long id)
    {
        dishService.deleteById(id);
    }