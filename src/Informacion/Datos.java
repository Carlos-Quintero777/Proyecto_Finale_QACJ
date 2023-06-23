package Informacion;

public class Datos {
    private String[] nombres;
    private String nacimiento;
    private String correo;
    private String rfc;
    private String[] direcciones;
    private String sexo;

    public Datos(String[] nombres, String nacimiento, String correo, String rfc, String[] direcciones, String sexo) {
        this.nombres = nombres;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.rfc = rfc;
        this.direcciones = direcciones;
        this.sexo = sexo;
    }

    public Datos() {
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String[] getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String[] direcciones) {
        this.direcciones = direcciones;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
