
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_ActRelationshipExternalReferenceのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipExternalReference">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="XCRPT"/>
 *     &lt;enumeration value="ELNK"/>
 *     &lt;enumeration value="SUBJ"/>
 *     &lt;enumeration value="SPRT"/>
 *     &lt;enumeration value="REFR"/>
 *     &lt;enumeration value="RPLC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipExternalReference")
@XmlEnum
public enum XActRelationshipExternalReference {

    XCRPT,
    ELNK,
    SUBJ,
    SPRT,
    REFR,
    RPLC;

    public String value() {
        return name();
    }

    public static XActRelationshipExternalReference fromValue(String v) {
        return valueOf(v);
    }

}
