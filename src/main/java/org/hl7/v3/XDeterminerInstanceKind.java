
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_DeterminerInstanceKindのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_DeterminerInstanceKind">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KIND"/>
 *     &lt;enumeration value="QUANTIFIED_KIND"/>
 *     &lt;enumeration value="INSTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_DeterminerInstanceKind")
@XmlEnum
public enum XDeterminerInstanceKind {

    KIND,
    QUANTIFIED_KIND,
    INSTANCE;

    public String value() {
        return name();
    }

    public static XDeterminerInstanceKind fromValue(String v) {
        return valueOf(v);
    }

}
