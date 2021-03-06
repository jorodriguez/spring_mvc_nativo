
package mx.ihsa.soap.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PerfilWebservice", targetNamespace = "http://webservice.soap.ihsa.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PerfilWebservice {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "insertar", targetNamespace = "http://webservice.soap.ihsa.mx/", className = "mx.ihsa.soap.webservice.Insertar")
    @ResponseWrapper(localName = "insertarResponse", targetNamespace = "http://webservice.soap.ihsa.mx/", className = "mx.ihsa.soap.webservice.InsertarResponse")
    @Action(input = "http://webservice.soap.ihsa.mx/PerfilWebservice/insertarRequest", output = "http://webservice.soap.ihsa.mx/PerfilWebservice/insertarResponse")
    public void insertar(
        @WebParam(name = "arg0", targetNamespace = "")
        Perfil arg0);

    /**
     * 
     * @return
     *     returns java.util.List<mx.ihsa.soap.webservice.Perfil>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://webservice.soap.ihsa.mx/", className = "mx.ihsa.soap.webservice.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://webservice.soap.ihsa.mx/", className = "mx.ihsa.soap.webservice.ListarResponse")
    @Action(input = "http://webservice.soap.ihsa.mx/PerfilWebservice/listarRequest", output = "http://webservice.soap.ihsa.mx/PerfilWebservice/listarResponse")
    public List<Perfil> listar();

}
