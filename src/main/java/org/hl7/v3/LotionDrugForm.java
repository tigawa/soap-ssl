
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LotionDrugFormのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="LotionDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LTN"/>
 *     &lt;enumeration value="TOPLTN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LotionDrugForm")
@XmlEnum
public enum LotionDrugForm {

    LTN,
    TOPLTN;

    public String value() {
        return name();
    }

    public static LotionDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
