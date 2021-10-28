package com.testepratico.Teste.service;

import com.testepratico.Teste.controller.request.DishRequest;
import com.testepratico.Teste.exceptions.DishNotFound;
import com.testepratico.Teste.model.Dish;
import com.testepratico.Teste.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService
{
    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }


    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public Dish findById(Long id) {
        return (Dish) dishRepository.findById(id).orElseThrow(DishNotFound::new);
    }

    public List<Dish> createDishesList(List<DishRequest> createDishesRequest) {
        List <Dish> newDishList = new ArrayList<>();
        Dish newDish;

        for(DishRequest dishRequest: createDishesRequest)
        {
            newDish = Dish.builder()
                    .name(dishRequest.getName())
                    .price(dishRequest.getPrice())
                    .build();
            dishRepository.save(newDish);
            newDishList.add(newDish);
        }
        return newDishList;
    }


    public Dish updateDish(Long id, String name, Long price)
    {
        Dish updateDish = this.findById(id);
        updateDish.setName(name);
        updateDish.setPrice(price);
        dishRepository.save(updateDish);
        return updateDish;
    }

    public void deleteById(Long id)
    {
        this.findById(id);
        dishRepository.deleteById(id);
    }
}
