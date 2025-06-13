package datos;

public class Tecnico extends Usuario {
    protected String nroContacto;
    protected String empresa;
    protected Area area;
    
    public Tecnico() {}
    
    public Tecnico(String nombre, String nombreUsuario, String contrasenia, String email, String nroContacto, String empresa) {
        super(nombre, nombreUsuario, contrasenia, email);
        this.nroContacto = nroContacto;
        this.empresa = empresa;
    }
    
    public String getNroContacto() {
        return nroContacto;
    }
    
    public void setNroContacto(String nroContacto) {
        this.nroContacto = nroContacto;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public Area getArea() {
        return area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", nroContacto=" + nroContacto + ", empresa=" + empresa;
    }
}