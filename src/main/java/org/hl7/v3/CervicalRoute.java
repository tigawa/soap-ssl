
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CervicalRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="CervicalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CERVINJ"/>
 *     &lt;enumeration value="CERVINS"/>
 *     &lt;enumeration value="DENRINSE"/>
 *     &lt;enumeration value="CERV"/>
 *     &lt;enumeration value="DEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CervicalRoute")
@XmlEnum
public enum CervicalRoute {

    CERVINJ,
    CERVINS,
    DENRINSE,
    CERV,
    DEN;

    public String value() {
        return name();
    }

    public static CervicalRoute fromValue(String v) {
        return valueOf(v);
    }

}
