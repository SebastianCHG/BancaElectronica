package negocio;

public abstract class Cuenta {
    private int numeroCuenta;
    private String fechaApertura;
    private double saldo;
    private String fechaCancelacion;

    public Cuenta(int numeroCuenta, double saldo) {
        this.setNumeroCuenta(numeroCuenta);
        this.setSaldo(saldo);
    }

    public boolean abono(double cantidad){
        this.saldo += cantidad;
        return true;
    }

    public abstract boolean retiro(double cantidad);

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + getNumeroCuenta() +
                ", fechaApertura='" + getFechaApertura() + '\'' +
                ", saldo=" + getSaldo() +
                ", fechaCancelacion='" + getFechaCancelacion() + '\'' +
                '}';
    }
}