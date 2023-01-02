/**
 * StoresService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface StoresService extends javax.xml.rpc.Service {
    public java.lang.String getStoresAddress();

    public main.Stores getStores() throws javax.xml.rpc.ServiceException;

    public main.Stores getStores(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
