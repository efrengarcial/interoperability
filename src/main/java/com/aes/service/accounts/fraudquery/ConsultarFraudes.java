
package com.aes.service.accounts.fraudquery;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ConsultarFraudes", targetNamespace = "http://com/aes/service/accounts/CardStatusInquiry", wsdlLocation = "file:/E:/java/git/jbossews/src/main/resources/wsdl/services/ConsultarFraudes.wsdl")
public class ConsultarFraudes
    extends Service
{

    private final static URL CONSULTARFRAUDES_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.aes.service.accounts.fraudquery.ConsultarFraudes.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.aes.service.accounts.fraudquery.ConsultarFraudes.class.getResource(".");
            url = new URL(baseUrl, "file:/E:/java/git/jbossews/src/main/resources/wsdl/services/ConsultarFraudes.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/E:/java/git/jbossews/src/main/resources/wsdl/services/ConsultarFraudes.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CONSULTARFRAUDES_WSDL_LOCATION = url;
    }

    public ConsultarFraudes(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarFraudes() {
        super(CONSULTARFRAUDES_WSDL_LOCATION, new QName("http://com/aes/service/accounts/CardStatusInquiry", "ConsultarFraudes"));
    }

    /**
     * 
     * @return
     *     returns IConsultarFraudes
     */
    @WebEndpoint(name = "WSHttpBinding_IConsultarFraudes")
    public IConsultarFraudes getWSHttpBindingIConsultarFraudes() {
        return super.getPort(new QName("http://com/aes/service/accounts/CardStatusInquiry", "WSHttpBinding_IConsultarFraudes"), IConsultarFraudes.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConsultarFraudes
     */
    @WebEndpoint(name = "WSHttpBinding_IConsultarFraudes")
    public IConsultarFraudes getWSHttpBindingIConsultarFraudes(WebServiceFeature... features) {
        return super.getPort(new QName("http://com/aes/service/accounts/CardStatusInquiry", "WSHttpBinding_IConsultarFraudes"), IConsultarFraudes.class, features);
    }

}