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
 *         &lt;element name="P_USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PWD_ORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_MOBILE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_EMAIL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_LANDMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "puserid",
    "ppwdorg",
    "pmobileno",
    "pemailid",
    "paddress1",
    "paddress2",
    "plandmark",
    "pcity",
    "pstate",
    "pcountry",
    "pzip",
    "grouptyp",
    "source",
    "strVldTk"
})
@XmlRootElement(name = "UpdateProfile")
public class UpdateProfile {

    @XmlElement(name = "P_USERID")
    protected String puserid;
    @XmlElement(name = "P_PWD_ORG")
    protected String ppwdorg;
    @XmlElement(name = "P_MOBILE_NO")
    protected String pmobileno;
    @XmlElement(name = "P_EMAIL_ID")
    protected String pemailid;
    @XmlElement(name = "P_ADDRESS1")
    protected String paddress1;
    @XmlElement(name = "P_ADDRESS2")
    protected String paddress2;
    @XmlElement(name = "P_LANDMARK")
    protected String plandmark;
    @XmlElement(name = "P_CITY")
    protected String pcity;
    @XmlElement(name = "P_STATE")
    protected String pstate;
    @XmlElement(name = "P_COUNTRY")
    protected String pcountry;
    @XmlElement(name = "P_ZIP")
    protected String pzip;
    protected String grouptyp;
    protected String source;
    protected String strVldTk;

    /**
     * Gets the value of the puserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUSERID() {
        return puserid;
    }

    /**
     * Sets the value of the puserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUSERID(String value) {
        this.puserid = value;
    }

    /**
     * Gets the value of the ppwdorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPWDORG() {
        return ppwdorg;
    }

    /**
     * Sets the value of the ppwdorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPWDORG(String value) {
        this.ppwdorg = value;
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
     * Gets the value of the pemailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEMAILID() {
        return pemailid;
    }

    /**
     * Sets the value of the pemailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEMAILID(String value) {
        this.pemailid = value;
    }

    /**
     * Gets the value of the paddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRESS1() {
        return paddress1;
    }

    /**
     * Sets the value of the paddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRESS1(String value) {
        this.paddress1 = value;
    }

    /**
     * Gets the value of the paddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRESS2() {
        return paddress2;
    }

    /**
     * Sets the value of the paddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRESS2(String value) {
        this.paddress2 = value;
    }

    /**
     * Gets the value of the plandmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANDMARK() {
        return plandmark;
    }

    /**
     * Sets the value of the plandmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANDMARK(String value) {
        this.plandmark = value;
    }

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
     * Gets the value of the pstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTATE() {
        return pstate;
    }

    /**
     * Sets the value of the pstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTATE(String value) {
        this.pstate = value;
    }

    /**
     * Gets the value of the pcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOUNTRY() {
        return pcountry;
    }

    /**
     * Sets the value of the pcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOUNTRY(String value) {
        this.pcountry = value;
    }

    /**
     * Gets the value of the pzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPZIP() {
        return pzip;
    }

    /**
     * Sets the value of the pzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPZIP(String value) {
        this.pzip = value;
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