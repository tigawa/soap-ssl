
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ObservationNonAllergyIntoleranceTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationNonAllergyIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NAINT"/>
 *     &lt;enumeration value="DNAINT"/>
 *     &lt;enumeration value="ENAINT"/>
 *     &lt;enumeration value="FNAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationNonAllergyIntoleranceType")
@XmlEnum
public enum ObservationNonAllergyIntoleranceType {

    NAINT,
    DNAINT,
    ENAINT,
    FNAINT;

    public String value() {
        return name();
    }

    public static ObservationNonAllergyIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
