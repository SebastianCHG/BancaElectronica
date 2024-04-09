package ejemplo.pilares;

public abstract class Persona extends Object implements Comunicarse{
    //Variables de instancia
    private String nombre;
    private String domicilio;
    private int edad;

    public Persona(String nombre, String domicilio, int edad) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setEdad(edad);
    }

    public void habla(){

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cumpleAnios(){
        setEdad(getEdad() + 1);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void hablar() {
        System.out.println("Jefe súbame el sueldo");
    }
}
