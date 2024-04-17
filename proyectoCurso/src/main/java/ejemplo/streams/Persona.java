package ejemplo.streams;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String ciudadOrigen;
    private char sexo;

    public Persona(String nombre, int edad, String ciudadOrigen, char sexo) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setCiudadOrigen(ciudadOrigen);
        this.setSexo(sexo);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    //Orden Natural
    @Override
    public int compareTo(Persona persona) {
        return this.nombre.compareToIgnoreCase(persona.getNombre());
    }
}
