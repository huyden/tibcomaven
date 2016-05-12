//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:11:20 AM CET 
//


package com.tibco.xmlns.dd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tibco.com/xmlns/dd}DeploymentDescriptorType">
 *       &lt;sequence>
 *         &lt;element name="disableConfigureAtDeployment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.tibco.com/xmlns/dd}NVPair" maxOccurs="unbounded" minOccurs="0"/>
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
    "disableConfigureAtDeployment",
    "nvPair"
})
public class NameValuePairs
    extends DeploymentDescriptorType
{

    protected Boolean disableConfigureAtDeployment;
    @XmlElementRef(name = "NVPair", namespace = "http://www.tibco.com/xmlns/dd", type = JAXBElement.class)
    protected List<JAXBElement<? extends NVPairType>> nvPair;

    /**
     * Gets the value of the disableConfigureAtDeployment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableConfigureAtDeployment() {
        return disableConfigureAtDeployment;
    }

    /**
     * Sets the value of the disableConfigureAtDeployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableConfigureAtDeployment(Boolean value) {
        this.disableConfigureAtDeployment = value;
    }

    /**
     * Gets the value of the nvPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nvPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNVPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NVPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameValuePairInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link NameValuePairPassword }{@code >}
     * {@link JAXBElement }{@code <}{@link NameValuePairBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link NameValuePair }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends NVPairType>> getNVPair() {
        if (nvPair == null) {
            nvPair = new ArrayList<JAXBElement<? extends NVPairType>>();
        }
        return this.nvPair;
    }

}
