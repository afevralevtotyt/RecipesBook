package me.fevralev.recipesbook.services.impl;

import me.fevralev.recipesbook.model.Ingredient;
import me.fevralev.recipesbook.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private int id = 0;
    private Map<Integer, Ingredient> ingredientBook= new HashMap<>();

    @Override
    public Ingredient add(Ingredient ingr) {
        ingredientBook.put(id++, ingr);
        return ingr;
    }

    @Override
    public Ingredient getById(int id) {
        return ingredientBook.get(id);
    }
}
