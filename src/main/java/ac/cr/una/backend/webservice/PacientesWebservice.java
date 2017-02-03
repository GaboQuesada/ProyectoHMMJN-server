package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.PacientesDAO;
import ac.cr.una.backend.dao.PacientesDAOImpl;
import ac.cr.una.backend.model.Pacientes;
import ac.cr.una.backend.service.PacientesService;
import ac.cr.una.backend.service.PacientesServiceImpl;
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
@Path("pacientes")
public class PacientesWebservice {

    @Context
    private UriInfo context;

    private PacientesDAO pacientesDAO;
    private PacientesService pacienteService;

    public PacientesWebservice() {
    }

    // crud
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pacientes createPaciente(Pacientes usuario) {

        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);

        usuario = pacienteService.PacientesCreate(usuario);

        return usuario;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pacientes> getAllpacientes() {
        List<Pacientes> usuario = null;
        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);
        usuario = pacienteService.PacientesGetAll();

        return usuario;
    }

    @GET
    @Path("/byname{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pacientes getPacientesByName(@PathParam("name") String name) {
        Pacientes usuario = null;
        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);

        usuario = pacienteService.PacientesByname(name);

        return usuario;
    }

    @GET
    @Path("/byid{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pacientes getPacientesById(@PathParam("id") int id) {
        Pacientes usuario = null;
        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);

        usuario = pacienteService.PacientesById(id);

        return usuario;
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pacientes updatePaciente(Pacientes usuario) {

        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);

        usuario = pacienteService.PacientesUpdate(usuario);

        return usuario;
    }

    @DELETE
    @Path("/delete{id}")
    public boolean deletePacienteById(@PathParam("id") int id) {
        boolean result;
        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);

        result = pacienteService.PacientesDeleted(id);

        return true;
    }

    @DELETE
    @Path("/deleteall")
    public boolean deleteAllPaciente() {
        boolean result;
        pacientesDAO = new PacientesDAOImpl();
        pacienteService = new PacientesServiceImpl(pacientesDAO);

        result = pacienteService.PacientesDeleteAll();

        return true;
    }
}
