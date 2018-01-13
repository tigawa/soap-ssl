
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubcutaneousRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SubcutaneousRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SQIMPLNT"/>
 *     &lt;enumeration value="SQINFUS"/>
 *     &lt;enumeration value="IPUMPINJ"/>
 *     &lt;enumeration value="SQ"/>
 *     &lt;enumeration value="SQSURGINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubcutaneousRoute")
@XmlEnum
public enum SubcutaneousRoute {

    SQIMPLNT,
    SQINFUS,
    IPUMPINJ,
    SQ,
    SQSURGINS;

    public String value() {
        return name();
    }

    public static SubcutaneousRoute fromValue(String v) {
        return valueOf(v);
    }

}
