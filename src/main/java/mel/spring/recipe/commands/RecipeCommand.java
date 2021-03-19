package mel.spring.recipe.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mel.spring.recipe.domain.Difficulty;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.URL;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand
{
    private Long id;

    @Size(min = 3, max = 255)
    private String description;

    @Min(1)
    @Max(999)
    private Integer prepTime;

    @Min(1)
    @Max(999)
    private Integer cookTime;

    @Min(1)
    @Max(100)
    private Integer servings;
    private String source;

    //@URL
    private String url;

    @NotEmpty(message = "Please enter directions")
    private String directions;

    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Byte[] image;
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
}
