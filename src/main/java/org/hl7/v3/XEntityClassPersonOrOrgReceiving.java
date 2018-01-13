
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_EntityClassPersonOrOrgReceivingのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_EntityClassPersonOrOrgReceiving">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_EntityClassPersonOrOrgReceiving")
@XmlEnum
public enum XEntityClassPersonOrOrgReceiving {

    PSN;

    public String value() {
        return name();
    }

    public static XEntityClassPersonOrOrgReceiving fromValue(String v) {
        return valueOf(v);
    }

}
