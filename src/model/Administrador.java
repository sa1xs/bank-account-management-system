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
        setContrasena(contrasena);
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

        if (contrasena == null ||
                !contrasena.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9\\s]).{8,}")) {
            throw new IllegalArgumentException("La contraseña debe tener mínimo 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial");
        }
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

    public void agregarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarCuentas() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println("Cuentas de: " + cliente.getNombreCompleto());
            for (CuentaAhorro cuenta : cliente.getCuentasAhorro()) {
                System.out.println(cuenta);
                System.out.println();
            }
            for (CuentaDebito cuenta : cliente.getCuentasDebito()) {
                System.out.println(cuenta);
                System.out.println();
            }
            for (CuentaCredito cuenta : cliente.getCuentasCredito()) {
                System.out.println(cuenta);
                System.out.println();
            }
        }
    }
}