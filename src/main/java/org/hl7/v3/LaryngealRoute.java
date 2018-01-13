
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LaryngealRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="LaryngealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LARYNGINSTIL"/>
 *     &lt;enumeration value="LARYNGTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaryngealRoute")
@XmlEnum
public enum LaryngealRoute {

    LARYNGINSTIL,
    LARYNGTA;

    public String value() {
        return name();
    }

    public static LaryngealRoute fromValue(String v) {
        return valueOf(v);
    }

}
