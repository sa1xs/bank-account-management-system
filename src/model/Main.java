
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate fechaEmision = LocalDate.now();
        LocalDate fechaVencimiento = fechaEmision.plusYears(5);

        Administrador administrador = new Administrador(
                "Carlos Rodríguez",
                "101110111",
                "admin@banco.com",
                "Admin@123"
        );

        Cliente cliente1 = new Cliente(
                "Juan Pérez",
                "202220222",
                "Masculino",
                "juan@correo.com",
                "Cliente@123",
                "Ingeniero",
                "San José"
        );

        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(
                1000,
                fechaEmision,
                fechaVencimiento,
                5,
                "AH001"
        );

        CuentaDebito cuentaDebito1 = new CuentaDebito(
                500,
                fechaEmision,
                fechaVencimiento,
                2,
                "DB001"
        );

        CuentaCredito cuentaCredito1 = new CuentaCredito(
                fechaEmision,
                fechaVencimiento,
                3,
                2500,
                "Visa",
                "CR001"
        );

        administrador.agregarCliente(cliente1);

        cliente1.agregarCuentaAhorro(cuentaAhorro1);
        cliente1.agregarCuentaDebito(cuentaDebito1);
        cliente1.agregarCuentaCredito(cuentaCredito1);


        System.out.println("=== OBJETOS CREADOS ===");
        System.out.println(administrador);
        System.out.println();
        System.out.println(cliente1);
        System.out.println();
        System.out.println(cuentaAhorro1);
        System.out.println();
        System.out.println(cuentaDebito1);
        System.out.println();
        System.out.println(cuentaCredito1);


        System.out.println("\n=== PRUEBA DE GETTERS ===");

        System.out.println("Administrador: "
                + administrador.getNombreCompleto());

        System.out.println("Cédula del cliente: "
                + cliente1.getCedula());

        System.out.println("Saldo de ahorro: $"
                + cuentaAhorro1.getSaldo());

        System.out.println("Saldo de débito: $"
                + cuentaDebito1.getSaldo());

        System.out.println("Saldo de crédito: $"
                + cuentaCredito1.getSaldo());

        System.out.println("Límite de crédito: $"
                + cuentaCredito1.getLimiteCredito());

        System.out.println("Clientes registrados: "
                + administrador.getClientes().size());


        System.out.println("\n=== PRUEBA DE SETTERS ===");

        administrador.setCorreo("administracion@banco.com");
        System.out.println("Nuevo correo del administrador: "
                + administrador.getCorreo());

        cliente1.setProfesion("Ingeniero de Software");
        System.out.println("Nueva profesión del cliente: "
                + cliente1.getProfesion());

        cuentaAhorro1.setPorcentajeInteres(6);
        System.out.println("Nuevo interés de ahorro: "
                + cuentaAhorro1.getPorcentajeInteres() + "%");

        cuentaDebito1.setPorcentajeInteres(3);
        System.out.println("Nuevo interés de débito: "
                + cuentaDebito1.getPorcentajeInteres() + "%");

        cuentaCredito1.setLimiteCredito(3000);
        System.out.println("Nuevo límite de crédito: $"
                + cuentaCredito1.getLimiteCredito());

        cuentaCredito1.setTipo("Mastercard");
        System.out.println("Nuevo tipo de crédito: "
                + cuentaCredito1.getTipo());


        System.out.println("\n=== PRUEBA DE EQUALS ===");

        System.out.println("Administrador: "
                + administrador.equals(administrador));

        System.out.println("Cliente: "
                + cliente1.equals(cliente1));

        System.out.println("Cuenta de ahorro: "
                + cuentaAhorro1.equals(cuentaAhorro1));

        System.out.println("Cuenta de débito: "
                + cuentaDebito1.equals(cuentaDebito1));

        System.out.println("Cuenta de crédito: "
                + cuentaCredito1.equals(cuentaCredito1));


        System.out.println("\n=== CLIENTES REGISTRADOS ===");
        administrador.listarClientes();

        System.out.println("\n=== CUENTAS DEL BANCO ===");
        administrador.listarCuentas();

        System.out.println("\n=== CUENTAS DEL CLIENTE ===");
        cliente1.listarCuentas();

        System.out.println("\n=== ESTADO DE CUENTA ===");
        cliente1.mostrarEstadoCuenta();

    }
}
