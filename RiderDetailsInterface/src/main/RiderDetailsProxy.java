package main;

public class RiderDetailsProxy implements main.RiderDetails {
  private String _endpoint = null;
  private main.RiderDetails riderDetails = null;
  
  public RiderDetailsProxy() {
    _initRiderDetailsProxy();
  }
  
  public RiderDetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initRiderDetailsProxy();
  }
  
  private void _initRiderDetailsProxy() {
    try {
      riderDetails = (new main.RiderDetailsServiceLocator()).getRiderDetails();
      if (riderDetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)riderDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)riderDetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (riderDetails != null)
      ((javax.xml.rpc.Stub)riderDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.RiderDetails getRiderDetails() {
    if (riderDetails == null)
      _initRiderDetailsProxy();
    return riderDetails;
  }
  
  public java.lang.String getRiderDetails(java.lang.String bike) throws java.rmi.RemoteException{
    if (riderDetails == null)
      _initRiderDetailsProxy();
    return riderDetails.getRiderDetails(bike);
  }
  
  
}