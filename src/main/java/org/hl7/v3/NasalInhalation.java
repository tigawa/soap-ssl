
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NasalInhalationのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="NasalInhalation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NASINHL"/>
 *     &lt;enumeration value="NASINHLC"/>
 *     &lt;enumeration value="NP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NasalInhalation")
@XmlEnum
public enum NasalInhalation {

    NASINHL,
    NASINHLC,
    NP;

    public String value() {
        return name();
    }

    public static NasalInhalation fromValue(String v) {
        return valueOf(v);
    }

}
