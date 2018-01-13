
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTypeCodedWithEquivalentsのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeCodedWithEquivalents">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeCodedWithEquivalents")
@XmlEnum
public enum DataTypeCodedWithEquivalents {

    CE;

    public String value() {
        return name();
    }

    public static DataTypeCodedWithEquivalents fromValue(String v) {
        return valueOf(v);
    }

}
