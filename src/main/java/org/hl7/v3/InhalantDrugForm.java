
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InhalantDrugFormのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="InhalantDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INHL"/>
 *     &lt;enumeration value="BAINHLPWD"/>
 *     &lt;enumeration value="INHLPWD"/>
 *     &lt;enumeration value="MDINHLPWD"/>
 *     &lt;enumeration value="NASINHL"/>
 *     &lt;enumeration value="ORINHL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InhalantDrugForm")
@XmlEnum
public enum InhalantDrugForm {

    INHL,
    BAINHLPWD,
    INHLPWD,
    MDINHLPWD,
    NASINHL,
    ORINHL;

    public String value() {
        return name();
    }

    public static InhalantDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
