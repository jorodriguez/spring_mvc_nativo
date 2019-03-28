
package mx.ihsa.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para perfil complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="perfil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descPerfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPerfil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "perfil", propOrder = {
    "descPerfil",
    "idPerfil",
    "observaciones"
})
public class Perfil {

    protected String descPerfil;
    protected int idPerfil;
    protected String observaciones;

    /**
     * Obtiene el valor de la propiedad descPerfil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPerfil() {
        return descPerfil;
    }

    /**
     * Define el valor de la propiedad descPerfil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPerfil(String value) {
        this.descPerfil = value;
    }

    /**
     * Obtiene el valor de la propiedad idPerfil.
     * 
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * Define el valor de la propiedad idPerfil.
     * 
     */
    public void setIdPerfil(int value) {
        this.idPerfil = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

}
