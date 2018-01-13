
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WeightAlertのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="WeightAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEHINDW"/>
 *     &lt;enumeration value="DOSELINDW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeightAlert")
@XmlEnum
public enum WeightAlert {

    DOSEHINDW,
    DOSELINDW;

    public String value() {
        return name();
    }

    public static WeightAlert fromValue(String v) {
        return valueOf(v);
    }

}
