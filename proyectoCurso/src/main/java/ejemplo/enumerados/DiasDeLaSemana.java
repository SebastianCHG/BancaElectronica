package ejemplo.enumerados;

public enum DiasDeLaSemana {
    Lunes(1), Martes(2), Miercoles(3), Jueves(4), Viernes(5), Sabado(6), Domingo(7);

    private int numero;

    DiasDeLaSemana(int numero){
        this.numero = numero;
    }

    public void imprimir(){
        System.out.println(numero);
    }
}
