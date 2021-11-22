
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ubigeoBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ubigeoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_ubigeo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcionUbi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubigeoBean", propOrder = {
    "codUbigeo",
    "descripcionUbi"
})
public class UbigeoBean {

    @XmlElement(name = "cod_ubigeo")
    protected int codUbigeo;
    protected String descripcionUbi;

    /**
     * Obtiene el valor de la propiedad codUbigeo.
     * 
     */
    public int getCodUbigeo() {
        return codUbigeo;
    }

    /**
     * Define el valor de la propiedad codUbigeo.
     * 
     */
    public void setCodUbigeo(int value) {
        this.codUbigeo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionUbi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionUbi() {
        return descripcionUbi;
    }

    /**
     * Define el valor de la propiedad descripcionUbi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionUbi(String value) {
        this.descripcionUbi = value;
    }

}
