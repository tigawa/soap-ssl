
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActMedicationTherapyDurationWorkingListCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicationTherapyDurationWorkingListCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRN"/>
 *     &lt;enumeration value="CHRON"/>
 *     &lt;enumeration value="ONET"/>
 *     &lt;enumeration value="ACU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMedicationTherapyDurationWorkingListCode")
@XmlEnum
public enum ActMedicationTherapyDurationWorkingListCode {

    PRN,
    CHRON,
    ONET,
    ACU;

    public String value() {
        return name();
    }

    public static ActMedicationTherapyDurationWorkingListCode fromValue(String v) {
        return valueOf(v);
    }

}
