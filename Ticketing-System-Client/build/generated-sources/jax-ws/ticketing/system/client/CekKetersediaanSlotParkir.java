
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CekKetersediaanSlotParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CekKetersediaanSlotParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkir_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="kode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jam_parkir_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tanggal_booking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CekKetersediaanSlotParkir", propOrder = {
    "parkirId",
    "kode",
    "jamParkirId",
    "tanggalBooking"
})
public class CekKetersediaanSlotParkir {

    @XmlElement(name = "parkir_id")
    protected int parkirId;
    protected String kode;
    @XmlElement(name = "jam_parkir_id")
    protected int jamParkirId;
    @XmlElement(name = "tanggal_booking")
    protected String tanggalBooking;

    /**
     * Gets the value of the parkirId property.
     * 
     */
    public int getParkirId() {
        return parkirId;
    }

    /**
     * Sets the value of the parkirId property.
     * 
     */
    public void setParkirId(int value) {
        this.parkirId = value;
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
     * Gets the value of the jamParkirId property.
     * 
     */
    public int getJamParkirId() {
        return jamParkirId;
    }

    /**
     * Sets the value of the jamParkirId property.
     * 
     */
    public void setJamParkirId(int value) {
        this.jamParkirId = value;
    }

    /**
     * Gets the value of the tanggalBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalBooking() {
        return tanggalBooking;
    }

    /**
     * Sets the value of the tanggalBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalBooking(String value) {
        this.tanggalBooking = value;
    }

}
