
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActCoverageMaximaCodesのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageMaximaCodes">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COVMX"/>
 *     &lt;enumeration value="LFEMX"/>
 *     &lt;enumeration value="PRDMX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageMaximaCodes")
@XmlEnum
public enum ActCoverageMaximaCodes {

    COVMX,
    LFEMX,
    PRDMX;

    public String value() {
        return name();
    }

    public static ActCoverageMaximaCodes fromValue(String v) {
        return valueOf(v);
    }

}
