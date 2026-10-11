import java.time.LocalDate;

public class CuentaDebito {

    private double saldo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private double porcentajeInteres;
    private String numeroCuenta;

    public CuentaDebito(double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double porcentajeInteres, String numeroCuenta) {
        if (saldo < 0) {
            throw new IllegalArgumentException("La cuenta de débito no puede tener un saldo negativo");
        }
        if (fechaEmision == null || fechaVencimiento == null) {
            throw new IllegalArgumentException("Las fechas no pueden estar vacías");
        }

        if (!fechaVencimiento.isAfter(fechaEmision)) {
            throw new IllegalArgumentException("La fecha de vencimiento debe ser posterior a la fecha de emisión");
        }
        this.saldo = saldo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeInteres = porcentajeInteres;
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {

        if (fechaVencimiento == null || !fechaVencimiento.isAfter(fechaEmision)) {
            throw new IllegalArgumentException("La fecha de vencimiento debe ser posterior a la fecha de emisión");
        }
        this.fechaVencimiento = fechaVencimiento;
    }


    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public String getNumeroCuenta() { return numeroCuenta; }

    public boolean equals(CuentaDebito cuenta) {
        return getNumeroCuenta().equals(cuenta.getNumeroCuenta());
    }

    public String toString() {
        return "Cuenta de Débito:" +
                "\nNúmero de cuenta: " + numeroCuenta +
                "\nSaldo: $" + saldo +
                "\nFecha de emisión: " + fechaEmision +
                "\nFecha de vencimiento: " + fechaVencimiento +
                "\nPorcentaje de interés: " + porcentajeInteres + "%";
    }

    public void depositar(double monto) {

    }

    public void pagar(double monto) {

    }

    public void generarIntereses() {

    }
}