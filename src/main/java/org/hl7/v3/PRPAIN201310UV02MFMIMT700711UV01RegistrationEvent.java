
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPA_IN201310UV02.MFMI_MT700711UV01.RegistrationEvent complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="PRPA_IN201310UV02.MFMI_MT700711UV01.RegistrationEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="subject1" type="{urn:hl7-org:v3}PRPA_IN201310UV02.MFMI_MT700711UV01.Subject2"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}MFMI_MT700711UV01.Author2" minOccurs="0"/>
 *         &lt;element name="custodian" type="{urn:hl7-org:v3}MFMI_MT700711UV01.Custodian"/>
 *         &lt;element name="inFulfillmentOf" type="{urn:hl7-org:v3}MFMI_MT700711UV01.InFulfillmentOf" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="definition" type="{urn:hl7-org:v3}MFMI_MT700711UV01.Definition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replacementOf" type="{urn:hl7-org:v3}MFMI_MT700711UV01.ReplacementOf" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClass" fixed="REG" />
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMood" fixed="EVN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_IN201310UV02.MFMI_MT700711UV01.RegistrationEvent", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "statusCode",
    "effectiveTime",
    "subject1",
    "author",
    "custodian",
    "inFulfillmentOf",
    "definition",
    "replacementOf"
})
public class PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    @XmlElement(required = true)
    protected CS statusCode;
    protected IVLTS effectiveTime;
    @XmlElement(required = true)
    protected PRPAIN201310UV02MFMIMT700711UV01Subject2 subject1;
    @XmlElementRef(name = "author", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<MFMIMT700711UV01Author2> author;
    @XmlElement(required = true, nillable = true)
    protected MFMIMT700711UV01Custodian custodian;
    @XmlElement(nillable = true)
    protected List<MFMIMT700711UV01InFulfillmentOf> inFulfillmentOf;
    @XmlElement(nillable = true)
    protected List<MFMIMT700711UV01Definition> definition;
    @XmlElement(nillable = true)
    protected List<MFMIMT700711UV01ReplacementOf> replacementOf;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected List<String> moodCode;

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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * statusCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * statusCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * effectiveTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * effectiveTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * subject1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PRPAIN201310UV02MFMIMT700711UV01Subject2 }
     *     
     */
    public PRPAIN201310UV02MFMIMT700711UV01Subject2 getSubject1() {
        return subject1;
    }

    /**
     * subject1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAIN201310UV02MFMIMT700711UV01Subject2 }
     *     
     */
    public void setSubject1(PRPAIN201310UV02MFMIMT700711UV01Subject2 value) {
        this.subject1 = value;
    }

    /**
     * authorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}
     *     
     */
    public JAXBElement<MFMIMT700711UV01Author2> getAuthor() {
        return author;
    }

    /**
     * authorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<MFMIMT700711UV01Author2> value) {
        this.author = value;
    }

    /**
     * custodianプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MFMIMT700711UV01Custodian }
     *     
     */
    public MFMIMT700711UV01Custodian getCustodian() {
        return custodian;
    }

    /**
     * custodianプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MFMIMT700711UV01Custodian }
     *     
     */
    public void setCustodian(MFMIMT700711UV01Custodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the inFulfillmentOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFulfillmentOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFulfillmentOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MFMIMT700711UV01InFulfillmentOf }
     * 
     * 
     */
    public List<MFMIMT700711UV01InFulfillmentOf> getInFulfillmentOf() {
        if (inFulfillmentOf == null) {
            inFulfillmentOf = new ArrayList<MFMIMT700711UV01InFulfillmentOf>();
        }
        return this.inFulfillmentOf;
    }

    /**
     * Gets the value of the definition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MFMIMT700711UV01Definition }
     * 
     * 
     */
    public List<MFMIMT700711UV01Definition> getDefinition() {
        if (definition == null) {
            definition = new ArrayList<MFMIMT700711UV01Definition>();
        }
        return this.definition;
    }

    /**
     * Gets the value of the replacementOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacementOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacementOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MFMIMT700711UV01ReplacementOf }
     * 
     * 
     */
    public List<MFMIMT700711UV01ReplacementOf> getReplacementOf() {
        if (replacementOf == null) {
            replacementOf = new ArrayList<MFMIMT700711UV01ReplacementOf>();
        }
        return this.replacementOf;
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
     * Gets the value of the classCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<String>();
        }
        return this.classCode;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoodCode() {
        if (moodCode == null) {
            moodCode = new ArrayList<String>();
        }
        return this.moodCode;
    }

}
