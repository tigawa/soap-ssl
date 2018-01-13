
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EndocervicalRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="EndocervicalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AMNINJ"/>
 *     &lt;enumeration value="BILINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndocervicalRoute")
@XmlEnum
public enum EndocervicalRoute {

    AMNINJ,
    BILINJ;

    public String value() {
        return name();
    }

    public static EndocervicalRoute fromValue(String v) {
        return valueOf(v);
    }

}
