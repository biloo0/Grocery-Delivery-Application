package main;

public class ProductsProxy implements main.Products {
  private String _endpoint = null;
  private main.Products products = null;
  
  public ProductsProxy() {
    _initProductsProxy();
  }
  
  public ProductsProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductsProxy();
  }
  
  private void _initProductsProxy() {
    try {
      products = (new main.ProductsServiceLocator()).getProducts();
      if (products != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)products)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)products)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (products != null)
      ((javax.xml.rpc.Stub)products)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Products getProducts() {
    if (products == null)
      _initProductsProxy();
    return products;
  }
  
  public main.ProductDetails[] getItems(java.lang.String category) throws java.rmi.RemoteException{
    if (products == null)
      _initProductsProxy();
    return products.getItems(category);
  }
  
  
}