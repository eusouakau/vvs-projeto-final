package ifrs.dev.repositories;

import javax.enterprise.context.ApplicationScoped;

import ifrs.dev.models.Tutor;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TutorRepository implements PanacheRepository<Tutor> {

    public void persist(Tutor tutor) {
        persistAndFlush(tutor);
    }

    public Tutor findById(Long id) {
        return findById(id);
    }

}