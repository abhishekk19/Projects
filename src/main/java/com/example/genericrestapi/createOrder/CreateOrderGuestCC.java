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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="P_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ORDERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PTNT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DOCTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_COLL_DATE_FROM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="P_COLL_DATE_TO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="P_HARD_COPY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_COLL_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_TESTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PTNTNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_GROSS_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DISCOUNT_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PROMOCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PAYMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PAYMENT_OPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DOB_ACT_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_MOBILE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_EMAIL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_CART_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_COLL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_LAB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ostype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mysrl_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grouptyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="survey_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_CC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pflag",
    "porderid",
    "pptntcd",
    "paddress",
    "plocation",
    "pcity",
    "pstate",
    "pcountry",
    "pzip",
    "pdoctor",
    "pcolldatefrom",
    "pcolldateto",
    "phardcopy",
    "pcollcontact",
    "ptests",
    "pptntnm",
    "pcreatedby",
    "pgrossamt",
    "pdiscountflag",
    "pdiscount",
    "ppromocode",
    "ppaymode",
    "ppaymentopt",
    "ptitle",
    "pfirstname",
    "plastname",
    "pdob",
    "pgender",
    "pdobactflg",
    "pmobileno",
    "pemailid",
    "pcartid",
    "pcolltype",
    "plabid",
    "ostype",
    "mysrlVersion",
    "grouptyp",
    "surveyFlag",
    "pccid",
    "strVldTk"
})
@XmlRootElement(name = "CreateOrder_Guest_CC")
public class CreateOrderGuestCC {

