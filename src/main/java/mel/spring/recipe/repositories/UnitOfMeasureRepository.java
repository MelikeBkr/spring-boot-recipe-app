package mel.spring.recipe.repositories;

import mel.spring.recipe.domain.Category;
import mel.spring.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>
{
    Optional<UnitOfMeasure> findByDescription(String description);
}
