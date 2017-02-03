
package ac.cr.una.backend.webservice;
import ac.cr.una.backend.dao.EnfermedadesDAO;
import ac.cr.una.backend.dao.EnfermedadesDAOImpl;
import ac.cr.una.backend.model.Enfermedades;
import ac.cr.una.backend.service.EnfermedadesService;
import ac.cr.una.backend.service.EnfermedadesServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author Gabo Quesada
 */

@Path("enfermedades")
public class EnfermedadesWebservice {
    @Context
    private UriInfo context; 
    
    private EnfermedadesDAO enfermedadesDAO;
    private EnfermedadesService enfermedadesService;

    public EnfermedadesWebservice() {
    }
    
 @GET
    @Path("/allByid{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Enfermedades> getAllusuarios(@PathParam("id") int id) {
        List<Enfermedades> usuario = null;
        
        enfermedadesDAO = new EnfermedadesDAOImpl();
        enfermedadesService= new EnfermedadesServiceImpl(enfermedadesDAO);

        usuario = enfermedadesService.getObservacionesByid(id);

        return usuario;
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Enfermedades createUsuaruo(Enfermedades usuario) {

         enfermedadesDAO = new EnfermedadesDAOImpl();
        enfermedadesService= new EnfermedadesServiceImpl(enfermedadesDAO);

        usuario = enfermedadesService.createEnfermedades(usuario);

        return usuario;
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Enfermedades updateUsuario(Enfermedades usuario) {

        enfermedadesDAO = new EnfermedadesDAOImpl();
        enfermedadesService= new EnfermedadesServiceImpl(enfermedadesDAO);

        usuario = enfermedadesService.UpdateEnfermedades(usuario);

        return usuario;
    }
}
