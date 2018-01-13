
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FamilyMemberAuntのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberAunt">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUNT"/>
 *     &lt;enumeration value="MAUNT"/>
 *     &lt;enumeration value="PAUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberAunt")
@XmlEnum
public enum FamilyMemberAunt {

    AUNT,
    MAUNT,
    PAUNT;

    public String value() {
        return name();
    }

    public static FamilyMemberAunt fromValue(String v) {
        return valueOf(v);
    }

}
