
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyTransaksi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyTransaksi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jumlah" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="notaAcara" type="{http://server.com/}notaAcara" minOccurs="0"/&gt;
 *         &lt;element name="notaParkir" type="{http://server.com/}notaParkir" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://server.com/}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyTransaksi", propOrder = {
    "id",
    "jumlah",
    "notaAcara",
    "notaParkir",
    "user"
})
public class HistoryTransaksi {

    protected int id;
    protected double jumlah;
    protected NotaAcara notaAcara;
    protected NotaParkir notaParkir;
    protected User user;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the jumlah property.
     * 
     */
    public double getJumlah() {
        return jumlah;
    }

    /**
     * Sets the value of the jumlah property.
     * 
     */
    public void setJumlah(double value) {
        this.jumlah = value;
    }

    /**
     * Gets the value of the notaAcara property.
     * 
     * @return
     *     possible object is
     *     {@link NotaAcara }
     *     
     */
    public NotaAcara getNotaAcara() {
        return notaAcara;
    }

    /**
     * Sets the value of the notaAcara property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaAcara }
     *     
     */
    public void setNotaAcara(NotaAcara value) {
        this.notaAcara = value;
    }

    /**
     * Gets the value of the notaParkir property.
     * 
     * @return
     *     possible object is
     *     {@link NotaParkir }
     *     
     */
    public NotaParkir getNotaParkir() {
        return notaParkir;
    }

    /**
     * Sets the value of the notaParkir property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaParkir }
     *     
     */
    public void setNotaParkir(NotaParkir value) {
        this.notaParkir = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
