
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoleClassOntologicalEquivalentEntityByBOTのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassOntologicalEquivalentEntityByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EQUIV"/>
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SUBY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassOntologicalEquivalentEntityByBOT")
@XmlEnum
public enum RoleClassOntologicalEquivalentEntityByBOT {

    EQUIV,
    SAME,
    SUBY;

    public String value() {
        return name();
    }

    public static RoleClassOntologicalEquivalentEntityByBOT fromValue(String v) {
        return valueOf(v);
    }

}
