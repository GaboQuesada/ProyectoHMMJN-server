package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.InfoDAO;
import ac.cr.una.backend.model.Info;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */
public class InfoServiceImpl implements InfoService {

    private InfoDAO infoDAO;

    public InfoServiceImpl() {
    }

    public InfoServiceImpl(InfoDAO infoDAO) {
        this.infoDAO = infoDAO;
    }

    @Override
    public Info infocreate(Info info) {
        return infoDAO.infocreate(info);
    }

    @Override
    public List<Info> infoGetAll() {
        return infoDAO.infoGetAll();
    }

    @Override
    public List<Info> infoGetAllByUsuario(int id) {
        return infoDAO.infoGetAllByUsuario(id);
    }

    @Override
    public boolean infoDeleteByUsuario(int id) {
        return infoDAO.infoDeleteByUsuario(id);
    }

    public InfoDAO getInfoDAO() {
        return infoDAO;
    }

    public void setInfoDAO(InfoDAO infoDAO) {
        this.infoDAO = infoDAO;
    }

}
