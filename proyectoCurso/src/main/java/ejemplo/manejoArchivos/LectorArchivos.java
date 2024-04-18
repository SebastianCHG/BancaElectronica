package ejemplo.manejoArchivos;

import java.io.*;

public class LectorArchivos {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea="";

            while((linea=br.readLine())!= null){
                System.out.println(linea);
            }
            br.close();

        }catch (FileNotFoundException e){
            System.out.println("El archivo no existe.");
        }
        catch (IOException e){
            System.out.println("Hubo problema al leer el archivo.");
        }
    }
}
