/**
 * RiderDetailsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface RiderDetailsService extends javax.xml.rpc.Service {
    public java.lang.String getRiderDetailsAddress();

    public main.RiderDetails getRiderDetails() throws javax.xml.rpc.ServiceException;

    public main.RiderDetails getRiderDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
