
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_EntityClassDocumentReceivingのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_EntityClassDocumentReceiving">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HCE"/>
 *     &lt;enumeration value="PSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_EntityClassDocumentReceiving")
@XmlEnum
public enum XEntityClassDocumentReceiving {

    HCE,
    PSN;

    public String value() {
        return name();
    }

    public static XEntityClassDocumentReceiving fromValue(String v) {
        return valueOf(v);
    }

}
