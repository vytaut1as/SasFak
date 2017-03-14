
package lt.vtvpmc.ui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.entities.Client;

/**
 *
 * @author giedrius
 */
public class ClientListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<Client> getClientList() {
        Query q = entityManager.createQuery("select c from Client c");
        return q.getResultList();
    }
    
    @Transactional
    public void removeClient(Client client) {
        entityManager.remove(entityManager.merge(client));
    }
    
}
