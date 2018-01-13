
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrganizationNameTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNameType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="ST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNameType")
@XmlEnum
public enum OrganizationNameType {

    A,
    L,
    ST;

    public String value() {
        return name();
    }

    public static OrganizationNameType fromValue(String v) {
        return valueOf(v);
    }

}
