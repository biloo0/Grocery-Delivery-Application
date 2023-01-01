/**
 * StoresServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class StoresServiceLocator extends org.apache.axis.client.Service implements main.StoresService {

    public StoresServiceLocator() {
    }


    public StoresServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StoresServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Stores
    private java.lang.String Stores_address = "http://localhost:8080/GroceryDeliverySystem/services/Stores";

    public java.lang.String getStoresAddress() {
        return Stores_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StoresWSDDServiceName = "Stores";

    public java.lang.String getStoresWSDDServiceName() {
        return StoresWSDDServiceName;
    }

    public void setStoresWSDDServiceName(java.lang.String name) {
        StoresWSDDServiceName = name;
    }

    public main.Stores getStores() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Stores_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStores(endpoint);
    }

    public main.Stores getStores(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.StoresSoapBindingStub _stub = new main.StoresSoapBindingStub(portAddress, this);
            _stub.setPortName(getStoresWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStoresEndpointAddress(java.lang.String address) {
        Stores_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Stores.class.isAssignableFrom(serviceEndpointInterface)) {
                main.StoresSoapBindingStub _stub = new main.StoresSoapBindingStub(new java.net.URL(Stores_address), this);
                _stub.setPortName(getStoresWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Stores".equals(inputPortName)) {
            return getStores();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "StoresService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Stores"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Stores".equals(portName)) {
            setStoresEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
