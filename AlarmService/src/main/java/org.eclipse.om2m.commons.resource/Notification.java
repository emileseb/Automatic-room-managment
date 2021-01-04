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
import java.math.BigInteger;

/**
 * <p>
 * Java class for notification complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationEvent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="representation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="resourceStatus" type="{http://www.onem2m.org/xml/protocols}resourceStatus" minOccurs="0"/>
 *                   &lt;element name="operationMonitor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
 *                             &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="verificationRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionDeletion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="notificationForwardingURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notification", propOrder = {"notificationEvent",
        "verificationRequest", "subscriptionDeletion", "subscriptionReference",
        "creator", "notificationForwardingURI"})
@XmlRootElement(name = ShortName.NOTIFICATION)
public class Notification {

    @XmlElement(name = ShortName.NOTIFICATION_EVENT)
    protected Notification.NotificationEvent notificationEvent;
    @XmlElement(name = ShortName.VERIFICATION_REQUEST)
    protected Boolean verificationRequest;
    @XmlElement(name = ShortName.SUBSCRIPTION_DELETION)
    protected Boolean subscriptionDeletion;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = ShortName.SUBSCRIPTION_REFERENCE)
    protected String subscriptionReference;
    @XmlElement(name = ShortName.CREATOR)
    protected String creator;
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = ShortName.NOTIFICATION_FORWARDING_URI)
    protected String notificationForwardingURI;

    /**
     * Gets the value of the notificationEvent property.
     *
     * @return possible object is {@link Notification.NotificationEvent }
     */
    public Notification.NotificationEvent getNotificationEvent() {
        return notificationEvent;
    }

    /**
     * Sets the value of the notificationEvent property.
     *
     * @param value allowed object is {@link Notification.NotificationEvent }
     */
    public void setNotificationEvent(Notification.NotificationEvent value) {
        this.notificationEvent = value;
    }

    /**
     * Gets the value of the verificationRequest property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isVerificationRequest() {
        return verificationRequest;
    }

    /**
     * Sets the value of the verificationRequest property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setVerificationRequest(Boolean value) {
        this.verificationRequest = value;
    }

    /**
     * Gets the value of the subscriptionDeletion property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isSubscriptionDeletion() {
        return subscriptionDeletion;
    }

    /**
     * Sets the value of the subscriptionDeletion property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setSubscriptionDeletion(Boolean value) {
        this.subscriptionDeletion = value;
    }

    /**
     * Gets the value of the subscriptionReference property.
     *
     * @return possible object is {@link String }
     */
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Sets the value of the subscriptionReference property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSubscriptionReference(String value) {
        this.subscriptionReference = value;
    }

    /**
     * Gets the value of the creator property.
     *
     * @return possible object is {@link String }
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the notificationForwardingURI property.
     *
     * @return possible object is {@link String }
     */
    public String getNotificationForwardingURI() {
        return notificationForwardingURI;
    }

    /**
     * Sets the value of the notificationForwardingURI property.
     *
     * @param value allowed object is {@link String }
     */
    public void setNotificationForwardingURI(String value) {
        this.notificationForwardingURI = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="representation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="resourceStatus" type="{http://www.onem2m.org/xml/protocols}resourceStatus" minOccurs="0"/>
     *         &lt;element name="operationMonitor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
     *                   &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"representation", "resourceStatus",
            "operationMonitor"})
    public static class NotificationEvent {

        @XmlElement(name = ShortName.REPRESENTATION)
        protected Object representation;
        @XmlElement(name = ShortName.RESOURCE_STATUS)
        protected BigInteger resourceStatus;
        @XmlElement(name = ShortName.OPERATION_MONITOR)
        protected Notification.NotificationEvent.OperationMonitor operationMonitor;

        /**
         * Gets the value of the representation property.
         *
         * @return possible object is {@link Object }
         */
        public Object getRepresentation() {
            return representation;
        }

        /**
         * Sets the value of the representation property.
         *
         * @param value allowed object is {@link Object }
         */
        public void setRepresentation(Object value) {
            this.representation = value;
        }

        /**
         * Gets the value of the resourceStatus property.
         *
         * @return possible object is {@link BigInteger }
         */
        public BigInteger getResourceStatus() {
            return resourceStatus;
        }

        /**
         * Sets the value of the resourceStatus property.
         *
         * @param value allowed object is {@link BigInteger }
         */
        public void setResourceStatus(BigInteger value) {
            this.resourceStatus = value;
        }

        /**
         * Gets the value of the operationMonitor property.
         *
         * @return possible object is
         * {@link Notification.NotificationEvent.OperationMonitor }
         */
        public Notification.NotificationEvent.OperationMonitor getOperationMonitor() {
            return operationMonitor;
        }

        /**
         * Sets the value of the operationMonitor property.
         *
         * @param value allowed object is
         *              {@link Notification.NotificationEvent.OperationMonitor }
         */
        public void setOperationMonitor(
                Notification.NotificationEvent.OperationMonitor value) {
            this.operationMonitor = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
         *         &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"operation", "originator"})
        public static class OperationMonitor {

            @XmlElement(name = ShortName.OM_OPERATION)
            protected BigInteger operation;
            @XmlElement(name = ShortName.OM_ORIGINATOR)
            protected String originator;

            /**
             * Gets the value of the operation property.
             *
             * @return possible object is {@link BigInteger }
             */
            public BigInteger getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             *
             * @param value allowed object is {@link BigInteger }
             */
            public void setOperation(BigInteger value) {
                this.operation = value;
            }

            /**
             * Gets the value of the originator property.
             *
             * @return possible object is {@link String }
             */
            public String getOriginator() {
                return originator;
            }

            /**
             * Sets the value of the originator property.
             *
             * @param value allowed object is {@link String }
             */
            public void setOriginator(String value) {
                this.originator = value;
            }

        }

    }

}
