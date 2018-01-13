
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExposureModeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureMode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AIRBORNE"/>
 *     &lt;enumeration value="CONTACT"/>
 *     &lt;enumeration value="FOODBORNE"/>
 *     &lt;enumeration value="WATERBORNE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureMode")
@XmlEnum
public enum ExposureMode {

    AIRBORNE,
    CONTACT,
    FOODBORNE,
    WATERBORNE;

    public String value() {
        return name();
    }

    public static ExposureMode fromValue(String v) {
        return valueOf(v);
    }

}
