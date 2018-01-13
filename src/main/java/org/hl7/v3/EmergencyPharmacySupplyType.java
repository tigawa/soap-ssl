
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmergencyPharmacySupplyTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="EmergencyPharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EM"/>
 *     &lt;enumeration value="SO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmergencyPharmacySupplyType")
@XmlEnum
public enum EmergencyPharmacySupplyType {

    EM,
    SO;

    public String value() {
        return name();
    }

    public static EmergencyPharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}
