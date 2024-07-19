
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notaAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acara" type="{http://server.com/}acara" minOccurs="0"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jumlah" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_Transaksi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "notaAcara", propOrder = {
    "acara",
    "harga",
    "id",
    "jumlah",
    "status",
    "tanggalTransaksi",
    "user"
})
public class NotaAcara {

    protected Acara acara;
    protected double harga;
    protected int id;
    protected int jumlah;
    protected Boolean status;
    @XmlElement(name = "tanggal_Transaksi")
    protected String tanggalTransaksi;
    protected User user;

    /**
     * Gets the value of the acara property.
     * 
     * @return
     *     possible object is
     *     {@link Acara }
     *     
     */
    public Acara getAcara() {
        return acara;
    }

    /**
     * Sets the value of the acara property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acara }
     *     
     */
    public void setAcara(Acara value) {
        this.acara = value;
    }

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
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
