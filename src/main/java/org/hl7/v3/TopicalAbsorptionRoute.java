
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TopicalAbsorptionRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalAbsorptionRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TTYMPTABSORP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopicalAbsorptionRoute")
@XmlEnum
public enum TopicalAbsorptionRoute {

    TTYMPTABSORP;

    public String value() {
        return name();
    }

    public static TopicalAbsorptionRoute fromValue(String v) {
        return valueOf(v);
    }

}
