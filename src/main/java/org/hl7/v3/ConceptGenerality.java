
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConceptGeneralityのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ConceptGenerality">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConceptGenerality")
@XmlEnum
public enum ConceptGenerality {

    A,
    L,
    S;

    public String value() {
        return name();
    }

    public static ConceptGenerality fromValue(String v) {
        return valueOf(v);
    }

}
