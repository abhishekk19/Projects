//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.30 at 06:58:36 PM IST 
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
 *         &lt;element name="PackageRecommendationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "packageRecommendationResult"
})
@XmlRootElement(name = "PackageRecommendationResponse")
public class PackageRecommendationResponse {

    @XmlElement(name = "PackageRecommendationResult")
    protected String packageRecommendationResult;

    /**
     * Gets the value of the packageRecommendationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageRecommendationResult() {
        return packageRecommendationResult;
    }

    /**
     * Sets the value of the packageRecommendationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageRecommendationResult(String value) {
        this.packageRecommendationResult = value;
    }

}
