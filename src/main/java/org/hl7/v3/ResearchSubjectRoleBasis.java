
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResearchSubjectRoleBasisのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ResearchSubjectRoleBasis">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ERL"/>
 *     &lt;enumeration value="SCN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResearchSubjectRoleBasis")
@XmlEnum
public enum ResearchSubjectRoleBasis {

    ERL,
    SCN;

    public String value() {
        return name();
    }

    public static ResearchSubjectRoleBasis fromValue(String v) {
        return valueOf(v);
    }

}
