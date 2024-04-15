package ejemplo.interfaces;

public class PruebaCadenas {
    public static void main(String[] args){

        OperaCadenas compararCadenasv2 = (a, b) -> {
            if(a.equals(b)){
                return "Iguales";
            }else{
                return "Diferentes";
            }
        };

        //System.out.println(compararCadenasv2.ejecuta("hola", "hola"));

        OperaCadenas compararCadenas = (a,b)-> (a.equals(b)? "Iguales": "Diferentes");
        OperaCadenas concatena = (a, b) -> a + b;
        OperaCadenas iniciaCon = (a, b) -> a.startsWith(b)?"Sí empieza":"No empieza";
        OperaCadenas terminaCon = (a, b) -> a.endsWith(b)?"Sí finaliza":"No finaliza";
        OperaCadenas comparaIgnorandoMayMin = (a, b) -> a.equalsIgnoreCase(b)?"Sí es igual":"No es igual";
        OperaCadenas buscaCadena = (a, b) -> a.contains(b)?"Sí está dentro de la cadena":"No está dentro de la cadena";

        System.out.println(compararCadenas.ejecuta("ABC", "ABC"));
        System.out.println(compararCadenas.ejecuta("ABC", "abc"));

        System.out.println(concatena.ejecuta("ABC", "D"));

        System.out.println(iniciaCon.ejecuta("ABC", "A"));
        System.out.println(iniciaCon.ejecuta("ABC", "B"));

        System.out.println(terminaCon.ejecuta("ABC", "C"));
        System.out.println(terminaCon.ejecuta("ABC", "A"));

        System.out.println(comparaIgnorandoMayMin.ejecuta("ABC", "abc"));
        System.out.println(comparaIgnorandoMayMin.ejecuta("ABC", "cba"));

        System.out.println(buscaCadena.ejecuta("ABC", "A"));
        System.out.println(buscaCadena.ejecuta("ABC", "D"));
    }
}
