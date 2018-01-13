
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BinaryDataEncodingのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="BinaryDataEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="B64"/>
 *     &lt;enumeration value="TXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BinaryDataEncoding")
@XmlEnum
public enum BinaryDataEncoding {

    @XmlEnumValue("B64")
    B_64("B64"),
    TXT("TXT");
    private final String value;

    BinaryDataEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BinaryDataEncoding fromValue(String v) {
        for (BinaryDataEncoding c: BinaryDataEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
