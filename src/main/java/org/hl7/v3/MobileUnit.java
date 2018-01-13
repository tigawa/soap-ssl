
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MobileUnitのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="MobileUnit">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MOBL"/>
 *     &lt;enumeration value="AMB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileUnit")
@XmlEnum
public enum MobileUnit {

    MOBL,
    AMB;

    public String value() {
        return name();
    }

    public static MobileUnit fromValue(String v) {
        return valueOf(v);
    }

}
