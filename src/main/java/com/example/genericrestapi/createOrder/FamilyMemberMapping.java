//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:57:13 AM IST 
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
 *         &lt;element name="primary_user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="family_member_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="device_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ostype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "primaryUserId",
    "familyMemberId",
    "deviceId",
    "mobileno",
    "ostype",
    "grouptyp",
    "source",
    "strVldTk"
})
@XmlRootElement(name = "Family_Member_Mapping")
public class FamilyMemberMapping {

    @XmlElement(name = "primary_user_id")
    protected String primaryUserId;
    @XmlElement(name = "family_member_id")
    protected String familyMemberId;
    @XmlElement(name = "device_id")
    protected String deviceId;
    protected String mobileno;
    protected String ostype;
    protected String grouptyp;
    protected String source;
    protected String strVldTk;

    /**
     * Gets the value of the primaryUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryUserId() {
        return primaryUserId;
    }

    /**
     * Sets the value of the primaryUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryUserId(String value) {
        this.primaryUserId = value;
    }

    /**
     * Gets the value of the familyMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyMemberId() {
        return familyMemberId;
    }

    /**
     * Sets the value of the familyMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyMemberId(String value) {
        this.familyMemberId = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the mobileno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * Sets the value of the mobileno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileno(String value) {
        this.mobileno = value;
    }

    /**
     * Gets the value of the ostype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOstype() {
        return ostype;
    }

    /**
     * Sets the value of the ostype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOstype(String value) {
        this.ostype = value;
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
