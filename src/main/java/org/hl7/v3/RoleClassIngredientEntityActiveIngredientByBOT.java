
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoleClassIngredientEntityActiveIngredientByBOTのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassIngredientEntityActiveIngredientByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACTI"/>
 *     &lt;enumeration value="ACTIB"/>
 *     &lt;enumeration value="ACTIM"/>
 *     &lt;enumeration value="ACTIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassIngredientEntityActiveIngredientByBOT")
@XmlEnum
public enum RoleClassIngredientEntityActiveIngredientByBOT {

    ACTI,
    ACTIB,
    ACTIM,
    ACTIR;

    public String value() {
        return name();
    }

    public static RoleClassIngredientEntityActiveIngredientByBOT fromValue(String v) {
        return valueOf(v);
    }

}
