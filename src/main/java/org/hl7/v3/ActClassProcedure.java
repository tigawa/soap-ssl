
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActClassProcedureのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassProcedure">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PROC"/>
 *     &lt;enumeration value="SPECCOLLECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassProcedure")
@XmlEnum
public enum ActClassProcedure {

    PROC,
    SPECCOLLECT;

    public String value() {
        return name();
    }

    public static ActClassProcedure fromValue(String v) {
        return valueOf(v);
    }

}
