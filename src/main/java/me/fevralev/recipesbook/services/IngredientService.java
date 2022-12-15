package me.fevralev.recipesbook.services;

import me.fevralev.recipesbook.model.Ingredient;

public interface IngredientService {
    Ingredient add(Ingredient ingr);
    Ingredient getById(int id);

}
