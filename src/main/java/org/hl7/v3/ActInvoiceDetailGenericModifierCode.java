
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActInvoiceDetailGenericModifierCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailGenericModifierCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ISOL"/>
 *     &lt;enumeration value="AFTHRS"/>
 *     &lt;enumeration value="OOO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailGenericModifierCode")
@XmlEnum
public enum ActInvoiceDetailGenericModifierCode {

    ISOL,
    AFTHRS,
    OOO;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailGenericModifierCode fromValue(String v) {
        return valueOf(v);
    }

}
