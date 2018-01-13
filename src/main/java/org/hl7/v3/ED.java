
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *             Data that is primarily intended for human interpretation
 *             or for further machine processing is outside the scope of
 *             HL7. This includes unformatted or formatted written language,
 *             multimedia data, or structured information as defined by a
 *             different standard (e.g., XML-signatures.)  Instead of the
 *             data itself, an ED may contain 
 *             only a reference (see TEL.) Note
 *             that the ST data type is a
 *             specialization of 
 *             when the  is text/plain.
 *          
 * 
 * <p>ED complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ED">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}BIN">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{urn:hl7-org:v3}TEL" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{urn:hl7-org:v3}thumbnail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" type="{urn:hl7-org:v3}cs" default="text/plain" />
 *       &lt;attribute name="language" type="{urn:hl7-org:v3}cs" />
 *       &lt;attribute name="compression" type="{urn:hl7-org:v3}CompressionAlgorithm" />
 *       &lt;attribute name="integrityCheck" type="{urn:hl7-org:v3}bin" />
 *       &lt;attribute name="integrityCheckAlgorithm" type="{urn:hl7-org:v3}IntegrityCheckAlgorithm" default="SHA-1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED", propOrder = {
    "reference",
    "thumbnail"
})
@XmlSeeAlso({
    ST.class,
    Thumbnail.class
})
public class ED
    extends BIN
{

    protected TEL reference;
    protected Thumbnail thumbnail;
    @XmlAttribute(name = "mediaType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaType;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "compression")
    protected CompressionAlgorithm compression;
    @XmlAttribute(name = "integrityCheck")
    protected byte[] integrityCheck;
    @XmlAttribute(name = "integrityCheckAlgorithm")
    protected IntegrityCheckAlgorithm integrityCheckAlgorithm;

    /**
     * referenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TEL }
     *     
     */
    public TEL getReference() {
        return reference;
    }

    /**
     * referenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TEL }
     *     
     */
    public void setReference(TEL value) {
        this.reference = value;
    }

    /**
     * thumbnailプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Thumbnail }
     *     
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * thumbnailプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Thumbnail }
     *     
     */
    public void setThumbnail(Thumbnail value) {
        this.thumbnail = value;
    }

    /**
     * mediaTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        if (mediaType == null) {
            return "text/plain";
        } else {
            return mediaType;
        }
    }

    /**
     * mediaTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * languageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * languageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * compressionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CompressionAlgorithm }
     *     
     */
    public CompressionAlgorithm getCompression() {
        return compression;
    }

    /**
     * compressionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionAlgorithm }
     *     
     */
    public void setCompression(CompressionAlgorithm value) {
        this.compression = value;
    }

    /**
     * integrityCheckプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIntegrityCheck() {
        return integrityCheck;
    }

    /**
     * integrityCheckプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIntegrityCheck(byte[] value) {
        this.integrityCheck = value;
    }

    /**
     * integrityCheckAlgorithmプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link IntegrityCheckAlgorithm }
     *     
     */
    public IntegrityCheckAlgorithm getIntegrityCheckAlgorithm() {
        if (integrityCheckAlgorithm == null) {
            return IntegrityCheckAlgorithm.SHA_1;
        } else {
            return integrityCheckAlgorithm;
        }
    }

    /**
     * integrityCheckAlgorithmプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrityCheckAlgorithm }
     *     
     */
    public void setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        this.integrityCheckAlgorithm = value;
    }

}
