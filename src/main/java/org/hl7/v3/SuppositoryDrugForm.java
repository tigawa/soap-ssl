
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SuppositoryDrugFormのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SuppositoryDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SUPP"/>
 *     &lt;enumeration value="RECSUPP"/>
 *     &lt;enumeration value="URETHSUPP"/>
 *     &lt;enumeration value="VAGSUPP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuppositoryDrugForm")
@XmlEnum
public enum SuppositoryDrugForm {

    SUPP,
    RECSUPP,
    URETHSUPP,
    VAGSUPP;

    public String value() {
        return name();
    }

    public static SuppositoryDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
