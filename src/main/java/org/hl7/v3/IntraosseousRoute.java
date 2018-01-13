
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntraosseousRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="IntraosseousRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IOSSC"/>
 *     &lt;enumeration value="IOSSINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntraosseousRoute")
@XmlEnum
public enum IntraosseousRoute {

    IOSSC,
    IOSSINJ;

    public String value() {
        return name();
    }

    public static IntraosseousRoute fromValue(String v) {
        return valueOf(v);
    }

}
