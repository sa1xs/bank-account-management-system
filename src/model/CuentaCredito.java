import java.time.LocalDate;

public class CuentaCredito {

    private double saldo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private double porcentajeInteres;
    private double limiteCredito;
    private String tipo;
    private String numeroCuenta;

    public CuentaCredito(LocalDate fechaEmision, LocalDate fechaVencimiento, double porcentajeInteres, double limiteCredito, String tipo, String numeroCuenta) {
        if (limiteCredito <= 0) {
            throw new IllegalArgumentException("El límite de crédito debe ser mayor a $0");
        }
        if (fechaEmision == null || fechaVencimiento == null) {
            throw new IllegalArgumentException("Las fechas no pueden estar vacías");
        }

        if (!fechaVencimiento.isAfter(fechaEmision)) {
            throw new IllegalArgumentException("La fecha de vencimiento debe ser posterior a la fecha de emisión");
        }
        this.saldo = 0;
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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito <= 0 || limiteCredito < saldo) {
            throw new IllegalArgumentException("El límite de crédito debe ser positivo y no puede ser menor que la deuda actual");
        }

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

    public void pagar(double monto) {

    }

    public void abonar(double monto) {

    }

    public void generarIntereses() {

    }
}