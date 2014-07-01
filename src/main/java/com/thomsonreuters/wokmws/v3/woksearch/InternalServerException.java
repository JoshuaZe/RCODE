
package com.thomsonreuters.wokmws.v3.woksearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       In version 2, the faultInformation and rawFaultInformation elements did not exist. It is not required that the service return 
 *       these elements. 
 *       
 * 
 * <p>InternalServerException complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InternalServerException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultInformation" type="{http://woksearch.v3.wokmws.thomsonreuters.com}FaultInformation" minOccurs="0"/>
 *         &lt;element name="rawFaultInformation" type="{http://woksearch.v3.wokmws.thomsonreuters.com}RawFaultInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalServerException", propOrder = {
    "faultInformation",
    "rawFaultInformation"
})
public class InternalServerException {

    protected FaultInformation faultInformation;
    protected RawFaultInformation rawFaultInformation;

    /**
     * ��ȡfaultInformation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FaultInformation }
     *     
     */
    public FaultInformation getFaultInformation() {
        return faultInformation;
    }

    /**
     * ����faultInformation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FaultInformation }
     *     
     */
    public void setFaultInformation(FaultInformation value) {
        this.faultInformation = value;
    }

    /**
     * ��ȡrawFaultInformation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RawFaultInformation }
     *     
     */
    public RawFaultInformation getRawFaultInformation() {
        return rawFaultInformation;
    }

    /**
     * ����rawFaultInformation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RawFaultInformation }
     *     
     */
    public void setRawFaultInformation(RawFaultInformation value) {
        this.rawFaultInformation = value;
    }

}
