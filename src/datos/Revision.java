package datos;

import java.time.LocalDateTime;
import java.sql.Timestamp;

public class Revision {
    protected int id;
    protected LocalDateTime fechaCambio;
    protected String campoModificado;
    protected String valorAnterior;
    protected String valorNuevo;
    protected String observaciones;
    protected Ticket ticket;
    protected Usuario usuarioModificacion;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Revision() {}
    
    public Revision(LocalDateTime fechaCambio, String campoModificado, String valorAnterior, String valorNuevo) {
        this.fechaCambio = fechaCambio;
        this.campoModificado = campoModificado;
        this.valorAnterior = valorAnterior;
        this.valorNuevo = valorNuevo;
    }
    
    public int getId() {
        return id;
    }
    
    protected void setId(int id) {
        this.id = id;
    }
    
    public LocalDateTime getFechaCambio() {
        return fechaCambio;
    }
    
    public void setFechaCambio(LocalDateTime fechaCambio) {
        this.fechaCambio = fechaCambio;
    }
    
    public String getCampoModificado() {
        return campoModificado;
    }
    
    public void setCampoModificado(String campoModificado) {
        this.campoModificado = campoModificado;
    }
    
    public String getValorAnterior() {
        return valorAnterior;
    }
    
    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }
    
    public String getValorNuevo() {
        return valorNuevo;
    }
    
    public void setValorNuevo(String valorNuevo) {
        this.valorNuevo = valorNuevo;
    }
    
    public String getObservaciones() {
        return observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public Ticket getTicket() {
        return ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public Usuario getUsuarioModificacion() {
        return usuarioModificacion;
    }
    
    public void setUsuarioModificacion(Usuario usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
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
        return "id=" + id + ", fechaCambio=" + fechaCambio + ", campoModificado=" + campoModificado + 
               ", valorAnterior=" + valorAnterior + ", valorNuevo=" + valorNuevo;
    }
}
