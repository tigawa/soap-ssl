
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaterialDangerInfectiousのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialDangerInfectious">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INF"/>
 *     &lt;enumeration value="BHZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaterialDangerInfectious")
@XmlEnum
public enum MaterialDangerInfectious {

    INF,
    BHZ;

    public String value() {
        return name();
    }

    public static MaterialDangerInfectious fromValue(String v) {
        return valueOf(v);
    }

}
