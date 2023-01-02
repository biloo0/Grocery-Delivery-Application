/**
 * Storemin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Storemin  implements java.io.Serializable {
    private java.lang.String storename;

    private java.lang.String experience;

    private java.lang.String location;

    public Storemin() {
    }

    public Storemin(
           java.lang.String storename,
           java.lang.String experience,
           java.lang.String location) {
           this.storename = storename;
           this.experience = experience;
           this.location = location;
    }


    /**
     * Gets the storename value for this Storemin.
     * 
     * @return storename
     */
    public java.lang.String getStorename() {
        return storename;
    }


    /**
     * Sets the storename value for this Storemin.
     * 
     * @param storename
     */
    public void setStorename(java.lang.String storename) {
        this.storename = storename;
    }


    /**
     * Gets the experience value for this Storemin.
     * 
     * @return experience
     */
    public java.lang.String getExperience() {
        return experience;
    }


    /**
     * Sets the experience value for this Storemin.
     * 
     * @param experience
     */
    public void setExperience(java.lang.String experience) {
        this.experience = experience;
    }


    /**
     * Gets the location value for this Storemin.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Storemin.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Storemin)) return false;
        Storemin other = (Storemin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storename==null && other.getStorename()==null) || 
             (this.storename!=null &&
              this.storename.equals(other.getStorename()))) &&
            ((this.experience==null && other.getExperience()==null) || 
             (this.experience!=null &&
              this.experience.equals(other.getExperience()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getStorename() != null) {
            _hashCode += getStorename().hashCode();
        }
        if (getExperience() != null) {
            _hashCode += getExperience().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Storemin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "Storemin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "storename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experience");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "experience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "location"));
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
