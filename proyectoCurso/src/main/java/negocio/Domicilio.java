package negocio;

public class Domicilio {

    private String calle;
    private String ciudad;
    private String departamento;
    private String codigoPostal;

    public Domicilio(String calle, String ciudad, String departamento, String codigoPostal) {
        this.setCalle(calle);
        this.setCiudad(ciudad);
        this.setDepartamento(departamento);
        this.setCodigoPostal(codigoPostal);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + getCalle() + '\'' +
                ", ciudad='" + getCiudad() + '\'' +
                ", departamento='" + getDepartamento() + '\'' +
                ", codigoPostal='" + getCodigoPostal() + '\'' +
                '}';
    }
}
