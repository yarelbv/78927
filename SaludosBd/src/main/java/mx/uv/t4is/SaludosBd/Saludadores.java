package mx.uv.t4is.SaludosBd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//DTD
@Entity
public class Saludadores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String nombre;

    public Integer getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setId(Integer id){
        this.id = id;
    }
}
