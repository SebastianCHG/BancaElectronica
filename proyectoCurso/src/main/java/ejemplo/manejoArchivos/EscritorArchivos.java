package ejemplo.manejoArchivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivos {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("datos.txt");
            fw.write("Hoy es buen dia para tomar el curso de java\n");
            fw.write("Continuación de la cadena anterior");
            fw.close();
        } catch (IOException e) {
            System.out.println("Hubo problema en el manejo del archivo" + e.getMessage());
        }
    }
}
