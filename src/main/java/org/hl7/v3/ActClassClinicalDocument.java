
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActClassClinicalDocumentのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassClinicalDocument">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOCCLIN"/>
 *     &lt;enumeration value="CDALVLONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassClinicalDocument")
@XmlEnum
public enum ActClassClinicalDocument {

    DOCCLIN,
    CDALVLONE;

    public String value() {
        return name();
    }

    public static ActClassClinicalDocument fromValue(String v) {
        return valueOf(v);
    }

}
