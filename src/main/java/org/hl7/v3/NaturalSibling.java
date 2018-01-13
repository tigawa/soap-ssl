
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaturalSiblingのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalSibling">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NSIB"/>
 *     &lt;enumeration value="NBRO"/>
 *     &lt;enumeration value="NSIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaturalSibling")
@XmlEnum
public enum NaturalSibling {

    NSIB,
    NBRO,
    NSIS;

    public String value() {
        return name();
    }

    public static NaturalSibling fromValue(String v) {
        return valueOf(v);
    }

}
