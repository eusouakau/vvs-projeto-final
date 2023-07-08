package ifrs.dev.repositories;

import javax.enterprise.context.ApplicationScoped;

import ifrs.dev.models.Tutor;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TutorRepository implements PanacheRepository<Tutor> {

    @Override
    public void persist(Tutor tutor) {
        persistAndFlush(tutor);
    }

    @Override
    public Tutor findById(Long id) {
        return findById(id);
    }

    public Tutor findByName(String name){
        return find("name", name).firstResult();
    }

    public Tutor findByEmail(String email){
        return find("email", email).firstResult();
    }
}
