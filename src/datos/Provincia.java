package datos;

import java.sql.Timestamp;
import java.util.List;

public class Provincia {
    protected int id;
    protected String nombre;
    protected List<Localidad> localidades;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Provincia() {}
    
    public Provincia(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    protected void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Localidad> getLocalidades() {
        return localidades;
    }
    
    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }
    
    public Timestamp getCreateAt() {
        return createAt;
    }
    
    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
    
    public Timestamp getUpdateAt() {
        return updateAt;
    }
    
    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre;
    }
}
