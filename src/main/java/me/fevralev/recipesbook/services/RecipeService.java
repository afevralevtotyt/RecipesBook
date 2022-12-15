package me.fevralev.recipesbook.services;


import me.fevralev.recipesbook.model.Recipe;

public interface RecipeService {


    Recipe add(Recipe recipe);
    Recipe getById(int id);
}
