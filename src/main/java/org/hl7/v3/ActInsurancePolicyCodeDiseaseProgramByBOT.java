
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActInsurancePolicyCodeDiseaseProgramByBOTのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeDiseaseProgramByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DISEASEPRG"/>
 *     &lt;enumeration value="HIVAIDS"/>
 *     &lt;enumeration value="CANPRG"/>
 *     &lt;enumeration value="ENDRENAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeDiseaseProgramByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeDiseaseProgramByBOT {

    DISEASEPRG,
    HIVAIDS,
    CANPRG,
    ENDRENAL;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeDiseaseProgramByBOT fromValue(String v) {
        return valueOf(v);
    }

}
