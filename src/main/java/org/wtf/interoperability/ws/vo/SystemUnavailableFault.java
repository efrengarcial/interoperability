
package org.wtf.interoperability.ws.vo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "system-unavailable-fault-message", targetNamespace = "http://example.com/tutotial/")
public class SystemUnavailableFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SystemUnavailableFaultMessage faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SystemUnavailableFault(String message, SystemUnavailableFaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SystemUnavailableFault(String message, SystemUnavailableFaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.wtf.interoperability.ws.vo.SystemUnavailableFaultMessage
     */
    public SystemUnavailableFaultMessage getFaultInfo() {
        return faultInfo;
    }

}
