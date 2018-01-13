
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTypeIntegerNumberのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeIntegerNumber">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeIntegerNumber")
@XmlEnum
public enum DataTypeIntegerNumber {

    INT;

    public String value() {
        return name();
    }

    public static DataTypeIntegerNumber fromValue(String v) {
        return valueOf(v);
    }

}
