
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplyDetectedIssueCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TOOLATE"/>
 *     &lt;enumeration value="TOOSOON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplyDetectedIssueCode")
@XmlEnum
public enum SupplyDetectedIssueCode {

    TOOLATE,
    TOOSOON;

    public String value() {
        return name();
    }

    public static SupplyDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
