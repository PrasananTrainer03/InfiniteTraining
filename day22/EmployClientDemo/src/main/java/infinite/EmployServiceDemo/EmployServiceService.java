/**
 * EmployServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package infinite.EmployServiceDemo;

public interface EmployServiceService extends javax.xml.rpc.Service {
    public java.lang.String getEmployServiceAddress();

    public infinite.EmployServiceDemo.EmployService getEmployService() throws javax.xml.rpc.ServiceException;

    public infinite.EmployServiceDemo.EmployService getEmployService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
