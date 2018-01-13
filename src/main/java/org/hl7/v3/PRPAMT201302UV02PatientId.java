
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPA_MT201302UV02.Patient.id complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.Patient.id">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}II">
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}PRPA_MT201302UV02.Patient.id.updateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.Patient.id")
public class PRPAMT201302UV02PatientId
    extends II
{

    @XmlAttribute(name = "updateMode")
    protected PRPAMT201302UV02PatientIdUpdateMode updateMode;

    /**
     * updateModeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201302UV02PatientIdUpdateMode }
     *     
     */
    public PRPAMT201302UV02PatientIdUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * updateModeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201302UV02PatientIdUpdateMode }
     *     
     */
    public void setUpdateMode(PRPAMT201302UV02PatientIdUpdateMode value) {
        this.updateMode = value;
    }

}
