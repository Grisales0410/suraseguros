package org.example.MODELOS;

public class Agencia {

    private Long id;
    private String nombreAgencia;
    private String nit;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correo;
    private String sitioWeb;
    private String gerente;
    private Double rating;

    public Agencia() {
    }

    public Agencia(Long id, String nombreAgencia, String nit, String direccion, String ciudad, String telefono, String correo, String sitioWeb, String gerente, Double rating) {
        this.id = id;
        this.nombreAgencia = nombreAgencia;
        this.nit = nit;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correo = correo;
        this.sitioWeb = sitioWeb;
        this.gerente = gerente;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "id=" + id +
                ", nombreAgencia='" + nombreAgencia + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", gerente='" + gerente + '\'' +
                ", rating=" + rating +
                '}';
    }
}
