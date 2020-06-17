package guru.springframework.controllers;

import guru.springframework.services.RecipeService;

public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

}
