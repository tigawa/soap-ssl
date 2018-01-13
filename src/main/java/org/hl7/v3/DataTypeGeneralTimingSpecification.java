
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTypeGeneralTimingSpecificationのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeGeneralTimingSpecification">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeGeneralTimingSpecification")
@XmlEnum
public enum DataTypeGeneralTimingSpecification {

    GTS;

    public String value() {
        return name();
    }

    public static DataTypeGeneralTimingSpecification fromValue(String v) {
        return valueOf(v);
    }

}
