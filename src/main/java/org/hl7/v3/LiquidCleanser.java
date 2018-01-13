
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LiquidCleanserのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="LiquidCleanser">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIQCLN"/>
 *     &lt;enumeration value="LIQSOAP"/>
 *     &lt;enumeration value="SHMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiquidCleanser")
@XmlEnum
public enum LiquidCleanser {

    LIQCLN,
    LIQSOAP,
    SHMP;

    public String value() {
        return name();
    }

    public static LiquidCleanser fromValue(String v) {
        return valueOf(v);
    }

}
