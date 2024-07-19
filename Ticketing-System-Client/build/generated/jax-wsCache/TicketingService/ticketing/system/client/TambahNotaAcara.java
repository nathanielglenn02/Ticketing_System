
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TambahNotaAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TambahNotaAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAcara" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jumlah" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TambahNotaAcara", propOrder = {
    "idUser",
    "idAcara",
    "jumlah"
})
public class TambahNotaAcara {

    protected int idUser;
    protected int idAcara;
    protected int jumlah;

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the idAcara property.
     * 
     */
    public int getIdAcara() {
        return idAcara;
    }

    /**
     * Sets the value of the idAcara property.
     * 
     */
    public void setIdAcara(int value) {
        this.idAcara = value;
    }

    /**
     * Gets the value of the jumlah property.
     * 
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * Sets the value of the jumlah property.
     * 
     */
    public void setJumlah(int value) {
        this.jumlah = value;
    }

}
