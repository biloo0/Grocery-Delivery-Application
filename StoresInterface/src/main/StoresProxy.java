package main;

public class StoresProxy implements main.Stores {
  private String _endpoint = null;
  private main.Stores stores = null;
  
  public StoresProxy() {
    _initStoresProxy();
  }
  
  public StoresProxy(String endpoint) {
    _endpoint = endpoint;
    _initStoresProxy();
  }
  
  private void _initStoresProxy() {
    try {
      stores = (new main.StoresServiceLocator()).getStores();
      if (stores != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stores)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stores)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stores != null)
      ((javax.xml.rpc.Stub)stores)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Stores getStores() {
    if (stores == null)
      _initStoresProxy();
    return stores;
  }
  
  public main.Storemin[] getStores(int ratings) throws java.rmi.RemoteException{
    if (stores == null)
      _initStoresProxy();
    return stores.getStores(ratings);
  }
  
  
}