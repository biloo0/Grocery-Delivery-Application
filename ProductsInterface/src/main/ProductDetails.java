/**
 * ProductDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class ProductDetails  implements java.io.Serializable {
    private java.lang.String productname;

    private java.lang.String productnumber;

    private int price;

    public ProductDetails() {
    }

    public ProductDetails(
           java.lang.String productname,
           java.lang.String productnumber,
           int price) {
           this.productname = productname;
           this.productnumber = productnumber;
           this.price = price;
    }


    /**
     * Gets the productname value for this ProductDetails.
     * 
     * @return productname
     */
    public java.lang.String getProductname() {
        return productname;
    }


    /**
     * Sets the productname value for this ProductDetails.
     * 
     * @param productname
     */
    public void setProductname(java.lang.String productname) {
        this.productname = productname;
    }


    /**
     * Gets the productnumber value for this ProductDetails.
     * 
     * @return productnumber
     */
    public java.lang.String getProductnumber() {
        return productnumber;
    }


    /**
     * Sets the productnumber value for this ProductDetails.
     * 
     * @param productnumber
     */
    public void setProductnumber(java.lang.String productnumber) {
        this.productnumber = productnumber;
    }


    /**
     * Gets the price value for this ProductDetails.
     * 
     * @return price
     */
    public int getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProductDetails.
     * 
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductDetails)) return false;
        ProductDetails other = (ProductDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productname==null && other.getProductname()==null) || 
             (this.productname!=null &&
              this.productname.equals(other.getProductname()))) &&
            ((this.productnumber==null && other.getProductnumber()==null) || 
             (this.productnumber!=null &&
              this.productnumber.equals(other.getProductnumber()))) &&
            this.price == other.getPrice();
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
        if (getProductname() != null) {
            _hashCode += getProductname().hashCode();
        }
        if (getProductnumber() != null) {
            _hashCode += getProductnumber().hashCode();
        }
        _hashCode += getPrice();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "ProductDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "productname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "productnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
