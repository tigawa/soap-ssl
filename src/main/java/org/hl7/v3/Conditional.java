
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConditionalのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="Conditional">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="NOTIFY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Conditional")
@XmlEnum
public enum Conditional {

    CONFIRM,
    NOTIFY;

    public String value() {
        return name();
    }

    public static Conditional fromValue(String v) {
        return valueOf(v);
    }

}
