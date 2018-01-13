
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContentProcessingModeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ContentProcessingMode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SEQL"/>
 *     &lt;enumeration value="UNOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentProcessingMode")
@XmlEnum
public enum ContentProcessingMode {

    SEQL,
    UNOR;

    public String value() {
        return name();
    }

    public static ContentProcessingMode fromValue(String v) {
        return valueOf(v);
    }

}
