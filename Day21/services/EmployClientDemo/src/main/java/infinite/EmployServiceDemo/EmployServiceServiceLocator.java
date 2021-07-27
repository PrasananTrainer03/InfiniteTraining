/**
 * EmployServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package infinite.EmployServiceDemo;

public class EmployServiceServiceLocator extends org.apache.axis.client.Service implements infinite.EmployServiceDemo.EmployServiceService {

    public EmployServiceServiceLocator() {
    }


    public EmployServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployService
    private java.lang.String EmployService_address = "http://localhost:8080/EmployServiceDemo/services/EmployService";

    public java.lang.String getEmployServiceAddress() {
        return EmployService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployServiceWSDDServiceName = "EmployService";

    public java.lang.String getEmployServiceWSDDServiceName() {
        return EmployServiceWSDDServiceName;
    }

    public void setEmployServiceWSDDServiceName(java.lang.String name) {
        EmployServiceWSDDServiceName = name;
    }

    public infinite.EmployServiceDemo.EmployService getEmployService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployService(endpoint);
    }

    public infinite.EmployServiceDemo.EmployService getEmployService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            infinite.EmployServiceDemo.EmployServiceSoapBindingStub _stub = new infinite.EmployServiceDemo.EmployServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployServiceEndpointAddress(java.lang.String address) {
        EmployService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (infinite.EmployServiceDemo.EmployService.class.isAssignableFrom(serviceEndpointInterface)) {
                infinite.EmployServiceDemo.EmployServiceSoapBindingStub _stub = new infinite.EmployServiceDemo.EmployServiceSoapBindingStub(new java.net.URL(EmployService_address), this);
                _stub.setPortName(getEmployServiceWSDDServiceName());
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
        if ("EmployService".equals(inputPortName)) {
            return getEmployService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "EmployServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "EmployService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployService".equals(portName)) {
            setEmployServiceEndpointAddress(address);
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
