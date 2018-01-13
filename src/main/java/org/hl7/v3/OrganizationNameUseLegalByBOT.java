
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrganizationNameUseLegalByBOTのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNameUseLegalByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNameUseLegalByBOT")
@XmlEnum
public enum OrganizationNameUseLegalByBOT {

    L,
    OR;

    public String value() {
        return name();
    }

    public static OrganizationNameUseLegalByBOT fromValue(String v) {
        return valueOf(v);
    }

}
