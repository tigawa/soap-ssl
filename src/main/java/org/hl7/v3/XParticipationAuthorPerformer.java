
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_ParticipationAuthorPerformerのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationAuthorPerformer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="PRF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationAuthorPerformer")
@XmlEnum
public enum XParticipationAuthorPerformer {

    AUT,
    PRF;

    public String value() {
        return name();
    }

    public static XParticipationAuthorPerformer fromValue(String v) {
        return valueOf(v);
    }

}
