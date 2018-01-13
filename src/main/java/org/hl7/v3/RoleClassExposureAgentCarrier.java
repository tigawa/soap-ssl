
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoleClassExposureAgentCarrierのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassExposureAgentCarrier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXPAGTCAR"/>
 *     &lt;enumeration value="EXPVECTOR"/>
 *     &lt;enumeration value="FOMITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassExposureAgentCarrier")
@XmlEnum
public enum RoleClassExposureAgentCarrier {

    EXPAGTCAR,
    EXPVECTOR,
    FOMITE;

    public String value() {
        return name();
    }

    public static RoleClassExposureAgentCarrier fromValue(String v) {
        return valueOf(v);
    }

}
