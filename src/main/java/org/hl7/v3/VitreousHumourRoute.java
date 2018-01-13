
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VitreousHumourRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="VitreousHumourRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IVITIMPLNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VitreousHumourRoute")
@XmlEnum
public enum VitreousHumourRoute {

    IVITIMPLNT;

    public String value() {
        return name();
    }

    public static VitreousHumourRoute fromValue(String v) {
        return valueOf(v);
    }

}
