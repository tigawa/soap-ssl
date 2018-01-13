
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_LabProcessClassCodesのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_LabProcessClassCodes">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACSN"/>
 *     &lt;enumeration value="CONTREG"/>
 *     &lt;enumeration value="PROC"/>
 *     &lt;enumeration value="SPCTRT"/>
 *     &lt;enumeration value="TRNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_LabProcessClassCodes")
@XmlEnum
public enum XLabProcessClassCodes {

    ACSN,
    CONTREG,
    PROC,
    SPCTRT,
    TRNS;

    public String value() {
        return name();
    }

    public static XLabProcessClassCodes fromValue(String v) {
        return valueOf(v);
    }

}
