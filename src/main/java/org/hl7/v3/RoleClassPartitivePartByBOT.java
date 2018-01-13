
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoleClassPartitivePartByBOTのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassPartitivePartByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="ACTM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassPartitivePartByBOT")
@XmlEnum
public enum RoleClassPartitivePartByBOT {

    PART,
    ACTM;

    public String value() {
        return name();
    }

    public static RoleClassPartitivePartByBOT fromValue(String v) {
        return valueOf(v);
    }

}
