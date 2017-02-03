package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.UsuarioDAO;
import ac.cr.una.backend.dao.UsuarioDAOImpl;
import ac.cr.una.backend.model.Usuario;
import ac.cr.una.backend.service.UsuarioService;
import ac.cr.una.backend.service.UsuarioServiceImpl;
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
@Path("usuarios")
public class UsuarioWebservice {

    @Context
    private UriInfo context;

    private UsuarioDAO usuarioDAO;
    private UsuarioService usuarioService;

    public UsuarioWebservice() {
    }

    @GET
    @Path("/byname{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getusuariosbyName(@PathParam("name") String name) {
        Usuario usuario = null;
        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);

        usuario = usuarioService.usuarioByname(name);

        return usuario;
    }
    
    @GET
    @Path("/byid{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getusuariosbyId(@PathParam("id") int id) {
        Usuario usuario = null;
        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);

        usuario = usuarioService.usuarioById(id);

        return usuario;
    }
    
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public  List<Usuario>  getAllusuarios() {
        List<Usuario> usuario = null;
        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);

        usuario = usuarioService.usuarioGetAll();

        return usuario;
    }

     
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario createUsuaruo(Usuario usuario) {

        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);

        usuario = usuarioService.usuarioCreate(usuario);

        return usuario;
    }
    
     @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario updateUsuario(Usuario usuario) {

        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);


        usuario = usuarioService.usuarioUpdate(usuario);

        return usuario;
    }
    
    @DELETE
    @Path("/delete{id}")
    public boolean  deleteUsuario(@PathParam("id") int id) {
        String result;
        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);

        result = usuarioService.usuarioDeleted(id);

        return true;
    }
    
    @DELETE
    @Path("/deleteall")
    public boolean   deleteAllUsuario() {
        String result;
        usuarioDAO = new UsuarioDAOImpl();
        usuarioService = new UsuarioServiceImpl(usuarioDAO);

        result = usuarioService.usuarioDeleteAll();

        return true;
    }
}
