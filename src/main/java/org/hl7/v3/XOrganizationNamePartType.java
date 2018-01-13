
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_OrganizationNamePartTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_OrganizationNamePartType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEL"/>
 *     &lt;enumeration value="PFX"/>
 *     &lt;enumeration value="SFX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_OrganizationNamePartType")
@XmlEnum
public enum XOrganizationNamePartType {

    DEL,
    PFX,
    SFX;

    public String value() {
        return name();
    }

    public static XOrganizationNamePartType fromValue(String v) {
        return valueOf(v);
    }

}
