/**
 * PkgsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class PkgsServiceLocator extends org.apache.axis.client.Service implements main.PkgsService {

    public PkgsServiceLocator() {
    }


    public PkgsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PkgsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Pkgs
    private java.lang.String Pkgs_address = "http://localhost:8080/GroceryDeliverySystem/services/Pkgs";

    public java.lang.String getPkgsAddress() {
        return Pkgs_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PkgsWSDDServiceName = "Pkgs";

    public java.lang.String getPkgsWSDDServiceName() {
        return PkgsWSDDServiceName;
    }

    public void setPkgsWSDDServiceName(java.lang.String name) {
        PkgsWSDDServiceName = name;
    }

    public main.Pkgs getPkgs() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Pkgs_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPkgs(endpoint);
    }

    public main.Pkgs getPkgs(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.PkgsSoapBindingStub _stub = new main.PkgsSoapBindingStub(portAddress, this);
            _stub.setPortName(getPkgsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPkgsEndpointAddress(java.lang.String address) {
        Pkgs_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Pkgs.class.isAssignableFrom(serviceEndpointInterface)) {
                main.PkgsSoapBindingStub _stub = new main.PkgsSoapBindingStub(new java.net.URL(Pkgs_address), this);
                _stub.setPortName(getPkgsWSDDServiceName());
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
        if ("Pkgs".equals(inputPortName)) {
            return getPkgs();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "PkgsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Pkgs"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Pkgs".equals(portName)) {
            setPkgsEndpointAddress(address);
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
