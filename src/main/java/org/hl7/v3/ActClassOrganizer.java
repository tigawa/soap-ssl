
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActClassOrganizerのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassOrganizer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ORGANIZER"/>
 *     &lt;enumeration value="CATEGORY"/>
 *     &lt;enumeration value="DOCBODY"/>
 *     &lt;enumeration value="DOCSECT"/>
 *     &lt;enumeration value="TOPIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassOrganizer")
@XmlEnum
public enum ActClassOrganizer {

    ORGANIZER,
    CATEGORY,
    DOCBODY,
    DOCSECT,
    TOPIC;

    public String value() {
        return name();
    }

    public static ActClassOrganizer fromValue(String v) {
        return valueOf(v);
    }

}
