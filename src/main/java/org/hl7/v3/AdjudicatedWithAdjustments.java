
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdjudicatedWithAdjustmentsのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="AdjudicatedWithAdjustments">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="ANF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdjudicatedWithAdjustments")
@XmlEnum
public enum AdjudicatedWithAdjustments {

    AA,
    ANF;

    public String value() {
        return name();
    }

    public static AdjudicatedWithAdjustments fromValue(String v) {
        return valueOf(v);
    }

}
