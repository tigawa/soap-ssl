
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActAdjudicationGroupCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdjudicationGroupCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="PERIOD"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActAdjudicationGroupCode")
@XmlEnum
public enum ActAdjudicationGroupCode {

    CONT,
    DAY,
    LOC,
    MONTH,
    PERIOD,
    PROV,
    WEEK,
    YEAR;

    public String value() {
        return name();
    }

    public static ActAdjudicationGroupCode fromValue(String v) {
        return valueOf(v);
    }

}
