
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IncidentalServiceDeliveryLocationRoleTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="IncidentalServiceDeliveryLocationRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COMM"/>
 *     &lt;enumeration value="PTRES"/>
 *     &lt;enumeration value="ACC"/>
 *     &lt;enumeration value="SCHOOL"/>
 *     &lt;enumeration value="WORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncidentalServiceDeliveryLocationRoleType")
@XmlEnum
public enum IncidentalServiceDeliveryLocationRoleType {

    COMM,
    PTRES,
    ACC,
    SCHOOL,
    WORK;

    public String value() {
        return name();
    }

    public static IncidentalServiceDeliveryLocationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
