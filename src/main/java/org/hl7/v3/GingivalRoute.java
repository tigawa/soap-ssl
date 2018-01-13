
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GingivalRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="GingivalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GINGINJ"/>
 *     &lt;enumeration value="GIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GingivalRoute")
@XmlEnum
public enum GingivalRoute {

    GINGINJ,
    GIN;

    public String value() {
        return name();
    }

    public static GingivalRoute fromValue(String v) {
        return valueOf(v);
    }

}
