import java.util.ArrayList;

public class Administrador {

    private String nombreCompleto;
    private String cedula;
    private String correo;
    private String contrasena;
    private ArrayList<Cliente> clientes;

    public Administrador(String nombreCompleto, String cedula, String correo, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
        this.clientes = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean equals(Administrador admin) {
        return getCedula().equals(admin.getCedula());
    }

    public String toString() {
        return "Administrador:" +
                "\nNombre completo: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nCorreo: " + correo +
                "\nClientes registrados: " + clientes.size();
    }
}