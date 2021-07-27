/**
 * Employ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package infinite.EmployServiceDemo;

public class Employ  implements java.io.Serializable {
    private int basic;

    private java.lang.String dept;

    private java.lang.String desig;

    private int empno;

    private java.lang.String gender;

    private java.lang.String name;

    public Employ() {
    }

    public Employ(
           int basic,
           java.lang.String dept,
           java.lang.String desig,
           int empno,
           java.lang.String gender,
           java.lang.String name) {
           this.basic = basic;
           this.dept = dept;
           this.desig = desig;
           this.empno = empno;
           this.gender = gender;
           this.name = name;
    }


    /**
     * Gets the basic value for this Employ.
     * 
     * @return basic
     */
    public int getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this Employ.
     * 
     * @param basic
     */
    public void setBasic(int basic) {
        this.basic = basic;
    }


    /**
     * Gets the dept value for this Employ.
     * 
     * @return dept
     */
    public java.lang.String getDept() {
        return dept;
    }


    /**
     * Sets the dept value for this Employ.
     * 
     * @param dept
     */
    public void setDept(java.lang.String dept) {
        this.dept = dept;
    }


    /**
     * Gets the desig value for this Employ.
     * 
     * @return desig
     */
    public java.lang.String getDesig() {
        return desig;
    }


    /**
     * Sets the desig value for this Employ.
     * 
     * @param desig
     */
    public void setDesig(java.lang.String desig) {
        this.desig = desig;
    }


    /**
     * Gets the empno value for this Employ.
     * 
     * @return empno
     */
    public int getEmpno() {
        return empno;
    }


    /**
     * Sets the empno value for this Employ.
     * 
     * @param empno
     */
    public void setEmpno(int empno) {
        this.empno = empno;
    }


    /**
     * Gets the gender value for this Employ.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Employ.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the name value for this Employ.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Employ.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employ)) return false;
        Employ other = (Employ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.basic == other.getBasic() &&
            ((this.dept==null && other.getDept()==null) || 
             (this.dept!=null &&
              this.dept.equals(other.getDept()))) &&
            ((this.desig==null && other.getDesig()==null) || 
             (this.desig!=null &&
              this.desig.equals(other.getDesig()))) &&
            this.empno == other.getEmpno() &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getBasic();
        if (getDept() != null) {
            _hashCode += getDept().hashCode();
        }
        if (getDesig() != null) {
            _hashCode += getDesig().hashCode();
        }
        _hashCode += getEmpno();
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "Employ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dept");
        elemField.setXmlName(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "dept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "desig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "empno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://EmployServiceDemo.infinite", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
