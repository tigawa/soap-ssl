
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkPlaceAddressUseのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="WorkPlaceAddressUse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="PUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkPlaceAddressUse")
@XmlEnum
public enum WorkPlaceAddressUse {

    WP,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static WorkPlaceAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
