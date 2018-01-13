
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TableCellScopeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="TableCellScope">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="col"/>
 *     &lt;enumeration value="colgroup"/>
 *     &lt;enumeration value="row"/>
 *     &lt;enumeration value="rowgroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TableCellScope")
@XmlEnum
public enum TableCellScope {

    @XmlEnumValue("col")
    COL("col"),
    @XmlEnumValue("colgroup")
    COLGROUP("colgroup"),
    @XmlEnumValue("row")
    ROW("row"),
    @XmlEnumValue("rowgroup")
    ROWGROUP("rowgroup");
    private final String value;

    TableCellScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableCellScope fromValue(String v) {
        for (TableCellScope c: TableCellScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
