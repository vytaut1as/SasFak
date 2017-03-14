
package lt.vtvpmc.ui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.entities.Saskaita;

public class SaskaituBeansai {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<Saskaita> getSaskaitaList() {
        Query q = entityManager.createQuery("select c from Client c");
        return q.getResultList();
    }
    
    @Transactional
    public void removeSaskaita(Saskaita saskaita) {
        entityManager.remove(entityManager.merge(saskaita));
    }
    
}
