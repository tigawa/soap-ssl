
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COCT_MT810000UV.PrimaryPerformer complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT810000UV.PrimaryPerformer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="signatureCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="signatureText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="assignedEntity" type="{urn:hl7-org:v3}COCT_MT090002UV01.AssignedEntity"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationType" fixed="PPRF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT810000UV.PrimaryPerformer", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "signatureCode",
    "signatureText",
    "assignedEntity"
})
public class COCTMT810000UVPrimaryPerformer {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected CE signatureCode;
    protected ED signatureText;
    @XmlElement(required = true, nillable = true)
    protected COCTMT090002UV01AssignedEntity assignedEntity;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected List<String> typeCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * typeIdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * typeIdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * signatureCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getSignatureCode() {
        return signatureCode;
    }

    /**
     * signatureCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setSignatureCode(CE value) {
        this.signatureCode = value;
    }

    /**
     * signatureTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getSignatureText() {
        return signatureText;
    }

    /**
     * signatureTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setSignatureText(ED value) {
        this.signatureText = value;
    }

    /**
     * assignedEntityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link COCTMT090002UV01AssignedEntity }
     *     
     */
    public COCTMT090002UV01AssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * assignedEntityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT090002UV01AssignedEntity }
     *     
     */
    public void setAssignedEntity(COCTMT090002UV01AssignedEntity value) {
        this.assignedEntity = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

}
