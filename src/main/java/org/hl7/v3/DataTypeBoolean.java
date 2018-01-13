
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTypeBooleanのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeBoolean">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeBoolean")
@XmlEnum
public enum DataTypeBoolean {

    BL;

    public String value() {
        return name();
    }

    public static DataTypeBoolean fromValue(String v) {
        return valueOf(v);
    }

}
