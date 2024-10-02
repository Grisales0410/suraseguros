package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private Long id;
    private String nombre;
    private String documentoIdentificacion;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private String direccion;
    private String parentesco;
    private Double porcentajeBeneficio;
    private String tipoBeneficio;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String documentoIdentificacion, LocalDate fechaNacimiento, String telefono, String correo, String direccion, String parentesco, Double porcentajeBeneficio, String tipoBeneficio) {
        this.id = id;
        this.nombre = nombre;
        this.documentoIdentificacion = documentoIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.parentesco = parentesco;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.tipoBeneficio = tipoBeneficio;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(Double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public String getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(String tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", documentoIdentificacion='" + documentoIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                ", tipoBeneficio='" + tipoBeneficio + '\'' +
                '}';
    }
}
