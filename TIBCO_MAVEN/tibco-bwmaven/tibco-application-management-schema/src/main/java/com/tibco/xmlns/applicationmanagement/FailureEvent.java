//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:11:20 AM CET 
//


package com.tibco.xmlns.applicationmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tibco.com/xmlns/ApplicationManagement}EventType">
 *       &lt;sequence>
 *         &lt;element name="failure">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ANY"/>
 *               &lt;enumeration value="FIRST"/>
 *               &lt;enumeration value="SECOND"/>
 *               &lt;enumeration value="Subsequent"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "failure"
})
public class FailureEvent
    extends EventType
{

    @XmlElement(required = true)
    protected String failure;

    /**
     * Gets the value of the failure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailure() {
        return failure;
    }

    /**
     * Sets the value of the failure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailure(String value) {
        this.failure = value;
    }

}
