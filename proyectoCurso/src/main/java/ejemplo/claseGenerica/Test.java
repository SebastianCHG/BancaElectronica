package ejemplo.claseGenerica;

public class Test <T>{
    private T dato;

    public Test(T dato){
        this.setDato(dato);
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Test{" +
                "dato=" + getDato() +
                '}';
    }
}
