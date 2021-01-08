/*******************************************************************************
 * Copyright (c) 2013-2016 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import org.eclipse.om2m.commons.constants.ShortName;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for resource complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceType" type="{http://www.onem2m.org/xml/protocols}resourceType"/>
 *         &lt;element name="resourceID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="parentID" type="{http://www.onem2m.org/xml/protocols}nhURI"/>
 *         &lt;element name="creationTime" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="lastModifiedTime" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="labels" type="{http://www.onem2m.org/xml/protocols}labels" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource")
@XmlSeeAlso({ResourceWrapper.class, CSEBase.class,
        AnnounceableSubordinateResource.class, RegularResource.class,
        AnnouncedResource.class, AnnouncedSubordinateResource.class})
public class Resource {

    @XmlElement(name = ShortName.RESOURCE_TYPE, required = true)
    protected BigInteger resourceType;
    @XmlElement(name = ShortName.RESOURCE_ID, required = true)
    protected String resourceID;
    @XmlElement(name = ShortName.PARENT_ID, required = true)
    protected String parentID;
    @XmlElement(name = ShortName.CREATION_TIME, required = true)
    protected String creationTime;
    @XmlElement(name = ShortName.LAST_MODIFIED_TIME, required = true)
    protected String lastModifiedTime;
    @XmlList
    @XmlElement(name = ShortName.LABELS)
    protected List<String> labels;
    @XmlAttribute(name = ShortName.RESOURCE_NAME, required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the resourceType property.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setResourceType(BigInteger value) {
        this.resourceType = value;
    }

    public void setResourceType(int value) {
        this.resourceType = BigInteger.valueOf(value);
    }

    /**
     * Gets the value of the resourceID property.
     *
     * @return possible object is {@link String }
     */
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResourceID(String value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the parentID property.
     *
     * @return possible object is {@link String }
     */
    public String getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     *
     * @param value allowed object is {@link String }
     */
    public void setParentID(String value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the creationTime property.
     *
     * @return possible object is {@link String }
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     *
     * @return possible object is {@link String }
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLastModifiedTime(String value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the labels property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the labels property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getLabels().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getLabels() {
        if (labels == null) {
            labels = new ArrayList<String>();
        }
        return this.labels;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }
}
