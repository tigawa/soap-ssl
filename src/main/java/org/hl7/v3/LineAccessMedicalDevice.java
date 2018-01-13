
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LineAccessMedicalDeviceのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="LineAccessMedicalDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="IALINE"/>
 *     &lt;enumeration value="IVLINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineAccessMedicalDevice")
@XmlEnum
public enum LineAccessMedicalDevice {

    LINE,
    IALINE,
    IVLINE;

    public String value() {
        return name();
    }

    public static LineAccessMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}
