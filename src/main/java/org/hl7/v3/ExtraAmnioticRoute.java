
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtraAmnioticRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ExtraAmnioticRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXTRAMNINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtraAmnioticRoute")
@XmlEnum
public enum ExtraAmnioticRoute {

    EXTRAMNINJ;

    public String value() {
        return name();
    }

    public static ExtraAmnioticRoute fromValue(String v) {
        return valueOf(v);
    }

}
