package datos;

import java.sql.Timestamp;

public class Localidad {
    protected int id;
    protected String nombre;
    protected Provincia provincia;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Localidad() {}
    
    public Localidad(String nombre) {
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
    
    public Provincia getProvincia() {
        return provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
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
