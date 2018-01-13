
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParticipationVerifierのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationVerifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VRF"/>
 *     &lt;enumeration value="AUTHEN"/>
 *     &lt;enumeration value="LA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationVerifier")
@XmlEnum
public enum ParticipationVerifier {

    VRF,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationVerifier fromValue(String v) {
        return valueOf(v);
    }

}
