package lt.vtvpmc.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.entities.Saskaita;




public class NewSaskaituBeansai {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private String isrData;      
    private String isrImone;    
    private String isrGavejas;
    
    @Transactional
    public String save() {
    	Saskaita saskaita = new Saskaita(isrData, isrImone, isrGavejas);
        entityManager.persist(saskaita);
        return "main";
    }
	public String getIsrData() {
		return isrData;
	}
	public void setIsrData(String isrData) {
		this.isrData = isrData;
	}
	public String getIsrImone() {
		return isrImone;
	}
	public void setIsrImone(String isrImone) {
		this.isrImone = isrImone;
	}
	public String getIsrGavejas() {
		return isrGavejas;
	}
	public void setIsrGavejas(String isrGavejas) {
		this.isrGavejas = isrGavejas;
	}
    
}
