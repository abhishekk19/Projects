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
 *         &lt;element name="P_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PTNT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_STR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pcity",
    "pptntcd",
    "pstr",
    "grouptyp",
    "source",
    "strVldTk"
})
@XmlRootElement(name = "GetPromotionOffers")
public class GetPromotionOffers {

    @XmlElement(name = "P_CITY")
    protected String pcity;
    @XmlElement(name = "P_PTNT_CD")
    protected String pptntcd;
    @XmlElement(name = "P_STR")
    protected String pstr;
    protected String grouptyp;
    protected String source;
    protected String strVldTk;

    /**
     * Gets the value of the pcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCITY() {
        return pcity;
    }

    /**
     * Sets the value of the pcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCITY(String value) {
        this.pcity = value;
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
     * Gets the value of the pstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTR() {
        return pstr;
    }

    /**
     * Sets the value of the pstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTR(String value) {
        this.pstr = value;
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
