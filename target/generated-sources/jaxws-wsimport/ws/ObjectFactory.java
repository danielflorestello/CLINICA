
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _AgregarResponse_QNAME = new QName("http://WS/", "agregarResponse");
    private final static QName _Validar_QNAME = new QName("http://WS/", "validar");
    private final static QName _Listar_QNAME = new QName("http://WS/", "listar");
    private final static QName _ListarResponse_QNAME = new QName("http://WS/", "listarResponse");
    private final static QName _Agregar_QNAME = new QName("http://WS/", "agregar");
    private final static QName _ValidarResponse_QNAME = new QName("http://WS/", "validarResponse");
    private final static QName _ListarUbigeo_QNAME = new QName("http://WS/", "listarUbigeo");
    private final static QName _ListarUbigeoResponse_QNAME = new QName("http://WS/", "listarUbigeoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
     * Create an instance of {@link Validar }
     * 
     */
    public Validar createValidar() {
        return new Validar();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link ValidarResponse }
     * 
     */
    public ValidarResponse createValidarResponse() {
        return new ValidarResponse();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link ListarUbigeo }
     * 
     */
    public ListarUbigeo createListarUbigeo() {
        return new ListarUbigeo();
    }

    /**
     * Create an instance of {@link ListarUbigeoResponse }
     * 
     */
    public ListarUbigeoResponse createListarUbigeoResponse() {
        return new ListarUbigeoResponse();
    }

    /**
     * Create an instance of {@link UbigeoBean }
     * 
     */
    public UbigeoBean createUbigeoBean() {
        return new UbigeoBean();
    }

    /**
     * Create an instance of {@link PacienteBean }
     * 
     */
    public PacienteBean createPacienteBean() {
        return new PacienteBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "agregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "validar")
    public JAXBElement<Validar> createValidar(Validar value) {
        return new JAXBElement<Validar>(_Validar_QNAME, Validar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "validarResponse")
    public JAXBElement<ValidarResponse> createValidarResponse(ValidarResponse value) {
        return new JAXBElement<ValidarResponse>(_ValidarResponse_QNAME, ValidarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUbigeo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listarUbigeo")
    public JAXBElement<ListarUbigeo> createListarUbigeo(ListarUbigeo value) {
        return new JAXBElement<ListarUbigeo>(_ListarUbigeo_QNAME, ListarUbigeo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUbigeoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listarUbigeoResponse")
    public JAXBElement<ListarUbigeoResponse> createListarUbigeoResponse(ListarUbigeoResponse value) {
        return new JAXBElement<ListarUbigeoResponse>(_ListarUbigeoResponse_QNAME, ListarUbigeoResponse.class, null, value);
    }

}
