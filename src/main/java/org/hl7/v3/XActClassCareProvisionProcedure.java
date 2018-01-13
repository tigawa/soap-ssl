
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>x_ActClassCareProvisionProcedureのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassCareProvisionProcedure">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PCPR"/>
 *     &lt;enumeration value="PROC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassCareProvisionProcedure")
@XmlEnum
public enum XActClassCareProvisionProcedure {

    PCPR,
    PROC;

    public String value() {
        return name();
    }

    public static XActClassCareProvisionProcedure fromValue(String v) {
        return valueOf(v);
    }

}
