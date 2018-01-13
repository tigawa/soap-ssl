
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrganizationNamePartQualifierのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNamePartQualifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNamePartQualifier")
@XmlEnum
public enum OrganizationNamePartQualifier {

    LS;

    public String value() {
        return name();
    }

    public static OrganizationNamePartQualifier fromValue(String v) {
        return valueOf(v);
    }

}
