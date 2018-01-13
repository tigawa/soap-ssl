
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ObservationDiagnosisTypesのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationDiagnosisTypes">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="ADMDX"/>
 *     &lt;enumeration value="DISDX"/>
 *     &lt;enumeration value="INTDX"/>
 *     &lt;enumeration value="NOI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationDiagnosisTypes")
@XmlEnum
public enum ObservationDiagnosisTypes {

    DX,
    ADMDX,
    DISDX,
    INTDX,
    NOI;

    public String value() {
        return name();
    }

    public static ObservationDiagnosisTypes fromValue(String v) {
        return valueOf(v);
    }

}
