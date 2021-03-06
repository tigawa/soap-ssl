
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTypeAnnotatedPhysicalQuantityのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeAnnotatedPhysicalQuantity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ANT&lt;PQ>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeAnnotatedPhysicalQuantity")
@XmlEnum
public enum DataTypeAnnotatedPhysicalQuantity {

    @XmlEnumValue("ANT<PQ>")
    ANT_PQ("ANT<PQ>");
    private final String value;

    DataTypeAnnotatedPhysicalQuantity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeAnnotatedPhysicalQuantity fromValue(String v) {
        for (DataTypeAnnotatedPhysicalQuantity c: DataTypeAnnotatedPhysicalQuantity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
