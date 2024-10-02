package org.example.MODELOS;

public class Asesor {

    private Long id;
    private String nombre;
    private String documentoIdentificacion;
    private String telefono;
    private String correo;
    private String direccion;
    private String especialidad;
    private Integer aniosExperiencia;
    private String horarioTrabajo;
    private String disponibilidas;

    public Asesor() {
    }

    public Asesor(Long id, String nombre, String documentoIdentificacion, String telefono, String correo, String direccion, String especialidad, Integer aniosExperiencia, String horarioTrabajo, String disponibilidas) {
        this.id = id;
        this.nombre = nombre;
        this.documentoIdentificacion = documentoIdentificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.horarioTrabajo = horarioTrabajo;
        this.disponibilidas = disponibilidas;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getDisponibilidas() {
        return disponibilidas;
    }

    public void setDisponibilidas(String disponibilidas) {
        this.disponibilidas = disponibilidas;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", documentoIdentificacion='" + documentoIdentificacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", horarioTrabajo='" + horarioTrabajo + '\'' +
                ", disponibilidas='" + disponibilidas + '\'' +
                '}';
    }
}
