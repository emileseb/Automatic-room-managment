package org.eclipse.om2m.commons.resource;

import org.eclipse.om2m.commons.constants.ShortName;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = ShortName.URI_LIST)
public class URIList {

    @XmlList
    @XmlValue
    protected List<String> listOfUri;

    /**
     * @return the listOfUri
     */
    public List<String> getListOfUri() {
        if (listOfUri == null) {
            listOfUri = new ArrayList<String>();
        }
        return listOfUri;
    }

    /**
     * @param listOfUri the listOfUri to set
     */
    public void setListOfUri(List<String> listOfUri) {
        this.listOfUri = listOfUri;
    }

}
