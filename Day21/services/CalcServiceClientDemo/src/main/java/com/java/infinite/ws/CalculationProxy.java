package com.java.infinite.ws;

public class CalculationProxy implements com.java.infinite.ws.Calculation {
  private String _endpoint = null;
  private com.java.infinite.ws.Calculation calculation = null;
  
  public CalculationProxy() {
    _initCalculationProxy();
  }
  
  public CalculationProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculationProxy();
  }
  
  private void _initCalculationProxy() {
    try {
      calculation = (new com.java.infinite.ws.CalculationServiceLocator()).getCalculation();
      if (calculation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculation != null)
      ((javax.xml.rpc.Stub)calculation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.java.infinite.ws.Calculation getCalculation() {
    if (calculation == null)
      _initCalculationProxy();
    return calculation;
  }
  
  public int sum(int x, int y) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.sum(x, y);
  }
  
  public int sub(int x, int y) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.sub(x, y);
  }
  
  public int mult(int x, int y) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.mult(x, y);
  }
  
  
}