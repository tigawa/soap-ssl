
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActTaskClinicalNoteReviewCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskClinicalNoteReviewCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CLINNOTEREV"/>
 *     &lt;enumeration value="DISCHSUMREV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskClinicalNoteReviewCode")
@XmlEnum
public enum ActTaskClinicalNoteReviewCode {

    CLINNOTEREV,
    DISCHSUMREV;

    public String value() {
        return name();
    }

    public static ActTaskClinicalNoteReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
