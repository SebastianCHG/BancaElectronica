package negocio;

public class CuentaDeAhorro extends Cuenta {
    private double tasaInteresMensual;


    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.setTasaInteresMensual(tasaInteresMensual);
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double calcularIntereses(){
        return getSaldo() * getTasaInteresMensual();
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" + super.toString() +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }
}