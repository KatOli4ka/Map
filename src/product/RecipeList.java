package product;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes=new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть в списке!");
        }
        recipes.add(recipe);
    }
    public void deleteRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return "Список рецептов: " + recipes;
    }
}
