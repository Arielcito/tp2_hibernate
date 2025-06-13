package datos;

import java.sql.Timestamp;

public class Direccion {
    protected int id;
    protected String calle;
    protected String nro;
    protected String codigoPostal;
    protected Localidad localidad;
    protected boolean fiscal;
    protected Timestamp createAt;
    protected Timestamp updateAt;
    
    public Direccion() {}
    
    public Direccion(String calle, String nro, String codigoPostal) {
        this.calle = calle;
        this.nro = nro;
        this.codigoPostal = codigoPostal;
    }
    
    public int getId() {
        return id;
    }
    
    protected void setId(int id) {
        this.id = id;
    }
    
    public String getCalle() {
        return calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    public String getNro() {
        return nro;
    }
    
    public void setNro(String nro) {
        this.nro = nro;
    }
    
    public String getCodigoPostal() {
        return codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public Localidad getLocalidad() {
        return localidad;
    }
    
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    
    public boolean isFiscal() {
        return fiscal;
    }
    
    public void setFiscal(boolean fiscal) {
        this.fiscal = fiscal;
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
        return "id=" + id + ", calle=" + calle + ", nro=" + nro + ", codigoPostal=" + codigoPostal + ", fiscal=" + fiscal;
    }
}