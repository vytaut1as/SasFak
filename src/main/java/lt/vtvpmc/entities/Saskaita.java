package lt.vtvpmc.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Saskaita implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long isrNr;    
    private String isrData;      
    private String isrImone;    
    private String isrGavejas;

    public Saskaita() {
    }

    public Saskaita(String isrData, String isrImone, String isrGavejas) {
        this.isrData = isrData;
        this.isrImone = isrImone;
        this.isrGavejas = isrGavejas;
    }

	/**
	 * @return the isrNr
	 */
	public Long getIsrNr() {
		return isrNr;
	}

	/**
	 * @param isrNr the isrNr to set
	 */
	public void setIsrNr(Long isrNr) {
		this.isrNr = isrNr;
	}

	/**
	 * @return the isrData
	 */
	public String getIsrData() {
		return isrData;
	}

	/**
	 * @param isrData the isrData to set
	 */
	public void setIsrData(String isrData) {
		this.isrData = isrData;
	}

	/**
	 * @return the isrImone
	 */
	public String getIsrImone() {
		return isrImone;
	}

	/**
	 * @param isrImone the isrImone to set
	 */
	public void setIsrImone(String isrImone) {
		this.isrImone = isrImone;
	}

	/**
	 * @return the isrGavejas
	 */
	public String getIsrGavejas() {
		return isrGavejas;
	}

	/**
	 * @param isrGavejas the isrGavejas to set
	 */
	public void setIsrGavejas(String isrGavejas) {
		this.isrGavejas = isrGavejas;
	}
    

    
    
    
}
