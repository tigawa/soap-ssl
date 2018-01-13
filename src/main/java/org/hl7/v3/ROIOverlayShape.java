
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ROIOverlayShapeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ROIOverlayShape">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CIRCLE"/>
 *     &lt;enumeration value="ELLIPSE"/>
 *     &lt;enumeration value="POINT"/>
 *     &lt;enumeration value="POLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ROIOverlayShape")
@XmlEnum
public enum ROIOverlayShape {

    CIRCLE,
    ELLIPSE,
    POINT,
    POLY;

    public String value() {
        return name();
    }

    public static ROIOverlayShape fromValue(String v) {
        return valueOf(v);
    }

}
