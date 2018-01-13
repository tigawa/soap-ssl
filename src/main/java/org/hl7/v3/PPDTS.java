
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PPD_TS complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="PPD_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}TS">
 *       &lt;sequence>
 *         &lt;element name="standardDeviation" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="distributionType" type="{urn:hl7-org:v3}ProbabilityDistributionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PPD_TS", propOrder = {
    "standardDeviation"
})
@XmlSeeAlso({
    IVXBPPDTS.class,
    SXCMPPDTS.class
})
public class PPDTS
    extends TS
{

    protected PQ standardDeviation;
    @XmlAttribute(name = "distributionType")
    protected ProbabilityDistributionType distributionType;

    /**
     * standardDeviationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * standardDeviationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setStandardDeviation(PQ value) {
        this.standardDeviation = value;
    }

    /**
     * distributionTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityDistributionType }
     *     
     */
    public ProbabilityDistributionType getDistributionType() {
        return distributionType;
    }

    /**
     * distributionTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityDistributionType }
     *     
     */
    public void setDistributionType(ProbabilityDistributionType value) {
        this.distributionType = value;
    }

}
