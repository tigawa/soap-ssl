
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IVL_PPD_PQ complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="IVL_PPD_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_PPD_PQ">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_PPD_PQ"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:hl7-org:v3}PPD_PQ" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PPD_PQ" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PPD_PQ"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PPD_PQ"/>
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PPD_PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:hl7-org:v3}PPD_PQ"/>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PPD_PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_PPD_PQ", propOrder = {
    "rest"
})
public class IVLPPDPQ
    extends SXCMPPDPQ
{

    @XmlElementRefs({
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends PPDPQ>> rest;

    /**
     * 残りのコンテンツ・モデルを取得します。
     * 
     * <p>
     * 次の理由でこの"catch-all"プロパティを取得しています。
     * このフィールド名"High"は、スキーマの2つの異なる部分で使用されています。関連項目: 
     * 行596/file:/Users/igawataiichi/workspace/Soap-SSL/src/main/resources/wsdl/ftp.ihe.net/TF_Implementation_Material/ITI/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * 行587/file:/Users/igawataiichi/workspace/Soap-SSL/src/main/resources/wsdl/ftp.ihe.net/TF_Implementation_Material/ITI/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * <p>
     * このプロパティを削除するには、次の両方の宣言の1つにプロパティ・カスタマイズを適用して、
     * 名前を変更します。
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBPPDPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBPPDPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PPDPQ>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends PPDPQ>>();
        }
        return this.rest;
    }

}
