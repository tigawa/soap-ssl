
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntrapulmonaryRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="IntrapulmonaryRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXTCORPINJ"/>
 *     &lt;enumeration value="IPINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrapulmonaryRoute")
@XmlEnum
public enum IntrapulmonaryRoute {

    EXTCORPINJ,
    IPINJ;

    public String value() {
        return name();
    }

    public static IntrapulmonaryRoute fromValue(String v) {
        return valueOf(v);
    }

}
