
package com.thomsonreuters.wokmws.v3.woksearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>citedReferencesResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="citedReferencesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://woksearch.v3.wokmws.thomsonreuters.com}citedReferencesSearchResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citedReferencesResponse", propOrder = {
    "_return"
})
public class CitedReferencesResponse {

    @XmlElement(name = "return")
    protected CitedReferencesSearchResults _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CitedReferencesSearchResults }
     *     
     */
    public CitedReferencesSearchResults getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CitedReferencesSearchResults }
     *     
     */
    public void setReturn(CitedReferencesSearchResults value) {
        this._return = value;
    }

}
