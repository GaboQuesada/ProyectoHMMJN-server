
package ac.cr.una.backend.webservice;
import ac.cr.una.backend.dao.CitasDAO;
import ac.cr.una.backend.dao.CitasDAOImpl;
import ac.cr.una.backend.model.Citas;
import ac.cr.una.backend.service.CitasService;
import ac.cr.una.backend.service.CitasServiceImpl;
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

@Path("citas")
public class CitasWebservice {
   
    @Context
    private UriInfo context; 
    
    private CitasDAO citasDAO;
    private CitasService citasService;

    public CitasWebservice() {
    }
    
     @GET
    @Path("/allByid{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Citas> getAllCitasByID(@PathParam("id") int id) {
        List<Citas> usuario = null;
        
        citasDAO= new CitasDAOImpl();
        citasService= new CitasServiceImpl(citasDAO);

        usuario = citasService.getAllVitasById(id);

        return usuario;
    }
    
      @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Citas> getAllCitas() {
        List<Citas> usuario = null;
        
        citasDAO= new CitasDAOImpl();
        citasService= new CitasServiceImpl(citasDAO);

        usuario = citasService.getAllCitas();

        return usuario;
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Citas createCitas(Citas usuario) {

         citasDAO= new CitasDAOImpl();
        citasService= new CitasServiceImpl(citasDAO);

        usuario = citasService.createCita(usuario);

        return usuario;
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Citas updateCitas(Citas usuario) {

        citasDAO= new CitasDAOImpl();
        citasService= new CitasServiceImpl(citasDAO);

        usuario = citasService.update(usuario);

        return usuario;
    }
    
}
