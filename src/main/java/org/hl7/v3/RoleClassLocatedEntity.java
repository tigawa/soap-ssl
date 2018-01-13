
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoleClassLocatedEntityのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassLocatedEntity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LOCE"/>
 *     &lt;enumeration value="STOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassLocatedEntity")
@XmlEnum
public enum RoleClassLocatedEntity {

    LOCE,
    STOR;

    public String value() {
        return name();
    }

    public static RoleClassLocatedEntity fromValue(String v) {
        return valueOf(v);
    }

}
