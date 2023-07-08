package ifrs.dev.repositories;

import javax.enterprise.context.ApplicationScoped;

import ifrs.dev.models.Animal;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class AnimalRepository implements PanacheRepository<Animal> {

    @Override
    public void persist(Animal animal) {
        persistAndFlush(animal);
    }

    @Override
    public Animal findById(Long id) {
        return findById(id);
    }

}