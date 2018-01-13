
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NephClinPracticeSettingのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="NephClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NEPH"/>
 *     &lt;enumeration value="PEDNEPH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NephClinPracticeSetting")
@XmlEnum
public enum NephClinPracticeSetting {

    NEPH,
    PEDNEPH;

    public String value() {
        return name();
    }

    public static NephClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
