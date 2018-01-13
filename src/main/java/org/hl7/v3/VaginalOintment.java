
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VaginalOintmentのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalOintment">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VAGOINT"/>
 *     &lt;enumeration value="VAGOINTAPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaginalOintment")
@XmlEnum
public enum VaginalOintment {

    VAGOINT,
    VAGOINTAPL;

    public String value() {
        return name();
    }

    public static VaginalOintment fromValue(String v) {
        return valueOf(v);
    }

}
