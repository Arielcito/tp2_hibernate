package datos;

import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.util.List;

public class Ticket {
    protected int id;
    protected String titulo;
    protected String descripcion;
    protected String estado;
    protected String prioridad;
    protected LocalDateTime fechaCreacion;
    protected LocalDateTime fechaResolucion;
    protected Usuario creador;
    protected Usuario asignado;
    protected Categoria categoria;
    protected List<Etiqueta> etiquetas;
    protected List<Comentario> comentarios;
    protected List<Revision> revisiones;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Ticket() {}
    
    public Ticket(String titulo, String descripcion, String estado, String prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaCreacion = LocalDateTime.now();
    }
    
    public int getId() {
        return id;
    }
    
    protected void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getPrioridad() {
        return prioridad;
    }
    
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }
    
    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }
    
    public Usuario getCreador() {
        return creador;
    }
    
    public void setCreador(Usuario creador) {
        this.creador = creador;
    }
    
    public Usuario getAsignado() {
        return asignado;
    }
    
    public void setAsignado(Usuario asignado) {
        this.asignado = asignado;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }
    
    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }
    
    public List<Comentario> getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public List<Revision> getRevisiones() {
        return revisiones;
    }
    
    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
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
        return "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + 
               ", estado=" + estado + ", prioridad=" + prioridad;
    }
}