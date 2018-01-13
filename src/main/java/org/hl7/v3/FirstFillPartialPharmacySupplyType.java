
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FirstFillPartialPharmacySupplyTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="FirstFillPartialPharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FFS"/>
 *     &lt;enumeration value="FFCS"/>
 *     &lt;enumeration value="TFS"/>
 *     &lt;enumeration value="FFPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FirstFillPartialPharmacySupplyType")
@XmlEnum
public enum FirstFillPartialPharmacySupplyType {

    FFS,
    FFCS,
    TFS,
    FFPS;

    public String value() {
        return name();
    }

    public static FirstFillPartialPharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}
