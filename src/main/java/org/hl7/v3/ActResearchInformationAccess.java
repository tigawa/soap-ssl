
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActResearchInformationAccessのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActResearchInformationAccess">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RESEARCH"/>
 *     &lt;enumeration value="RSDID"/>
 *     &lt;enumeration value="RSREID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActResearchInformationAccess")
@XmlEnum
public enum ActResearchInformationAccess {

    RESEARCH,
    RSDID,
    RSREID;

    public String value() {
        return name();
    }

    public static ActResearchInformationAccess fromValue(String v) {
        return valueOf(v);
    }

}
