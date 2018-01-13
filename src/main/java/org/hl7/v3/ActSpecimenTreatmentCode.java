
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActSpecimenTreatmentCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecimenTreatmentCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACID"/>
 *     &lt;enumeration value="ALK"/>
 *     &lt;enumeration value="DEFB"/>
 *     &lt;enumeration value="FILT"/>
 *     &lt;enumeration value="LDLP"/>
 *     &lt;enumeration value="NEUT"/>
 *     &lt;enumeration value="RECA"/>
 *     &lt;enumeration value="UFIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSpecimenTreatmentCode")
@XmlEnum
public enum ActSpecimenTreatmentCode {

    ACID,
    ALK,
    DEFB,
    FILT,
    LDLP,
    NEUT,
    RECA,
    UFIL;

    public String value() {
        return name();
    }

    public static ActSpecimenTreatmentCode fromValue(String v) {
        return valueOf(v);
    }

}