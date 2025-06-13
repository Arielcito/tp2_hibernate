package datos;

import java.sql.Timestamp;
import java.util.List;

public class Area {
    protected int id;
    protected String nombre;
    protected List<Tecnico> tecnicos;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Area() {}
    
    public Area(String nombre) {
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
    
    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }
    
    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
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
