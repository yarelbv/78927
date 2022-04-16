package mx.uv.EjercicioSS;

import java.util.ArrayList;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import https.uv_mx.ejercicio_ss.*;
import https.uv_mx.ejercicio_ss.BuscarListaResponse.Tareas;

@Endpoint
public class ListaEndPoint {
    ArrayList<Tareas> tareas = new ArrayList<>();
    private int i = 1;

    @PayloadRoot(namespace = "https://uv.mx/Ejercicio-SS", localPart = "ListaRequest")
    @ResponsePayload
    public ListaResponse saludar(@RequestPayload ListaRequest tarea){
        ListaResponse respuesta = new ListaResponse();
        respuesta.setRespuesta("Tarea Pendiente: "+ tareas.getTarea());
        Tareas e = new Tareas();
        e.setId(i++);
        e.setTarea(tareas.getTarea());
        tareas.add(e);
        return respuesta;
    }   
    
    @PayloadRoot(namespace = "https://uv.mx/Ejercicio-SS", localPart = "BuscarListaRequest")
    @ResponsePayload
    public BuscarListaResponse buscar(){
        BuscarListaResponse respuesta = new BuscarListaResponse();
        for(Tareas s : tareas){
            respuesta.getTarea().add(s);
        }
        return respuesta;
    }

    @PayloadRoot(namespace = "https://uv.mx/Ejercicio-SS", localPart = "ModificarListaRequest")
    @ResponsePayload
    public ModificarListaResponse modificar(@RequestPayload ModificarListaRequest peticion) {
        ModificarListaResponse respuesta = new ModificarListaResponse();
        Tareas e = new Tareas();
        e.setTarea(peticion.getTarea());
        e.setId(peticion.getId());
        tareas.set(peticion.getId() -1, e);
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(namespace = "https://uv.mx/Ejercicio-SS", localPart = "BorrarListaRequest")
    @ResponsePayload
    public BorrarListaResponse modificar(@RequestPayload BorrarListaRequest peticion) {
        BorrarListaResponse respuesta = new BorrarListaResponse();
        Tareas e = new BuscarListaResponse.Tareas();
        e.setId(peticion.getId());
        tareas.remove(peticion.getId()-1);
        respuesta.setRespuesta(true);
        i=1;
        for(int j = 0; j<tareas.size();j++){
            tareas.get(j).setId(j+1);
            i++;
        }
        return respuesta;
    }
    
}