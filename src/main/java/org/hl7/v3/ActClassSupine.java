
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActClassSupineのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassSupine">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SUP"/>
 *     &lt;enumeration value="RTRD"/>
 *     &lt;enumeration value="TRD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassSupine")
@XmlEnum
public enum ActClassSupine {

    SUP,
    RTRD,
    TRD;

    public String value() {
        return name();
    }

    public static ActClassSupine fromValue(String v) {
        return valueOf(v);
    }

}
