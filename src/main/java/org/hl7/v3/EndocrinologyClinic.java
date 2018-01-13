
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EndocrinologyClinicのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="EndocrinologyClinic">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENDO"/>
 *     &lt;enumeration value="PEDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndocrinologyClinic")
@XmlEnum
public enum EndocrinologyClinic {

    ENDO,
    PEDE;

    public String value() {
        return name();
    }

    public static EndocrinologyClinic fromValue(String v) {
        return valueOf(v);
    }

}
