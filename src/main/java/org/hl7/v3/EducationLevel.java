
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EducationLevelのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="EducationLevel">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ASSOC"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="POSTG"/>
 *     &lt;enumeration value="ELEM"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="SCOL"/>
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="SEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationLevel")
@XmlEnum
public enum EducationLevel {

    ASSOC,
    BD,
    POSTG,
    ELEM,
    GD,
    HS,
    SCOL,
    PB,
    SEC;

    public String value() {
        return name();
    }

    public static EducationLevel fromValue(String v) {
        return valueOf(v);
    }

}
