
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EntityClassDeviceのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="CER"/>
 *     &lt;enumeration value="MODDV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClassDevice")
@XmlEnum
public enum EntityClassDevice {

    DEV,
    CER,
    MODDV;

    public String value() {
        return name();
    }

    public static EntityClassDevice fromValue(String v) {
        return valueOf(v);
    }

}
