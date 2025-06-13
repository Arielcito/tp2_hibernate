package datos;

import java.sql.Timestamp;
import java.util.List;

public class Etiqueta {
    protected int id;
    protected String nombre;
    protected List<Ticket> tickets;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Etiqueta() {}
    
    public Etiqueta(String nombre) {
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
    
    public List<Ticket> getTickets() {
        return tickets;
    }
    
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
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
