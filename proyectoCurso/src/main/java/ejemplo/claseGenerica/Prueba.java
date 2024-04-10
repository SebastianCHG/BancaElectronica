package ejemplo.claseGenerica;

import negocio.Cuenta;

public class Prueba <T extends Cuenta>{

    private T cuenta;

    public Prueba(T cuenta) {
        this.cuenta = cuenta;
    }

    public int getNumero(){
        return this.cuenta.getNumeroCuenta();
    }
}
