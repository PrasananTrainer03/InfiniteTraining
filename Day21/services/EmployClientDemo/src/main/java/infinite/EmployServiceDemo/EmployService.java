/**
 * EmployService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package infinite.EmployServiceDemo;

public interface EmployService extends java.rmi.Remote {
    public infinite.EmployServiceDemo.Employ[] showEmploy() throws java.rmi.RemoteException;
    public infinite.EmployServiceDemo.Employ searchEmploy(int empno) throws java.rmi.RemoteException;
}
