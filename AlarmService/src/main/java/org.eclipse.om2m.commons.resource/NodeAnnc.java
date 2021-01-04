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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="nodeID" type="{http://www.onem2m.org/xml/protocols}nodeID"/>
 *         &lt;element name="hostedCSELink" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}memoryAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}batteryAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}areaNwkInfoAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}areaNwkDeviceInfoAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}firmwareAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}softwareAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}deviceInfoAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}deviceCapabilityAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}rebootAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}eventLogAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"nodeID", "hostedCSELink", "childResource",
        "memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc"})
@XmlRootElement(name = "nodeAnnc")
public class NodeAnnc extends AnnounceableResource {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nodeID;
    protected String hostedCSELink;
    protected List<ChildResourceRef> childResource;
    @XmlElements({
            @XmlElement(name = "memoryAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = MemoryAnnc.class),
            @XmlElement(name = "batteryAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = BatteryAnnc.class),
            @XmlElement(name = "areaNwkInfoAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AreaNwkInfoAnnc.class),
            @XmlElement(name = "areaNwkDeviceInfoAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AreaNwkDeviceInfoAnnc.class),
            @XmlElement(name = "firmwareAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = FirmwareAnnc.class),
            @XmlElement(name = "softwareAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SoftwareAnnc.class),
            @XmlElement(name = "deviceInfoAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = DeviceInfoAnnc.class),
            @XmlElement(name = "deviceCapabilityAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = DeviceCapabilityAnnc.class),
            @XmlElement(name = "rebootAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = RebootAnnc.class),
            @XmlElement(name = "eventLogAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = EventLogAnnc.class),
            @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)})
    protected List<Resource> memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc;

    /**
     * Gets the value of the nodeID property.
     *
     * @return possible object is {@link String }
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     *
     * @param value allowed object is {@link String }
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the hostedCSELink property.
     *
     * @return possible object is {@link String }
     */
    public String getHostedCSELink() {
        return hostedCSELink;
    }

    /**
     * Sets the value of the hostedCSELink property.
     *
     * @param value allowed object is {@link String }
     */
    public void setHostedCSELink(String value) {
        this.hostedCSELink = value;
    }

    /**
     * Gets the value of the childResource property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the childResource property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getChildResource().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     */
    public List<ChildResourceRef> getChildResource() {
        if (childResource == null) {
            childResource = new ArrayList<ChildResourceRef>();
        }
        return this.childResource;
    }

    /**
     * Gets the value of the memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc
     * property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getMemoryAnncOrBatteryAnncOrAreaNwkInfoAnnc().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryAnnc } {@link BatteryAnnc } {@link AreaNwkInfoAnnc }
     * {@link AreaNwkDeviceInfoAnnc } {@link FirmwareAnnc } {@link SoftwareAnnc }
     * {@link DeviceInfoAnnc } {@link DeviceCapabilityAnnc } {@link RebootAnnc }
     * {@link EventLogAnnc } {@link Subscription }
     */
    public List<Resource> getMemoryAnncOrBatteryAnncOrAreaNwkInfoAnnc() {
        if (memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc == null) {
            memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc = new ArrayList<Resource>();
        }
        return this.memoryAnncOrBatteryAnncOrAreaNwkInfoAnnc;
    }

}
