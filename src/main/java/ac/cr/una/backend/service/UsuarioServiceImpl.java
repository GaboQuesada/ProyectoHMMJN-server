package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.UsuarioDAO;
import ac.cr.una.backend.model.Usuario;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDAO usuarioDAO;

    /**
     *
     */
    public UsuarioServiceImpl() {
    }

    /**
     *
     * @param usuarioDAO
     */
    public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public Usuario usuarioCreate(Usuario usuario) {
        return usuarioDAO.usuarioCreate(usuario);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Usuario> usuarioGetAll() {
        return usuarioDAO.usuarioGetAll();
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public Usuario usuarioByname(String name) {
        return usuarioDAO.usuarioByname(name);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Usuario usuarioById(int id) {
        return usuarioDAO.usuarioById(id);
    }

    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public Usuario usuarioUpdate(Usuario usuario) {
        return usuarioDAO.usuarioUpdate(usuario);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public String usuarioDeleted(int id) {
        return usuarioDAO.usuarioDeleted(id);
    }

    /**
     *
     * @return
     */
    @Override
    public String usuarioDeleteAll() {
        return usuarioDAO.usuarioDeleteAll();
    }

    /**
     *
     * @return
     */
    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    /**
     *
     * @param usuarioDAO
     */
    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

}
