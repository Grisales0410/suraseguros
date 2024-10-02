package org.example.MODELOS;

import java.time.LocalDate;

public class Asegurado {

    private Long id;
    private String numeroPoliza;
    private String tipoPoliza;
    private String nombre;
    private Integer edad;
    private String genero;
    private String documentoIdentificacion;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correo;
    private String ocupacion;
    private Double primaMensual;
    private Double montoCobertura;
    private String estadoPoliza;

    public Asegurado() {
    }

    public Asegurado(Long id, String numeroPoliza, String tipoPoliza, String nombre, Integer edad, String genero, String documentoIdentificacion, LocalDate fechaNacimiento, String direccion, String telefono, String correo, String ocupacion, Double primaMensual, Double montoCobertura, String estadoPoliza) {
        this.id = id;
        this.numeroPoliza = numeroPoliza;
        this.tipoPoliza = tipoPoliza;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentificacion = documentoIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.primaMensual = primaMensual;
        this.montoCobertura = montoCobertura;
        this.estadoPoliza = estadoPoliza;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Double getPrimaMensual() {
        return primaMensual;
    }

    public void setPrimaMensual(Double primaMensual) {
        this.primaMensual = primaMensual;
    }

    public Double getMontoCobertura() {
        return montoCobertura;
    }

    public void setMontoCobertura(Double montoCobertura) {
        this.montoCobertura = montoCobertura;
    }

    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(String estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", numeroPoliza='" + numeroPoliza + '\'' +
                ", tipoPoliza='" + tipoPoliza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", documentoIdentificacion='" + documentoIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", primaMensual=" + primaMensual +
                ", montoCobertura=" + montoCobertura +
                ", estadoPoliza='" + estadoPoliza + '\'' +
                '}';
    }
}
