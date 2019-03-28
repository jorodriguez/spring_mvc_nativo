
package mx.ihsa.integracion.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.ihsa.integracion.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Guardar_QNAME = new QName("http://webservice.integracion.ihsa.mx/", "guardar");
    private final static QName _Eliminar_QNAME = new QName("http://webservice.integracion.ihsa.mx/", "eliminar");
    private final static QName _GetListaResponse_QNAME = new QName("http://webservice.integracion.ihsa.mx/", "getListaResponse");
    private final static QName _GetLista_QNAME = new QName("http://webservice.integracion.ihsa.mx/", "getLista");
    private final static QName _EliminarResponse_QNAME = new QName("http://webservice.integracion.ihsa.mx/", "eliminarResponse");
    private final static QName _GuardarResponse_QNAME = new QName("http://webservice.integracion.ihsa.mx/", "guardarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.ihsa.integracion.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Guardar }
     * 
     */
    public Guardar createGuardar() {
        return new Guardar();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link GetListaResponse }
     * 
     */
    public GetListaResponse createGetListaResponse() {
        return new GetListaResponse();
    }

    /**
     * Create an instance of {@link GetLista }
     * 
     */
    public GetLista createGetLista() {
        return new GetLista();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link GuardarResponse }
     * 
     */
    public GuardarResponse createGuardarResponse() {
        return new GuardarResponse();
    }

    /**
     * Create an instance of {@link Tipomovimiento }
     * 
     */
    public Tipomovimiento createTipomovimiento() {
        return new Tipomovimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guardar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.integracion.ihsa.mx/", name = "guardar")
    public JAXBElement<Guardar> createGuardar(Guardar value) {
        return new JAXBElement<Guardar>(_Guardar_QNAME, Guardar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.integracion.ihsa.mx/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.integracion.ihsa.mx/", name = "getListaResponse")
    public JAXBElement<GetListaResponse> createGetListaResponse(GetListaResponse value) {
        return new JAXBElement<GetListaResponse>(_GetListaResponse_QNAME, GetListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.integracion.ihsa.mx/", name = "getLista")
    public JAXBElement<GetLista> createGetLista(GetLista value) {
        return new JAXBElement<GetLista>(_GetLista_QNAME, GetLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.integracion.ihsa.mx/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.integracion.ihsa.mx/", name = "guardarResponse")
    public JAXBElement<GuardarResponse> createGuardarResponse(GuardarResponse value) {
        return new JAXBElement<GuardarResponse>(_GuardarResponse_QNAME, GuardarResponse.class, null, value);
    }

}
