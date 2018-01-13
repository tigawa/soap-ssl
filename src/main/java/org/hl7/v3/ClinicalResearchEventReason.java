
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClinicalResearchEventReasonのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ClinicalResearchEventReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="SCH"/>
 *     &lt;enumeration value="TRM"/>
 *     &lt;enumeration value="UNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClinicalResearchEventReason")
@XmlEnum
public enum ClinicalResearchEventReason {

    RET,
    SCH,
    TRM,
    UNS;

    public String value() {
        return name();
    }

    public static ClinicalResearchEventReason fromValue(String v) {
        return valueOf(v);
    }

}
