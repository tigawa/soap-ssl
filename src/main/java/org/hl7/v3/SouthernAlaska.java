
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SouthernAlaskaのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SouthernAlaska">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-AHT"/>
 *     &lt;enumeration value="x-TFN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SouthernAlaska")
@XmlEnum
public enum SouthernAlaska {

    @XmlEnumValue("x-AHT")
    X_AHT("x-AHT"),
    @XmlEnumValue("x-TFN")
    X_TFN("x-TFN");
    private final String value;

    SouthernAlaska(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SouthernAlaska fromValue(String v) {
        for (SouthernAlaska c: SouthernAlaska.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
