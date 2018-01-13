
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreetNameのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="StreetName">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="STB"/>
 *     &lt;enumeration value="STTYP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StreetName")
@XmlEnum
public enum StreetName {

    STR,
    STB,
    STTYP;

    public String value() {
        return name();
    }

    public static StreetName fromValue(String v) {
        return valueOf(v);
    }

}