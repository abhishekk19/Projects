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
 *         &lt;element name="ValidatePromocode_CARTResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "validatePromocodeCARTResult"
})
@XmlRootElement(name = "ValidatePromocode_CARTResponse")
public class ValidatePromocodeCARTResponse {

    @XmlElement(name = "ValidatePromocode_CARTResult")
    protected String validatePromocodeCARTResult;

    /**
     * Gets the value of the validatePromocodeCARTResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatePromocodeCARTResult() {
        return validatePromocodeCARTResult;
    }

    /**
     * Sets the value of the validatePromocodeCARTResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatePromocodeCARTResult(String value) {
        this.validatePromocodeCARTResult = value;
    }

}
