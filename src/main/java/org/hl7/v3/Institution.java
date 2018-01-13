
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InstitutionのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="Institution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="CS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Institution")
@XmlEnum
public enum Institution {

    I,
    X,
    G,
    N,
    CS;

    public String value() {
        return name();
    }

    public static Institution fromValue(String v) {
        return valueOf(v);
    }

}
