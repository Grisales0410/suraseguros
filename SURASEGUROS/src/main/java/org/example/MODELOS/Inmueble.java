package org.example.MODELOS;

public class Inmueble {

    private Long id;
    private String nombre;
    private String ubicacion;
    private String caracteristicas;
    private Double precio;
    private String tipoPropiedad;
    private String superficie;
    private String condiciones;
    private String documentacion;
    private String serviciosDisponibles;

    public Inmueble() {
    }

    public Inmueble(Long id, String nombre, String ubicacion, String caracteristicas, Double precio, String tipoPropiedad, String superficie, String condiciones, String documentacion, String serviciosDisponibles) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
        this.tipoPropiedad = tipoPropiedad;
        this.superficie = superficie;
        this.condiciones = condiciones;
        this.documentacion = documentacion;
        this.serviciosDisponibles = serviciosDisponibles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public String getServiciosDisponibles() {
        return serviciosDisponibles;
    }

    public void setServiciosDisponibles(String serviciosDisponibles) {
        this.serviciosDisponibles = serviciosDisponibles;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", precio=" + precio +
                ", tipoPropiedad='" + tipoPropiedad + '\'' +
                ", superficie='" + superficie + '\'' +
                ", condiciones='" + condiciones + '\'' +
                ", documentacion='" + documentacion + '\'' +
                ", serviciosDisponibles='" + serviciosDisponibles + '\'' +
                '}';
    }
}
