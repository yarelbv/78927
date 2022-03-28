package mx.uv.t4is.saludos;

import java.util.ArrayList;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import https.t4is_uv_mx.saludos.*;

@Endpoint
public class SaludosEndPoint {
    ArrayList<Saludos> lista = new ArrayList<>();
    private int i = 1;

    @PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "SaludarRequest")
    @ResponsePayload
    public SaludarResponse saludar(@RequestPayload SaludarRequest nombre){
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setRespuesta("Hola "+ nombre.getNombre());
        //lista.add(nombre.getNombre());
        Saludos e = new Saludos();
        e.setId(i++);
        e.setNombre(nombre.getNombre);
        lista.add(e);
        return respuesta;
    }   
    
    @PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "BuscarSaludosRequest")
    @ResponsePayload
    public BuscarSaludosResponse buscar(){
        BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
        //Implementar la devolución de la lista
        for(Saludos s : lista){
            //System.out.println(s);
            //Saludos e = new Saludos();
            //e.setNombre(s);
            //e.setId(1);
            respuesta.getSaludos().add(s);
        }
        return respuesta;
    }

    @PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "ModificarSaludosRequest")
    @ResponsePayload
    public ModificarSaludosResponse modificar(@RequestPayload ModificarSaludoRequest peticion) {
        ModificarSaludosResponse respuesta = new ModificarSaludosResponse();
        Saludos e = new Saludos();
        e.setNombre(peticion.getNombre());
        e.setId(peticion.getId());
        lista.set(peticion.getId() -1, e);
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "BorrarSaludosRequest")
    @ResponsePayload
    public BorrarSaludoResponse modificar(@RequestPayload BorrarSaludoRequest peticion) {
        BorrarSaludoResponse respuesta = new BorrarSaludoResponse();
        BuscarSaludoResponse.saludos e = new BuscarSaludoResponse.Saludos();
        e.setId(peticion.getId());
        lista.remove(peticion.getId()-1);
        respuesta.setRespuesta(true);
        i=1;
        for(int j = 0; j<lista.size();j++){
            lista.get(j).setId(j+1);
            i++;
        }
        return respuesta;
    }
    
}