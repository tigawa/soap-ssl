
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntramuscularInjectionのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="IntramuscularInjection">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IMD"/>
 *     &lt;enumeration value="IMZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntramuscularInjection")
@XmlEnum
public enum IntramuscularInjection {

    IM,
    IMD,
    IMZ;

    public String value() {
        return name();
    }

    public static IntramuscularInjection fromValue(String v) {
        return valueOf(v);
    }

}
