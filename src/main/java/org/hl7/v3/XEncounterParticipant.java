
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_EncounterParticipantのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_EncounterParticipant">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="ATND"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="REF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_EncounterParticipant")
@XmlEnum
public enum XEncounterParticipant {

    ADM,
    ATND,
    CON,
    DIS,
    REF;

    public String value() {
        return name();
    }

    public static XEncounterParticipant fromValue(String v) {
        return valueOf(v);
    }

}
