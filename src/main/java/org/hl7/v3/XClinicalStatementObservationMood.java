
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_ClinicalStatementObservationMoodのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_ClinicalStatementObservationMood">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="APT"/>
 *     &lt;enumeration value="ARQ"/>
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ClinicalStatementObservationMood")
@XmlEnum
public enum XClinicalStatementObservationMood {

    GOL,
    APT,
    ARQ,
    DEF,
    EVN,
    INT,
    PRMS,
    PRP,
    RQO;

    public String value() {
        return name();
    }

    public static XClinicalStatementObservationMood fromValue(String v) {
        return valueOf(v);
    }

}
