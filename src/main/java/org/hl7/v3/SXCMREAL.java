
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SXCM_REAL complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="SXCM_REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}REAL">
 *       &lt;attribute name="operator" type="{urn:hl7-org:v3}SetOperator" default="I" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXCM_REAL")
@XmlSeeAlso({
    IVLREAL.class
})
public class SXCMREAL
    extends REAL
{

    @XmlAttribute(name = "operator")
    protected SetOperator operator;

    /**
     * operatorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SetOperator }
     *     
     */
    public SetOperator getOperator() {
        if (operator == null) {
            return SetOperator.I;
        } else {
            return operator;
        }
    }

    /**
     * operatorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SetOperator }
     *     
     */
    public void setOperator(SetOperator value) {
        this.operator = value;
    }

}
