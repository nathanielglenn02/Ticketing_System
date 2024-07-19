
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jamParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jamParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jam_mulai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jam_selesai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jamParkir", propOrder = {
    "id",
    "jamMulai",
    "jamSelesai"
})
public class JamParkir {

    protected int id;
    @XmlElement(name = "jam_mulai")
    protected String jamMulai;
    @XmlElement(name = "jam_selesai")
    protected String jamSelesai;

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
     * Gets the value of the jamMulai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJamMulai() {
        return jamMulai;
    }

    /**
     * Sets the value of the jamMulai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJamMulai(String value) {
        this.jamMulai = value;
    }

    /**
     * Gets the value of the jamSelesai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJamSelesai() {
        return jamSelesai;
    }

    /**
     * Sets the value of the jamSelesai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJamSelesai(String value) {
        this.jamSelesai = value;
    }

}
