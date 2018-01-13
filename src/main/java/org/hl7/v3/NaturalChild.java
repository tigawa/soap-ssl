
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaturalChildのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalChild">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NCHILD"/>
 *     &lt;enumeration value="DAU"/>
 *     &lt;enumeration value="SON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaturalChild")
@XmlEnum
public enum NaturalChild {

    NCHILD,
    DAU,
    SON;

    public String value() {
        return name();
    }

    public static NaturalChild fromValue(String v) {
        return valueOf(v);
    }

}
