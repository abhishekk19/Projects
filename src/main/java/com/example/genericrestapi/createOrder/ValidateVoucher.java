//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.29 at 05:39:02 PM IST 
//


package com.example.genericrestapi.createOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="P_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_VOUCHER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PTNTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_MOBILENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grouptyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVldTk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pCity",
    "pvouchercode",
    "pptntcd",
    "pmobileno",
    "grouptyp",
    "source",
    "strVldTk"
})
@XmlRootElement(name = "ValidateVoucher")
public class ValidateVoucher {

    @XmlElement(name = "P_City")
    protected String pCity;
    @XmlElement(name = "P_VOUCHER_CODE")
    protected String pvouchercode;
    @XmlElement(name = "P_PTNTCD")
    protected String pptntcd;
    @XmlElement(name = "P_MOBILENO")
    protected String pmobileno;
    protected String grouptyp;
    protected String source;
    protected String strVldTk;

    /**
     * Gets the value of the pCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCity() {
        return pCity;
    }

    /**
     * Sets the value of the pCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCity(String value) {
        this.pCity = value;
    }

    /**
     * Gets the value of the pvouchercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVOUCHERCODE() {
        return pvouchercode;
    }

    /**
     * Sets the value of the pvouchercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVOUCHERCODE(String value) {
        this.pvouchercode = value;
    }

    /**
     * Gets the value of the pptntcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPTNTCD() {
        return pptntcd;
    }

    /**
     * Sets the value of the pptntcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPTNTCD(String value) {
        this.pptntcd = value;
    }

    /**
     * Gets the value of the pmobileno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMOBILENO() {
        return pmobileno;
    }

    /**
     * Sets the value of the pmobileno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMOBILENO(String value) {
        this.pmobileno = value;
    }

    /**
     * Gets the value of the grouptyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrouptyp() {
        return grouptyp;
    }

    /**
     * Sets the value of the grouptyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrouptyp(String value) {
        this.grouptyp = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the strVldTk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVldTk() {
        return strVldTk;
    }

    /**
     * Sets the value of the strVldTk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVldTk(String value) {
        this.strVldTk = value;
    }

}
