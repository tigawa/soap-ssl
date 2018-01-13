
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HeightSurfaceAreaAlertのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="HeightSurfaceAreaAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEHINDSA"/>
 *     &lt;enumeration value="DOSELINDSA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeightSurfaceAreaAlert")
@XmlEnum
public enum HeightSurfaceAreaAlert {

    DOSEHINDSA,
    DOSELINDSA;

    public String value() {
        return name();
    }

    public static HeightSurfaceAreaAlert fromValue(String v) {
        return valueOf(v);
    }

}
