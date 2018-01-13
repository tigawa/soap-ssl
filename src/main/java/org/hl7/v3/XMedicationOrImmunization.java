
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_MedicationOrImmunizationのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_MedicationOrImmunization">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DRUG"/>
 *     &lt;enumeration value="IMMUNIZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_MedicationOrImmunization")
@XmlEnum
public enum XMedicationOrImmunization {

    DRUG,
    IMMUNIZ;

    public String value() {
        return name();
    }

    public static XMedicationOrImmunization fromValue(String v) {
        return valueOf(v);
    }

}
