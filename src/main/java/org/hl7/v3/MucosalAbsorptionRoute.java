
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MucosalAbsorptionRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="MucosalAbsorptionRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IDOUDMAB"/>
 *     &lt;enumeration value="ITRACHMAB"/>
 *     &lt;enumeration value="SMUCMAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MucosalAbsorptionRoute")
@XmlEnum
public enum MucosalAbsorptionRoute {

    IDOUDMAB,
    ITRACHMAB,
    SMUCMAB;

    public String value() {
        return name();
    }

    public static MucosalAbsorptionRoute fromValue(String v) {
        return valueOf(v);
    }

}
