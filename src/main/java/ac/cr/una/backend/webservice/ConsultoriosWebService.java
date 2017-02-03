
package ac.cr.una.backend.webservice;
import ac.cr.una.backend.dao.ConsultorioDAOImpl;
import ac.cr.una.backend.dao.ConsultoriosDAO;
import ac.cr.una.backend.model.Consultorios;
import ac.cr.una.backend.service.ConsultoriosService;
import ac.cr.una.backend.service.ConsultoriosServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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

@Path("consultorios")
public class ConsultoriosWebService {
       @Context
    private UriInfo context;
       
       private ConsultoriosDAO consultoriosDAO;
       private ConsultoriosService consultoriosService;

    public ConsultoriosWebService() {
    }
       
       
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consultorios> getAllpacientes() {
        List<Consultorios> usuario = null;
        consultoriosDAO= new ConsultorioDAOImpl();
        consultoriosService = new ConsultoriosServiceImpl(consultoriosDAO);
        usuario = consultoriosService.getConsultoriosByid();

        return usuario;
    }
}
