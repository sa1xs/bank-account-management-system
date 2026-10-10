import java.time.LocalDate;

public class CuentaDebito {

    private double saldo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private double porcentajeInteres;
    private String numeroCuenta;

    public CuentaDebito(double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double porcentajeInteres, String numeroCuenta) {
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
}