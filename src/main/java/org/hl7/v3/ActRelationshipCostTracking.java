
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActRelationshipCostTrackingのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipCostTracking">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CHRG"/>
 *     &lt;enumeration value="COST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipCostTracking")
@XmlEnum
public enum ActRelationshipCostTracking {

    CHRG,
    COST;

    public String value() {
        return name();
    }

    public static ActRelationshipCostTracking fromValue(String v) {
        return valueOf(v);
    }

}
