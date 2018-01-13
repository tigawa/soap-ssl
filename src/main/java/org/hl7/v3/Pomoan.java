
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PomoanのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="Pomoan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-POO"/>
 *     &lt;enumeration value="x-KJU"/>
 *     &lt;enumeration value="x-PEF"/>
 *     &lt;enumeration value="x-PEO"/>
 *     &lt;enumeration value="x-PEQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Pomoan")
@XmlEnum
public enum Pomoan {

    @XmlEnumValue("x-POO")
    X_POO("x-POO"),
    @XmlEnumValue("x-KJU")
    X_KJU("x-KJU"),
    @XmlEnumValue("x-PEF")
    X_PEF("x-PEF"),
    @XmlEnumValue("x-PEO")
    X_PEO("x-PEO"),
    @XmlEnumValue("x-PEQ")
    X_PEQ("x-PEQ");
    private final String value;

    Pomoan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Pomoan fromValue(String v) {
        for (Pomoan c: Pomoan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
