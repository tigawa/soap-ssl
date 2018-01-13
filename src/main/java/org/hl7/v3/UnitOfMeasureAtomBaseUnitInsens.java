
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UnitOfMeasureAtomBaseUnitInsensのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasureAtomBaseUnitInsens">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="RAD"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasureAtomBaseUnitInsens")
@XmlEnum
public enum UnitOfMeasureAtomBaseUnitInsens {

    C,
    K,
    CD,
    G,
    M,
    RAD,
    S;

    public String value() {
        return name();
    }

    public static UnitOfMeasureAtomBaseUnitInsens fromValue(String v) {
        return valueOf(v);
    }

}
