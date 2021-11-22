
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombrepaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apepaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dnipaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechNacipaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexopaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telfpaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correopaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_ubigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregar", propOrder = {
    "nombrepaci",
    "apepaci",
    "usuario",
    "contrase\u00f1a",
    "dnipaci",
    "fechNacipaci",
    "sexopaci",
    "telfpaci",
    "correopaci",
    "codUbigeo"
})
public class Agregar {

    protected String nombrepaci;
    protected String apepaci;
    protected String usuario;
    protected String contraseña;
    protected String dnipaci;
    protected String fechNacipaci;
    protected String sexopaci;
    protected String telfpaci;
    protected String correopaci;
    @XmlElement(name = "cod_ubigeo")
    protected String codUbigeo;

    /**
     * Obtiene el valor de la propiedad nombrepaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrepaci() {
        return nombrepaci;
    }

    /**
     * Define el valor de la propiedad nombrepaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrepaci(String value) {
        this.nombrepaci = value;
    }

    /**
     * Obtiene el valor de la propiedad apepaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApepaci() {
        return apepaci;
    }

    /**
     * Define el valor de la propiedad apepaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApepaci(String value) {
        this.apepaci = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
    }

    /**
     * Obtiene el valor de la propiedad dnipaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnipaci() {
        return dnipaci;
    }

    /**
     * Define el valor de la propiedad dnipaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnipaci(String value) {
        this.dnipaci = value;
    }

    /**
     * Obtiene el valor de la propiedad fechNacipaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechNacipaci() {
        return fechNacipaci;
    }

    /**
     * Define el valor de la propiedad fechNacipaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechNacipaci(String value) {
        this.fechNacipaci = value;
    }

    /**
     * Obtiene el valor de la propiedad sexopaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexopaci() {
        return sexopaci;
    }

    /**
     * Define el valor de la propiedad sexopaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexopaci(String value) {
        this.sexopaci = value;
    }

    /**
     * Obtiene el valor de la propiedad telfpaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelfpaci() {
        return telfpaci;
    }

    /**
     * Define el valor de la propiedad telfpaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelfpaci(String value) {
        this.telfpaci = value;
    }

    /**
     * Obtiene el valor de la propiedad correopaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreopaci() {
        return correopaci;
    }

    /**
     * Define el valor de la propiedad correopaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreopaci(String value) {
        this.correopaci = value;
    }

    /**
     * Obtiene el valor de la propiedad codUbigeo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUbigeo() {
        return codUbigeo;
    }

    /**
     * Define el valor de la propiedad codUbigeo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUbigeo(String value) {
        this.codUbigeo = value;
    }

}
