package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.ObservacionesDAO;
import ac.cr.una.backend.dao.ObservacionesDAOImpl;
import ac.cr.una.backend.model.Observaciones;
import ac.cr.una.backend.service.ObservacionesService;
import ac.cr.una.backend.service.ObservacionesServiceImpl;
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

@Path("observaciones")
public class ObservacionesWebservice {

    @Context
    private UriInfo context;

    private ObservacionesDAO observacionesDAO;
    private ObservacionesService observacionesService;

    public ObservacionesWebservice() {
    }

    @GET
    @Path("/allByid{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Observaciones> getAllusuarios(@PathParam("id") int id) {
        List<Observaciones> usuario = null;
        observacionesDAO = new ObservacionesDAOImpl();
        observacionesService = new ObservacionesServiceImpl(observacionesDAO);

        usuario = observacionesService.getObservacionesByid(id);

        return usuario;
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Observaciones createUsuaruo(Observaciones usuario) {

        observacionesDAO = new ObservacionesDAOImpl();
        observacionesService = new ObservacionesServiceImpl(observacionesDAO);

        usuario = observacionesService.createObservaciones(usuario);

        return usuario;
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Observaciones updateUsuario(Observaciones usuario) {

        observacionesDAO = new ObservacionesDAOImpl();
        observacionesService = new ObservacionesServiceImpl(observacionesDAO);

        usuario = observacionesService.UpdateObservaciones(usuario);

        return usuario;
    }
}
