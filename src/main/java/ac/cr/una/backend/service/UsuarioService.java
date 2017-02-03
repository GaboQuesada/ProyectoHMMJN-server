
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.UsuarioDAO;
import ac.cr.una.backend.model.Usuario;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public interface UsuarioService {
    
 
    public Usuario usuarioCreate(Usuario usuario);
    public List<Usuario> usuarioGetAll();
    public Usuario usuarioByname(String name);
    public Usuario usuarioById(int id);
    public Usuario usuarioUpdate(Usuario usuario);
    public String usuarioDeleted(int id);
    public String usuarioDeleteAll();
}
