
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActAdjudicationResultActionCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdjudicationResultActionCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DISPLAY"/>
 *     &lt;enumeration value="FORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActAdjudicationResultActionCode")
@XmlEnum
public enum ActAdjudicationResultActionCode {

    DISPLAY,
    FORM;

    public String value() {
        return name();
    }

    public static ActAdjudicationResultActionCode fromValue(String v) {
        return valueOf(v);
    }

}
