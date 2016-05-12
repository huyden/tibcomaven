//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:11:20 AM CET 
//


package com.tibco.xmlns.applicationmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tibco.xmlns.authentication.AuthenticationConfigurationType;
import com.tibco.xmlns.authentication.CookieAuthenticationConfiguration;
import com.tibco.xmlns.authentication.CustomAuthenticationConfiguration;
import com.tibco.xmlns.authentication.HttpSessionAuthenticationConfiguration;
import com.tibco.xmlns.authentication.URLAuthenticationConfiguration;
import com.tibco.xmlns.authentication.WebServerAuthenticationConfiguration;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tibco.com/xmlns/authentication}AuthenticationConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticationConfiguration"
})
@XmlRootElement(name = "authentications")
public class Authentications {

    @XmlElementRef(name = "AuthenticationConfiguration", namespace = "http://www.tibco.com/xmlns/authentication", type = JAXBElement.class)
    protected List<JAXBElement<? extends AuthenticationConfigurationType>> authenticationConfiguration;
    @XmlAttribute
    protected String selected;

    /**
     * Gets the value of the authenticationConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CookieAuthenticationConfiguration }{@code >}
     * {@link JAXBElement }{@code <}{@link URLAuthenticationConfiguration }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomAuthenticationConfiguration }{@code >}
     * {@link JAXBElement }{@code <}{@link WebServerAuthenticationConfiguration }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthenticationConfigurationType }{@code >}
     * {@link JAXBElement }{@code <}{@link HttpSessionAuthenticationConfiguration }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AuthenticationConfigurationType>> getAuthenticationConfiguration() {
        if (authenticationConfiguration == null) {
            authenticationConfiguration = new ArrayList<JAXBElement<? extends AuthenticationConfigurationType>>();
        }
        return this.authenticationConfiguration;
    }

    /**
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelected(String value) {
        this.selected = value;
    }

}
