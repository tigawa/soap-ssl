
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntrailealRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="IntrailealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IILEALINJ"/>
 *     &lt;enumeration value="IILEALTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrailealRoute")
@XmlEnum
public enum IntrailealRoute {

    IILEALINJ,
    IILEALTA;

    public String value() {
        return name();
    }

    public static IntrailealRoute fromValue(String v) {
        return valueOf(v);
    }

}
