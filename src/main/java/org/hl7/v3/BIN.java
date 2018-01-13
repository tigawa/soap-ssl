
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Binary data is a raw block of bits. Binary data is a
 *             protected type that MUST not be used outside the data
 *             type specification.
 *          
 * 
 * <p>BIN complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="BIN">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;attribute name="representation" type="{urn:hl7-org:v3}BinaryDataEncoding" default="TXT" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIN")
@XmlSeeAlso({
    ED.class
})
public abstract class BIN
    extends ANY
{

    @XmlAttribute(name = "representation")
    protected BinaryDataEncoding representation;

    /**
     * representationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public BinaryDataEncoding getRepresentation() {
        if (representation == null) {
            return BinaryDataEncoding.TXT;
        } else {
            return representation;
        }
    }

    /**
     * representationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public void setRepresentation(BinaryDataEncoding value) {
        this.representation = value;
    }

}
