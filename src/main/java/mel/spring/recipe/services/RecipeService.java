package mel.spring.recipe.services;

import mel.spring.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService
{
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
