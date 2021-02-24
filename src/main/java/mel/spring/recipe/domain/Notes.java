package mel.spring.recipe.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //No need to specify cascade. Because if we delete the note object we do not want to
    //delete recipe object
    @OneToOne
    private Recipe recipe;
    //Lob: Large object field
    @Lob
    private String recipeNotes;
}
