
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slotParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slotParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="kode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkir" type="{http://server.com/}parkir" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slotParkir", propOrder = {
    "harga",
    "kode",
    "parkir"
})
public class SlotParkir {

    protected double harga;
    protected String kode;
    protected Parkir parkir;

    /**
     * Gets the value of the harga property.
     * 
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     */
    public void setHarga(double value) {
        this.harga = value;
    }

    /**
     * Gets the value of the kode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKode() {
        return kode;
    }

    /**
     * Sets the value of the kode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKode(String value) {
        this.kode = value;
    }

    /**
     * Gets the value of the parkir property.
     * 
     * @return
     *     possible object is
     *     {@link Parkir }
     *     
     */
    public Parkir getParkir() {
        return parkir;
    }

    /**
     * Sets the value of the parkir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parkir }
     *     
     */
    public void setParkir(Parkir value) {
        this.parkir = value;
    }

}
