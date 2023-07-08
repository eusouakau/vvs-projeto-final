package ifrs.dev.routes;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import ifrs.dev.models.Animal;
import ifrs.dev.services.CrudService;
import java.util.List;

@Path("/animals")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AnimalResource {

    @Inject
    private CrudService<Animal> animalService;

    @GET
    public List<Animal> getAllAnimals() {
        return animalService.getAll();
    }

    @GET
    @Path("/{id}")
    public Animal getAnimalById(@PathParam("id") Long id) {
        return animalService.getById(id);
    }

    @POST
    public void createAnimal(Animal animal) {
        animalService.create(animal);
    }

    @PUT
    @Path("/{id}")
    public void updateAnimal(@PathParam("id") Long id, Animal animal) {
        animal.setId(id);
        animalService.update(animal);
    }

    @DELETE
    @Path("/{id}")
    public void deleteAnimal(@PathParam("id") Long id) {
        animalService.delete(id);
    }
}
