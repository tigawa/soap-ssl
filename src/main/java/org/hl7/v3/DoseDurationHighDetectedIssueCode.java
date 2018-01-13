
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DoseDurationHighDetectedIssueCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="DoseDurationHighDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEDURH"/>
 *     &lt;enumeration value="DOSEDURHIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoseDurationHighDetectedIssueCode")
@XmlEnum
public enum DoseDurationHighDetectedIssueCode {

    DOSEDURH,
    DOSEDURHIND;

    public String value() {
        return name();
    }

    public static DoseDurationHighDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
