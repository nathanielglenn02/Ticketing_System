
package ticketing.system.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimTicketAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimTicketAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotaAcaraId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimTicketAcara", propOrder = {
    "notaAcaraId"
})
public class ClaimTicketAcara {

    @XmlElement(name = "NotaAcaraId")
    protected int notaAcaraId;

    /**
     * Gets the value of the notaAcaraId property.
     * 
     */
    public int getNotaAcaraId() {
        return notaAcaraId;
    }

    /**
     * Sets the value of the notaAcaraId property.
     * 
     */
    public void setNotaAcaraId(int value) {
        this.notaAcaraId = value;
    }

}
