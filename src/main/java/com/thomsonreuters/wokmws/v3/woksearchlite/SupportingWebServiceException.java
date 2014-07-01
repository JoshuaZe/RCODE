
package com.thomsonreuters.wokmws.v3.woksearchlite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupportingWebServiceException complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SupportingWebServiceException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remoteNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remoteOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remoteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remoteReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handshakeCauseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handshakeCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingWebServiceException", propOrder = {
    "remoteNamespace",
    "remoteOperation",
    "remoteCode",
    "remoteReason",
    "handshakeCauseId",
    "handshakeCause"
})
public class SupportingWebServiceException {

    protected String remoteNamespace;
    protected String remoteOperation;
    protected String remoteCode;
    protected String remoteReason;
    protected String handshakeCauseId;
    protected String handshakeCause;

    /**
     * ��ȡremoteNamespace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteNamespace() {
        return remoteNamespace;
    }

    /**
     * ����remoteNamespace���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteNamespace(String value) {
        this.remoteNamespace = value;
    }

    /**
     * ��ȡremoteOperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOperation() {
        return remoteOperation;
    }

    /**
     * ����remoteOperation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOperation(String value) {
        this.remoteOperation = value;
    }

    /**
     * ��ȡremoteCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteCode() {
        return remoteCode;
    }

    /**
     * ����remoteCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteCode(String value) {
        this.remoteCode = value;
    }

    /**
     * ��ȡremoteReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteReason() {
        return remoteReason;
    }

    /**
     * ����remoteReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteReason(String value) {
        this.remoteReason = value;
    }

    /**
     * ��ȡhandshakeCauseId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandshakeCauseId() {
        return handshakeCauseId;
    }

    /**
     * ����handshakeCauseId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandshakeCauseId(String value) {
        this.handshakeCauseId = value;
    }

    /**
     * ��ȡhandshakeCause���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandshakeCause() {
        return handshakeCause;
    }

    /**
     * ����handshakeCause���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandshakeCause(String value) {
        this.handshakeCause = value;
    }

}
