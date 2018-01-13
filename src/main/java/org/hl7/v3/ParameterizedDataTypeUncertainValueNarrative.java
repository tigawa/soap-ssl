
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParameterizedDataTypeUncertainValueNarrativeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeUncertainValueNarrative">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="UVN&lt;T>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeUncertainValueNarrative")
@XmlEnum
public enum ParameterizedDataTypeUncertainValueNarrative {

    @XmlEnumValue("UVN<T>")
    UVN_T("UVN<T>");
    private final String value;

    ParameterizedDataTypeUncertainValueNarrative(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeUncertainValueNarrative fromValue(String v) {
        for (ParameterizedDataTypeUncertainValueNarrative c: ParameterizedDataTypeUncertainValueNarrative.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
