//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci\u00f3n de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perder\u00e1n si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.16 a las 04:35:54 PM CDT 
//


package https.uv_mx.ejercicio_ss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.uv_mx.ejercicio_ss package. 
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

    private final static QName _BuscarListaRequest_QNAME = new QName("https://uv.mx/Ejercicio-SS", "BuscarListaRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.uv_mx.ejercicio_ss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarListaResponse }
     * 
     */
    public BuscarListaResponse createBuscarListaResponse() {
        return new BuscarListaResponse();
    }

    /**
     * Create an instance of {@link ListaRequest }
     * 
     */
    public ListaRequest createListaRequest() {
        return new ListaRequest();
    }

    /**
     * Create an instance of {@link ListaResponse }
     * 
     */
    public ListaResponse createListaResponse() {
        return new ListaResponse();
    }

    /**
     * Create an instance of {@link BuscarListaResponse.Tareas }
     * 
     */
    public BuscarListaResponse.Tareas createBuscarListaResponseTareas() {
        return new BuscarListaResponse.Tareas();
    }

    /**
     * Create an instance of {@link ModificarListaRequest }
     * 
     */
    public ModificarListaRequest createModificarListaRequest() {
        return new ModificarListaRequest();
    }

    /**
     * Create an instance of {@link ModificarListaResponse }
     * 
     */
    public ModificarListaResponse createModificarListaResponse() {
        return new ModificarListaResponse();
    }

    /**
     * Create an instance of {@link BorrarListaRequest }
     * 
     */
    public BorrarListaRequest createBorrarListaRequest() {
        return new BorrarListaRequest();
    }

    /**
     * Create an instance of {@link BorrarListaResponse }
     * 
     */
    public BorrarListaResponse createBorrarListaResponse() {
        return new BorrarListaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://uv.mx/Ejercicio-SS", name = "BuscarListaRequest")
    public JAXBElement<Object> createBuscarListaRequest(Object value) {
        return new JAXBElement<Object>(_BuscarListaRequest_QNAME, Object.class, null, value);
    }

}
