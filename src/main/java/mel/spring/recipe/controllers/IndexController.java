package mel.spring.recipe.controllers;

import lombok.extern.slf4j.Slf4j;
import mel.spring.recipe.domain.Category;
import mel.spring.recipe.domain.UnitOfMeasure;
import mel.spring.recipe.repositories.CategoryRepository;
import mel.spring.recipe.repositories.UnitOfMeasureRepository;
import mel.spring.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController
{
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model)
    {
        log.debug("getting index page");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
