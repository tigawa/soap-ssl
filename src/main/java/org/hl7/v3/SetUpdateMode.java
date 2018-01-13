
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SetUpdateModeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SetUpdateMode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ESA"/>
 *     &lt;enumeration value="ESAC"/>
 *     &lt;enumeration value="ESC"/>
 *     &lt;enumeration value="ESD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetUpdateMode")
@XmlEnum
public enum SetUpdateMode {

    ESA,
    ESAC,
    ESC,
    ESD;

    public String value() {
        return name();
    }

    public static SetUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}
