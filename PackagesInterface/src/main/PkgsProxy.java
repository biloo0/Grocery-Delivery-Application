package main;

public class PkgsProxy implements main.Pkgs {
  private String _endpoint = null;
  private main.Pkgs pkgs = null;
  
  public PkgsProxy() {
    _initPkgsProxy();
  }
  
  public PkgsProxy(String endpoint) {
    _endpoint = endpoint;
    _initPkgsProxy();
  }
  
  private void _initPkgsProxy() {
    try {
      pkgs = (new main.PkgsServiceLocator()).getPkgs();
      if (pkgs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pkgs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pkgs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pkgs != null)
      ((javax.xml.rpc.Stub)pkgs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Pkgs getPkgs() {
    if (pkgs == null)
      _initPkgsProxy();
    return pkgs;
  }
  
  public java.lang.String getPkgs(java.lang.String product) throws java.rmi.RemoteException{
    if (pkgs == null)
      _initPkgsProxy();
    return pkgs.getPkgs(product);
  }
  
  
}