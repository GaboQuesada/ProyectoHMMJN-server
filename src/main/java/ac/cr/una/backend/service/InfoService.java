
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Info;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public interface InfoService {
    
    public Info infocreate(Info info);
    public List<Info> infoGetAll();
    public List<Info> infoGetAllByUsuario(int id);
    public boolean  infoDeleteByUsuario(int id);
}
