/*******************************************************************************
 * Copyright (c) 2013-2020 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
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
package org.eclipse.om2m.commons.obix;

import javax.xml.bind.annotation.*;

/**
 * Real oBIX object representing a real number.
 *
 * @author Francois Aissaoui
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "real")
@XmlRootElement
public class Real extends Obj {

    @XmlAttribute(name = "val")
    protected Double val;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "null")
    protected Boolean _null;

    public Real() {
    }

    public Real(String name, double val) {
        this.name = name;
        this.val = Double.valueOf(val);
    }

    /**
     * @return the val
     */
    public Double getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(Double val) {
        this.val = val;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return the _null
     */
    public Boolean get_null() {
        return _null;
    }

    /**
     * @param _null the _null to set
     */
    public void set_null(Boolean _null) {
        this._null = _null;
    }

}
