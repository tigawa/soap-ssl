
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoleClassServiceDeliveryLocationのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassServiceDeliveryLocation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SDLOC"/>
 *     &lt;enumeration value="DSDLOC"/>
 *     &lt;enumeration value="ISDLOC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassServiceDeliveryLocation")
@XmlEnum
public enum RoleClassServiceDeliveryLocation {

    SDLOC,
    DSDLOC,
    ISDLOC;

    public String value() {
        return name();
    }

    public static RoleClassServiceDeliveryLocation fromValue(String v) {
        return valueOf(v);
    }

}
