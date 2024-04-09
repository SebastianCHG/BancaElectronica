package ejemplo.pilares;

public class Empleado extends Persona{
    private int clave;
    private String puesto;
    private double sueldo;

    private double sueldoMinimo = 200;

    public Empleado(String nombre, String domicilio, int edad, int clave, String puesto, double sueldo) {
        super(nombre, domicilio, edad);
        this.setClave(clave);
        this.setPuesto(puesto);
        this.setSueldo(sueldo);
    }

    public Empleado(String nombre, String domicilio, int edad, int clave, String puesto) {
        super(nombre, domicilio, edad);
        this.setClave(clave);
        this.setPuesto(puesto);
        this.setSueldo(sueldoMinimo);
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" +
                "clave=" + getClave() +
                ", puesto='" + getPuesto() + '\'' +
                ", sueldo=" + getSueldo() +
                '}';
    }
}
