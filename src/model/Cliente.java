import java.util.ArrayList;

public class Cliente {

    private String nombreCompleto;
    private String cedula;
    private String sexo;
    private String correo;
    private String contrasena;
    private String profesion;
    private String direccion;
    private ArrayList<CuentaAhorro> cuentasAhorro = new ArrayList<>();
    private ArrayList<CuentaDebito> cuentasDebito = new ArrayList<>();
    private ArrayList<CuentaCredito> cuentasCredito = new ArrayList<>();

    public Cliente(String nombreCompleto, String cedula, String sexo, String correo, String contrasena, String profesion, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.sexo = sexo;
        this.correo = correo;
        this.contrasena = contrasena;
        this.profesion = profesion;
        this.direccion = direccion;
        this.cuentasAhorro = new ArrayList<>();
        this.cuentasDebito = new ArrayList<>();
        this.cuentasCredito = new ArrayList<>();
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CuentaAhorro> getCuentasAhorro() {
        return cuentasAhorro;
    }

    public void setCuentasAhorro(ArrayList<CuentaAhorro> cuentasAhorro) {
        this.cuentasAhorro = cuentasAhorro;
    }

    public ArrayList<CuentaDebito> getCuentasDebito() {
        return cuentasDebito;
    }

    public void setCuentasDebito(ArrayList<CuentaDebito> cuentasDebito) {
        this.cuentasDebito = cuentasDebito;
    }

    public ArrayList<CuentaCredito> getCuentasCredito() {
        return cuentasCredito;
    }

    public void setCuentasCredito(ArrayList<CuentaCredito> cuentasCredito) {
        this.cuentasCredito = cuentasCredito;
    }

    public boolean equals(Cliente cliente) {
        return getCedula().equals(cliente.getCedula());
    }

    public String toString() {
        return "Cliente:" +
                "\nNombre completo: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nSexo: " + sexo +
                "\nCorreo: " + correo +
                "\nProfesión: " + profesion +
                "\nDirección: " + direccion +
                "\nCuentas de ahorro: " + cuentasAhorro.size() +
                "\nCuentas de débito: " + cuentasDebito.size() +
                "\nCuentas de crédito: " + cuentasCredito.size();
    }
}