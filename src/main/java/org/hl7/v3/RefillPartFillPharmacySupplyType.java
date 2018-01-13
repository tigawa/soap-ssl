
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RefillPartFillPharmacySupplyTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RefillPartFillPharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RFP"/>
 *     &lt;enumeration value="RFPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillPartFillPharmacySupplyType")
@XmlEnum
public enum RefillPartFillPharmacySupplyType {

    RFP,
    RFPS;

    public String value() {
        return name();
    }

    public static RefillPartFillPharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}
