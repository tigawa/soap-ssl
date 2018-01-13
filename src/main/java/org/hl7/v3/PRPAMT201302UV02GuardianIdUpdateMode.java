
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPA_MT201302UV02.Guardian.id.updateModeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="PRPA_MT201302UV02.Guardian.id.updateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PRPA_MT201302UV02.Guardian.id.updateMode")
@XmlEnum
public enum PRPAMT201302UV02GuardianIdUpdateMode {

    A,
    N;

    public String value() {
        return name();
    }

    public static PRPAMT201302UV02GuardianIdUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}
