
package mx.ihsa.integracion.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perfil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the descPerfil property.
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
     * Sets the value of the descPerfil property.
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
     * Gets the value of the idPerfil property.
     * 
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * Sets the value of the idPerfil property.
     * 
     */
    public void setIdPerfil(int value) {
        this.idPerfil = value;
    }

    /**
     * Gets the value of the observaciones property.
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
     * Sets the value of the observaciones property.
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
