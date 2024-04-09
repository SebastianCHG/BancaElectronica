package negocio;

public class CuentaDeCheque extends Cuenta {

    private double costoManejoMensual;

    CuentaDeCheque(int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.setCostoManejoMensual(costoManejoMensual);
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheques{" + super.toString() +
                " costoManejoMensual=" + getCostoManejoMensual() +
                '}';
    }
}
