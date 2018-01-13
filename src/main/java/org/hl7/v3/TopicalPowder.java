
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TopicalPowderのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalPowder">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TOPPWD"/>
 *     &lt;enumeration value="RECPWD"/>
 *     &lt;enumeration value="VAGPWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopicalPowder")
@XmlEnum
public enum TopicalPowder {

    TOPPWD,
    RECPWD,
    VAGPWD;

    public String value() {
        return name();
    }

    public static TopicalPowder fromValue(String v) {
        return valueOf(v);
    }

}
