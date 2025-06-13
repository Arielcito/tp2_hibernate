package datos;

public class Cliente extends Usuario {
    protected int nroCliente;
    protected String plan;
    protected boolean particular;
    protected Direccion direccion;
    
    public Cliente() {}
    
    public Cliente(String nombre, String nombreUsuario, String contrasenia, String email, int nroCliente, String plan) {
        super(nombre, nombreUsuario, contrasenia, email);
        this.nroCliente = nroCliente;
        this.plan = plan;
    }
    
    public int getNroCliente() {
        return nroCliente;
    }
    
    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }
    
    public String getPlan() {
        return plan;
    }
    
    public void setPlan(String plan) {
        this.plan = plan;
    }
    
    public boolean isParticular() {
        return particular;
    }
    
    public void setParticular(boolean particular) {
        this.particular = particular;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", nroCliente=" + nroCliente + ", plan=" + plan + ", particular=" + particular;
    }
}
