
package org.wtf.interoperability.ws.vo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "required-header-missing-fault-message", targetNamespace = "http://example.com/tutotial/")
public class RequiredHeaderMissingFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RequiredHeaderMissingFaultMessage faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RequiredHeaderMissingFault(String message, RequiredHeaderMissingFaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RequiredHeaderMissingFault(String message, RequiredHeaderMissingFaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.wtf.interoperability.ws.vo.RequiredHeaderMissingFaultMessage
     */
    public RequiredHeaderMissingFaultMessage getFaultInfo() {
        return faultInfo;
    }

}
