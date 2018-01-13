
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPA_MT201302UV02.Citizen.id complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.Citizen.id">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}II">
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}PRPA_MT201302UV02.Citizen.id.updateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.Citizen.id")
public class PRPAMT201302UV02CitizenId
    extends II
{

    @XmlAttribute(name = "updateMode")
    protected PRPAMT201302UV02CitizenIdUpdateMode updateMode;

    /**
     * updateModeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201302UV02CitizenIdUpdateMode }
     *     
     */
    public PRPAMT201302UV02CitizenIdUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * updateModeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201302UV02CitizenIdUpdateMode }
     *     
     */
    public void setUpdateMode(PRPAMT201302UV02CitizenIdUpdateMode value) {
        this.updateMode = value;
    }

}
