
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notaParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jam_parkir" type="{http://server.com/}jamParkir" minOccurs="0"/&gt;
 *         &lt;element name="slot_parkir" type="{http://server.com/}slotParkir" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_booking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_transaksi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "notaParkir", propOrder = {
    "harga",
    "id",
    "jamParkir",
    "slotParkir",
    "tanggalBooking",
    "tanggalTransaksi",
    "user"
})
public class NotaParkir {

    protected Double harga;
    protected int id;
    @XmlElement(name = "jam_parkir")
    protected JamParkir jamParkir;
    @XmlElement(name = "slot_parkir")
    protected SlotParkir slotParkir;
    @XmlElement(name = "tanggal_booking")
    protected String tanggalBooking;
    @XmlElement(name = "tanggal_transaksi")
    protected String tanggalTransaksi;
    protected User user;

    /**
     * Gets the value of the harga property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHarga(Double value) {
        this.harga = value;
    }

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
     * Gets the value of the jamParkir property.
     * 
     * @return
     *     possible object is
     *     {@link JamParkir }
     *     
     */
    public JamParkir getJamParkir() {
        return jamParkir;
    }

    /**
     * Sets the value of the jamParkir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JamParkir }
     *     
     */
    public void setJamParkir(JamParkir value) {
        this.jamParkir = value;
    }

    /**
     * Gets the value of the slotParkir property.
     * 
     * @return
     *     possible object is
     *     {@link SlotParkir }
     *     
     */
    public SlotParkir getSlotParkir() {
        return slotParkir;
    }

    /**
     * Sets the value of the slotParkir property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotParkir }
     *     
     */
    public void setSlotParkir(SlotParkir value) {
        this.slotParkir = value;
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

    /**
     * Gets the value of the tanggalTransaksi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    /**
     * Sets the value of the tanggalTransaksi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalTransaksi(String value) {
        this.tanggalTransaksi = value;
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
