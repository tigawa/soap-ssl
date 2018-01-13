
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_ActMoodRqoPrpAptArqのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodRqoPrpAptArq">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="APT"/>
 *     &lt;enumeration value="ARQ"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodRqoPrpAptArq")
@XmlEnum
public enum XActMoodRqoPrpAptArq {

    APT,
    ARQ,
    PRP,
    RQO;

    public String value() {
        return name();
    }

    public static XActMoodRqoPrpAptArq fromValue(String v) {
        return valueOf(v);
    }

}
