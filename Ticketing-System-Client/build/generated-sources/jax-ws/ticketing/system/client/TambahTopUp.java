
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TambahTopUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TambahTopUp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jumlah" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="users_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TambahTopUp", propOrder = {
    "jumlah",
    "usersId"
})
public class TambahTopUp {

    protected double jumlah;
    @XmlElement(name = "users_id")
    protected int usersId;

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
     * Gets the value of the usersId property.
     * 
     */
    public int getUsersId() {
        return usersId;
    }

    /**
     * Sets the value of the usersId property.
     * 
     */
    public void setUsersId(int value) {
        this.usersId = value;
    }

}
