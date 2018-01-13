
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImplantationのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="Implantation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IDIMPLNT"/>
 *     &lt;enumeration value="IVITIMPLNT"/>
 *     &lt;enumeration value="SQIMPLNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Implantation")
@XmlEnum
public enum Implantation {

    IDIMPLNT,
    IVITIMPLNT,
    SQIMPLNT;

    public String value() {
        return name();
    }

    public static Implantation fromValue(String v) {
        return valueOf(v);
    }

}
