
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GrandChildのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="GrandChild">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GRNDCHILD"/>
 *     &lt;enumeration value="GRNDDAU"/>
 *     &lt;enumeration value="GRNDSON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrandChild")
@XmlEnum
public enum GrandChild {

    GRNDCHILD,
    GRNDDAU,
    GRNDSON;

    public String value() {
        return name();
    }

    public static GrandChild fromValue(String v) {
        return valueOf(v);
    }

}
