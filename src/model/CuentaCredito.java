import java.time.LocalDate;

public class CuentaCredito {

    private double saldo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private double porcentajeInteres;
    private double limiteCredito;
    private String tipo;
    private String numeroCuenta;

    public CuentaCredito(double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double porcentajeInteres, double limiteCredito, String tipo, String numeroCuenta) {
        this.saldo = saldo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeInteres = porcentajeInteres;
        this.limiteCredito = limiteCredito;
        this.tipo = tipo;
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

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroCuenta() { return numeroCuenta; }

    public boolean equals(CuentaCredito cuenta) {
        return getNumeroCuenta().equals(cuenta.getNumeroCuenta());
    }

    public String toString() {
        return "Cuenta de Crédito:" +
                "\nNúmero de cuenta: " + numeroCuenta +
                "\nTipo: " + tipo +
                "\nSaldo adeudado: $" + saldo +
                "\nLímite de crédito: $" + limiteCredito +
                "\nFecha de emisión: " + fechaEmision +
                "\nFecha de vencimiento: " + fechaVencimiento +
                "\nPorcentaje de interés: " + porcentajeInteres + "%";
    }
}