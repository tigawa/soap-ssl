
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SouthernCaddoanのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SouthernCaddoan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-CAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SouthernCaddoan")
@XmlEnum
public enum SouthernCaddoan {

    @XmlEnumValue("x-CAD")
    X_CAD("x-CAD");
    private final String value;

    SouthernCaddoan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SouthernCaddoan fromValue(String v) {
        for (SouthernCaddoan c: SouthernCaddoan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
