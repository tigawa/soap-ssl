
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActClassPolicyのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPolicy">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="POLICY"/>
 *     &lt;enumeration value="JURISPOL"/>
 *     &lt;enumeration value="ORGPOL"/>
 *     &lt;enumeration value="SCOPOL"/>
 *     &lt;enumeration value="STDPOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassPolicy")
@XmlEnum
public enum ActClassPolicy {

    POLICY,
    JURISPOL,
    ORGPOL,
    SCOPOL,
    STDPOL;

    public String value() {
        return name();
    }

    public static ActClassPolicy fromValue(String v) {
        return valueOf(v);
    }

}