    @XmlElement(name = "P_FLAG")
    protected String pflag;
    @XmlElement(name = "P_ORDERID")
    protected String porderid;
    @XmlElement(name = "P_PTNT_CD")
    protected String pptntcd;
    @XmlElement(name = "P_ADDRESS")
    protected String paddress;
    @XmlElement(name = "P_LOCATION")
    protected String plocation;
    @XmlElement(name = "P_CITY")
    protected String pcity;
    @XmlElement(name = "P_STATE")
    protected String pstate;
    @XmlElement(name = "P_COUNTRY")
    protected String pcountry;
    @XmlElement(name = "P_ZIP")
    protected String pzip;
    @XmlElement(name = "P_DOCTOR")
    protected String pdoctor;
    @XmlElement(name = "P_COLL_DATE_FROM", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pcolldatefrom;
    @XmlElement(name = "P_COLL_DATE_TO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pcolldateto;
    @XmlElement(name = "P_HARD_COPY")
    protected String phardcopy;
    @XmlElement(name = "P_COLL_CONTACT")
    protected String pcollcontact;
    @XmlElement(name = "P_TESTS")
    protected String ptests;
    @XmlElement(name = "P_PTNTNM")
    protected String pptntnm;
    @XmlElement(name = "P_CREATED_BY")
    protected String pcreatedby;
    @XmlElement(name = "P_GROSS_AMT")
    protected String pgrossamt;
    @XmlElement(name = "P_DISCOUNT_FLAG")
    protected String pdiscountflag;
    @XmlElement(name = "P_DISCOUNT")
    protected String pdiscount;
    @XmlElement(name = "P_PROMOCODE")
    protected String ppromocode;
    @XmlElement(name = "P_PAYMODE")
    protected String ppaymode;
    @XmlElement(name = "P_PAYMENT_OPT")
    protected String ppaymentopt;
    @XmlElement(name = "P_TITLE")
    protected String ptitle;
    @XmlElement(name = "P_FIRST_NAME")
    protected String pfirstname;
    @XmlElement(name = "P_LAST_NAME")
    protected String plastname;
    @XmlElement(name = "P_DOB")
    protected String pdob;
    @XmlElement(name = "P_GENDER")
    protected String pgender;
    @XmlElement(name = "P_DOB_ACT_FLG")
    protected String pdobactflg;
    @XmlElement(name = "P_MOBILE_NO")
    protected String pmobileno;
    @XmlElement(name = "P_EMAIL_ID")
    protected String pemailid;
    @XmlElement(name = "P_CART_ID")
    protected String pcartid;
    @XmlElement(name = "P_COLL_TYPE")
    protected String pcolltype;
    @XmlElement(name = "P_LAB_ID")
    protected String plabid;
    protected String ostype;
    @XmlElement(name = "mysrl_version")
    protected String mysrlVersion;
    protected String grouptyp;
    @XmlElement(name = "survey_flag")
    protected String surveyFlag;
    @XmlElement(name = "P_CC_ID")
    protected String pccid;
    protected String strVldTk;

    /**
     * Gets the value of the pflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFLAG() {
        return pflag;
    }

    /**
     * Sets the value of the pflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFLAG(String value) {
        this.pflag = value;
    }

    /**
     * Gets the value of the porderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORDERID() {
        return porderid;
    }

    /**
     * Sets the value of the porderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORDERID(String value) {
        this.porderid = value;
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
     * Gets the value of the paddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRESS() {
        return paddress;
    }

    /**
     * Sets the value of the paddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRESS(String value) {
        this.paddress = value;
    }

    /**
     * Gets the value of the plocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLOCATION() {
        return plocation;
    }

    /**
     * Sets the value of the plocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLOCATION(String value) {
        this.plocation = value;
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
     * Gets the value of the pdoctor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDOCTOR() {
        return pdoctor;
    }

    /**
     * Sets the value of the pdoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDOCTOR(String value) {
        this.pdoctor = value;
    }

    /**
     * Gets the value of the pcolldatefrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCOLLDATEFROM() {
        return pcolldatefrom;
    }

    /**
     * Sets the value of the pcolldatefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCOLLDATEFROM(XMLGregorianCalendar value) {
        this.pcolldatefrom = value;
    }

    /**
     * Gets the value of the pcolldateto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCOLLDATETO() {
        return pcolldateto;
    }

    /**
     * Sets the value of the pcolldateto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCOLLDATETO(XMLGregorianCalendar value) {
        this.pcolldateto = value;
    }

    /**
     * Gets the value of the phardcopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHARDCOPY() {
        return phardcopy;
    }

    /**
     * Sets the value of the phardcopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHARDCOPY(String value) {
        this.phardcopy = value;
    }

    /**
     * Gets the value of the pcollcontact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLLCONTACT() {
        return pcollcontact;
    }

    /**
     * Sets the value of the pcollcontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLLCONTACT(String value) {
        this.pcollcontact = value;
    }

    /**
     * Gets the value of the ptests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTESTS() {
        return ptests;
    }

    /**
     * Sets the value of the ptests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTESTS(String value) {
        this.ptests = value;
    }

    /**
     * Gets the value of the pptntnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPTNTNM() {
        return pptntnm;
    }

    /**
     * Sets the value of the pptntnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPTNTNM(String value) {
        this.pptntnm = value;
    }

    /**
     * Gets the value of the pcreatedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCREATEDBY() {
        return pcreatedby;
    }

    /**
     * Sets the value of the pcreatedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCREATEDBY(String value) {
        this.pcreatedby = value;
    }

    /**
     * Gets the value of the pgrossamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGROSSAMT() {
        return pgrossamt;
    }

    /**
     * Sets the value of the pgrossamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGROSSAMT(String value) {
        this.pgrossamt = value;
    }

    /**
     * Gets the value of the pdiscountflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDISCOUNTFLAG() {
        return pdiscountflag;
    }

    /**
     * Sets the value of the pdiscountflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDISCOUNTFLAG(String value) {
        this.pdiscountflag = value;
    }

    /**
     * Gets the value of the pdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDISCOUNT() {
        return pdiscount;
    }

    /**
     * Sets the value of the pdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDISCOUNT(String value) {
        this.pdiscount = value;
    }

    /**
     * Gets the value of the ppromocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPROMOCODE() {
        return ppromocode;
    }

    /**
     * Sets the value of the ppromocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPROMOCODE(String value) {
        this.ppromocode = value;
    }

    /**
     * Gets the value of the ppaymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPAYMODE() {
        return ppaymode;
    }

    /**
     * Sets the value of the ppaymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPAYMODE(String value) {
        this.ppaymode = value;
    }

    /**
     * Gets the value of the ppaymentopt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPAYMENTOPT() {
        return ppaymentopt;
    }

    /**
     * Sets the value of the ppaymentopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPAYMENTOPT(String value) {
        this.ppaymentopt = value;
    }

    /**
     * Gets the value of the ptitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTITLE() {
        return ptitle;
    }

    /**
     * Sets the value of the ptitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTITLE(String value) {
        this.ptitle = value;
    }

    /**
     * Gets the value of the pfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFIRSTNAME() {
        return pfirstname;
    }

    /**
     * Sets the value of the pfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFIRSTNAME(String value) {
        this.pfirstname = value;
    }

    /**
     * Gets the value of the plastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLASTNAME() {
        return plastname;
    }

    /**
     * Sets the value of the plastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLASTNAME(String value) {
        this.plastname = value;
    }

    /**
     * Gets the value of the pdob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDOB() {
        return pdob;
    }

    /**
     * Sets the value of the pdob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDOB(String value) {
        this.pdob = value;
    }

    /**
     * Gets the value of the pgender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGENDER() {
        return pgender;
    }

    /**
     * Sets the value of the pgender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGENDER(String value) {
        this.pgender = value;
    }

    /**
     * Gets the value of the pdobactflg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDOBACTFLG() {
        return pdobactflg;
    }

    /**
     * Sets the value of the pdobactflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDOBACTFLG(String value) {
        this.pdobactflg = value;
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
     * Gets the value of the pcartid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCARTID() {
        return pcartid;
    }

    /**
     * Sets the value of the pcartid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCARTID(String value) {
        this.pcartid = value;
    }

    /**
     * Gets the value of the pcolltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLLTYPE() {
        return pcolltype;
    }

    /**
     * Sets the value of the pcolltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLLTYPE(String value) {
        this.pcolltype = value;
    }

    /**
     * Gets the value of the plabid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLABID() {
        return plabid;
    }

    /**
     * Sets the value of the plabid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLABID(String value) {
        this.plabid = value;
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
     * Gets the value of the mysrlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMysrlVersion() {
        return mysrlVersion;
    }

    /**
     * Sets the value of the mysrlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMysrlVersion(String value) {
        this.mysrlVersion = value;
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
     * Gets the value of the surveyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyFlag() {
        return surveyFlag;
    }

    /**
     * Sets the value of the surveyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyFlag(String value) {
        this.surveyFlag = value;
    }

    /**
     * Gets the value of the pccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCCID() {
        return pccid;
    }

    /**
     * Sets the value of the pccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCCID(String value) {
        this.pccid = value;
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
