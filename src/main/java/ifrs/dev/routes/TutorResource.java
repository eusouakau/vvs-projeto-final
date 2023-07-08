package ifrs.dev.routes;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import ifrs.dev.models.Tutor;
import ifrs.dev.services.CrudService;

@Path("/tutors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TutorResource {

    @Inject
    private CrudService<Tutor> tutorService;

    @GET
    public List<Tutor> getAllTutors() {
        return tutorService.getAll();
    }

    @GET
    @Path("/{id}")
    public Tutor getTutorById(@PathParam("id") Long id) {
        return tutorService.getById(id);
    }

    @POST
    public void createTutor(Tutor tutor) {
        tutorService.create(tutor);
    }

    @PUT
    @Path("/{id}")
    public void updateTutor(@PathParam("id") Long id, Tutor tutor) {
        tutor.setId(id);
        tutorService.update(tutor);
    }

    @DELETE
    @Path("/{id}")
    public void deleteTutor(@PathParam("id") Long id) {
        tutorService.delete(id);
    }
}
