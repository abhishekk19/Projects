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
 *         &lt;element name="ptntcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_MOBILENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relation_ptnt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DEVICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_OSTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_OSVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_MYSRL_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ptntcd",
    "pmobileno",
    "relationPtntId",
    "relation",
    "pdeviceid",
    "postype",
    "posversion",
    "pmysrlversion",
    "grouptyp",
    "source",
    "strVldTk"
})
@XmlRootElement(name = "GetSurvey")
public class GetSurvey {

    protected String ptntcd;
    @XmlElement(name = "P_MOBILENO")
    protected String pmobileno;
    @XmlElement(name = "relation_ptnt_id")
    protected String relationPtntId;
    protected String relation;
    @XmlElement(name = "P_DEVICE_ID")
    protected String pdeviceid;
    @XmlElement(name = "P_OSTYPE")
    protected String postype;
    @XmlElement(name = "P_OSVERSION")
    protected String posversion;
    @XmlElement(name = "P_MYSRL_VERSION")
    protected String pmysrlversion;
    protected String grouptyp;
    protected String source;
    protected String strVldTk;

    /**
     * Gets the value of the ptntcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtntcd() {
        return ptntcd;
    }

    /**
     * Sets the value of the ptntcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtntcd(String value) {
        this.ptntcd = value;
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
     * Gets the value of the relationPtntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationPtntId() {
        return relationPtntId;
    }

    /**
     * Sets the value of the relationPtntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationPtntId(String value) {
        this.relationPtntId = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the pdeviceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDEVICEID() {
        return pdeviceid;
    }

    /**
     * Sets the value of the pdeviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDEVICEID(String value) {
        this.pdeviceid = value;
    }

    /**
     * Gets the value of the postype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTYPE() {
        return postype;
    }

    /**
     * Sets the value of the postype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTYPE(String value) {
        this.postype = value;
    }

    /**
     * Gets the value of the posversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSVERSION() {
        return posversion;
    }

    /**
     * Sets the value of the posversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSVERSION(String value) {
        this.posversion = value;
    }

    /**
     * Gets the value of the pmysrlversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMYSRLVERSION() {
        return pmysrlversion;
    }

    /**
     * Sets the value of the pmysrlversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMYSRLVERSION(String value) {
        this.pmysrlversion = value;
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
