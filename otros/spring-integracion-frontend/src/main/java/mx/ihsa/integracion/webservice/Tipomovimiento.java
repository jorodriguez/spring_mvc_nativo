
package mx.ihsa.integracion.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipomovimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipomovimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descTipMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTipMov" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipomovimiento", propOrder = {
    "descTipMov",
    "idTipMov"
})
public class Tipomovimiento {

    protected String descTipMov;
    protected int idTipMov;

    /**
     * Obtiene el valor de la propiedad descTipMov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipMov() {
        return descTipMov;
    }

    /**
     * Define el valor de la propiedad descTipMov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipMov(String value) {
        this.descTipMov = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipMov.
     * 
     */
    public int getIdTipMov() {
        return idTipMov;
    }

    /**
     * Define el valor de la propiedad idTipMov.
     * 
     */
    public void setIdTipMov(int value) {
        this.idTipMov = value;
    }

}
