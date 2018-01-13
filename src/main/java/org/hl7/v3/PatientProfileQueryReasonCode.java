
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PatientProfileQueryReasonCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="PatientProfileQueryReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ADMREV"/>
 *     &lt;enumeration value="PATCAR"/>
 *     &lt;enumeration value="PATREQ"/>
 *     &lt;enumeration value="PRCREV"/>
 *     &lt;enumeration value="REGUL"/>
 *     &lt;enumeration value="RSRCH"/>
 *     &lt;enumeration value="LEGAL"/>
 *     &lt;enumeration value="VALIDATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PatientProfileQueryReasonCode")
@XmlEnum
public enum PatientProfileQueryReasonCode {

    ADMREV,
    PATCAR,
    PATREQ,
    PRCREV,
    REGUL,
    RSRCH,
    LEGAL,
    VALIDATION;

    public String value() {
        return name();
    }

    public static PatientProfileQueryReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
