package ejemplo.clasesAnidadas;

public class Externa {

    int valorExterno = 100;

    //ANIDADAS
    private class Interna {
        int valorInterno;

        public void imprimir() {
            System.out.println("Método interno" + valorExterno);
        }

    }

    class GUI {
        //Windows, paneles, etiquetas, campos de captura.
        class ManejadorEventos {
            //Se encarga de manejar los eventos que el usuario provoque en la GUI
        }

        class ManejadorBD {

        }

    }


    //ANIDADAS ESTATICAS
    public static class Independiente {
        //CLASE UTILERIA DE OTRA CLASE
        int valor;
    }


    public static void main(String[] args) {
        //Externa e = new Externa();
        //Externa.Interna ei = e.new Interna();

        Externa.Independiente eiStat = new Externa.Independiente();

        Operaciones suma = new OperacionesImpl();
        System.out.println(suma.opera(10, 15));
        // Quiero que en Operaciones se haga una multiplicacion
        // Usando una clase anomina queda asi
        Operaciones multiplica = new Operaciones() {
            @Override
            public int opera(int a, int b) {
                return a * b;
            }
        };
        Operaciones division = new Operaciones() {
            @Override
            public int opera(int a, int b) {
                return a / b;
            }
        };
        System.out.println(multiplica.opera(123, 321));
        System.out.println(division.opera(444, 222));
        // Implementado con Lambda
        Operaciones resta = (x, y) -> x - y;
        System.out.println(resta.opera(100, 25));

        OperacionesV2<Integer> restaV2 = (x, y) -> x - y;
    }
}

@FunctionalInterface
interface Operaciones {
    int opera(int a, int b);
}

class OperacionesImpl implements Operaciones {
    @Override
    public int opera(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface OperacionesV2 <T> {
    T opera(T a, T b);
}

class OperacionesImplV2 implements OperacionesV2<Integer> {

    @Override
    public Integer opera(Integer a, Integer b) {
        return 0;
    }
}