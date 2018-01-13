
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntracorpusCavernosumRouteのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="IntracorpusCavernosumRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ICORPCAVINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntracorpusCavernosumRoute")
@XmlEnum
public enum IntracorpusCavernosumRoute {

    ICORPCAVINJ;

    public String value() {
        return name();
    }

    public static IntracorpusCavernosumRoute fromValue(String v) {
        return valueOf(v);
    }

}
