
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_ActMoodOrdPrmsEvnのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodOrdPrmsEvn">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodOrdPrmsEvn")
@XmlEnum
public enum XActMoodOrdPrmsEvn {

    EVN,
    PRMS,
    RQO;

    public String value() {
        return name();
    }

    public static XActMoodOrdPrmsEvn fromValue(String v) {
        return valueOf(v);
    }

}
