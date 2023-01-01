/**
 * ProductsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface ProductsService extends javax.xml.rpc.Service {
    public java.lang.String getProductsAddress();

    public main.Products getProducts() throws javax.xml.rpc.ServiceException;

    public main.Products getProducts(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
