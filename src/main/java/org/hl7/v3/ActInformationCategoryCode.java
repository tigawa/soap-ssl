
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActInformationCategoryCodeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationCategoryCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ALLGCAT"/>
 *     &lt;enumeration value="COBSCAT"/>
 *     &lt;enumeration value="DEMOCAT"/>
 *     &lt;enumeration value="DICAT"/>
 *     &lt;enumeration value="IMMUCAT"/>
 *     &lt;enumeration value="LABCAT"/>
 *     &lt;enumeration value="MEDCCAT"/>
 *     &lt;enumeration value="RXCAT"/>
 *     &lt;enumeration value="PSVCCAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInformationCategoryCode")
@XmlEnum
public enum ActInformationCategoryCode {

    ALLGCAT,
    COBSCAT,
    DEMOCAT,
    DICAT,
    IMMUCAT,
    LABCAT,
    MEDCCAT,
    RXCAT,
    PSVCCAT;

    public String value() {
        return name();
    }

    public static ActInformationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
