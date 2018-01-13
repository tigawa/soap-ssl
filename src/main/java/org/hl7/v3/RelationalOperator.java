
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelationalOperatorのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperator">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="NE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperator")
@XmlEnum
public enum RelationalOperator {

    CT,
    EQ,
    GN,
    GT,
    GE,
    LT,
    LE,
    NE;

    public String value() {
        return name();
    }

    public static RelationalOperator fromValue(String v) {
        return valueOf(v);
    }

}
