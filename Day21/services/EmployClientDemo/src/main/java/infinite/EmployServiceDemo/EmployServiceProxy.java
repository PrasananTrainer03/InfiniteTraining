package infinite.EmployServiceDemo;

public class EmployServiceProxy implements infinite.EmployServiceDemo.EmployService {
  private String _endpoint = null;
  private infinite.EmployServiceDemo.EmployService employService = null;
  
  public EmployServiceProxy() {
    _initEmployServiceProxy();
  }
  
  public EmployServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployServiceProxy();
  }
  
  private void _initEmployServiceProxy() {
    try {
      employService = (new infinite.EmployServiceDemo.EmployServiceServiceLocator()).getEmployService();
      if (employService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employService != null)
      ((javax.xml.rpc.Stub)employService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public infinite.EmployServiceDemo.EmployService getEmployService() {
    if (employService == null)
      _initEmployServiceProxy();
    return employService;
  }
  
  public infinite.EmployServiceDemo.Employ[] showEmploy() throws java.rmi.RemoteException{
    if (employService == null)
      _initEmployServiceProxy();
    return employService.showEmploy();
  }
  
  public infinite.EmployServiceDemo.Employ searchEmploy(int empno) throws java.rmi.RemoteException{
    if (employService == null)
      _initEmployServiceProxy();
    return employService.searchEmploy(empno);
  }
  
  
}