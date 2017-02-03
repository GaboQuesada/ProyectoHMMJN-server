
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.InfoDAO;
import ac.cr.una.backend.dao.InfoDAOImpl;
import ac.cr.una.backend.model.Info;
import ac.cr.una.backend.service.InfoService;
import ac.cr.una.backend.service.InfoServiceImpl;
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

@Path("info")
public class InfoWebservice {
    
    @Context
    private UriInfo context;
    
    private InfoDAO infoDAO;
    private InfoService infoService;

    public InfoWebservice() {
    }
    
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public  List<Info>  getAllInfo() {
        List<Info> infolist = null;
        infoDAO = new InfoDAOImpl();
        infoService = new InfoServiceImpl(infoDAO);

        infolist = infoService.infoGetAll();

        return infolist;
    }
    
    
    @GET
    @Path("/allByid{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  List<Info>  getAllInfoByID(@PathParam("id") int id)  {
        List<Info> infolist = null;
        infoDAO = new InfoDAOImpl();
        infoService = new InfoServiceImpl(infoDAO);

        infolist = infoService.infoGetAllByUsuario(id);

        return infolist;
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Info createUsuaruo(Info info) {

        infoDAO = new InfoDAOImpl();
        infoService = new InfoServiceImpl(infoDAO);


        info = infoService.infocreate(info);
        return info;
    }
    
    @DELETE
    @Path("/delete{id}")
    public boolean  deleteUsuario(@PathParam("id") int id) {
        boolean result;
         infoDAO = new InfoDAOImpl();
        infoService = new InfoServiceImpl(infoDAO);

        result = infoService.infoDeleteByUsuario(id);

        return true;
    }
    
   
    
}
