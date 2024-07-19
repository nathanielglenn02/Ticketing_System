
package ticketing.system.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TicketingService", targetNamespace = "http://server.com/", wsdlLocation = "http://localhost:8080/Ticketing-System-Server/TicketingService?wsdl")
public class TicketingService_Service
    extends Service
{

    private final static URL TICKETINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETINGSERVICE_EXCEPTION;
    private final static QName TICKETINGSERVICE_QNAME = new QName("http://server.com/", "TicketingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Ticketing-System-Server/TicketingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETINGSERVICE_WSDL_LOCATION = url;
        TICKETINGSERVICE_EXCEPTION = e;
    }

    public TicketingService_Service() {
        super(__getWsdlLocation(), TICKETINGSERVICE_QNAME);
    }

    public TicketingService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETINGSERVICE_QNAME, features);
    }

    public TicketingService_Service(URL wsdlLocation) {
        super(wsdlLocation, TICKETINGSERVICE_QNAME);
    }

    public TicketingService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETINGSERVICE_QNAME, features);
    }

    public TicketingService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketingService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketingService
     */
    @WebEndpoint(name = "TicketingServicePort")
    public TicketingService getTicketingServicePort() {
        return super.getPort(new QName("http://server.com/", "TicketingServicePort"), TicketingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketingService
     */
    @WebEndpoint(name = "TicketingServicePort")
    public TicketingService getTicketingServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.com/", "TicketingServicePort"), TicketingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETINGSERVICE_EXCEPTION!= null) {
            throw TICKETINGSERVICE_EXCEPTION;
        }
        return TICKETINGSERVICE_WSDL_LOCATION;
    }

}
