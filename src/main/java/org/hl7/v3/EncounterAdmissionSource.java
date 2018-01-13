
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EncounterAdmissionSourceのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterAdmissionSource">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="LD"/>
 *     &lt;enumeration value="NB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterAdmissionSource")
@XmlEnum
public enum EncounterAdmissionSource {

    E,
    LD,
    NB;

    public String value() {
        return name();
    }

    public static EncounterAdmissionSource fromValue(String v) {
        return valueOf(v);
    }

}
