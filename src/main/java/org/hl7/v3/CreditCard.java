
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreditCardのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCard">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="DV"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCard")
@XmlEnum
public enum CreditCard {

    AE,
    DN,
    DV,
    MC,
    V;

    public String value() {
        return name();
    }

    public static CreditCard fromValue(String v) {
        return valueOf(v);
    }

}
