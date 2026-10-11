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
        setContrasena(contrasena);
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

        if (contrasena == null ||
                !contrasena.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9\\s]).{8,}")) {
            throw new IllegalArgumentException("La contraseña debe tener mínimo 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial");
        }
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

    public void agregarCuentaAhorro(CuentaAhorro cuenta) {
        if (cuenta != null) {
            cuentasAhorro.add(cuenta);
        }
    }

    public void agregarCuentaDebito(CuentaDebito cuenta) {
        if (cuenta != null) {
            cuentasDebito.add(cuenta);
        }
    }

    public void agregarCuentaCredito(CuentaCredito cuenta) {
        if (cuenta != null) {
            cuentasCredito.add(cuenta);
        }
    }

    public void listarCuentas() {
        System.out.println("Cuentas de: " + nombreCompleto);
        for (CuentaAhorro cuenta : cuentasAhorro) {
            System.out.println(cuenta);
            System.out.println();
        }
        for (CuentaDebito cuenta : cuentasDebito) {
            System.out.println(cuenta);
            System.out.println();
        }
        for (CuentaCredito cuenta : cuentasCredito) {
            System.out.println(cuenta);
            System.out.println();
        }
    }

    public void mostrarEstadoCuenta() {
        double total = 0;

        System.out.println("Estado de cuenta de: " + nombreCompleto);

        for (CuentaAhorro cuenta : cuentasAhorro) {
            System.out.println("Ahorro - " + cuenta.getNumeroCuenta() + ": $" + cuenta.getSaldo());
            total += cuenta.getSaldo();
        }

        for (CuentaDebito cuenta : cuentasDebito) {
            System.out.println("Débito - " + cuenta.getNumeroCuenta() + ": $" + cuenta.getSaldo());
            total += cuenta.getSaldo();
        }

        for (CuentaCredito cuenta : cuentasCredito) {
            System.out.println("Crédito - " + cuenta.getNumeroCuenta() + ": -$" + cuenta.getSaldo());
            total -= cuenta.getSaldo();
        }

        System.out.println("Saldo consolidado: $" + total);
    }
}