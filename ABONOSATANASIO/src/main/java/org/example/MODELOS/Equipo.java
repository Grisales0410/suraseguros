package org.example.MODELOS;

import java.time.LocalDate;

public class Equipo {

    private Long id;
    private String nombre;
    private Integer numeroTitulos;
    private LocalDate fechaFundacion;
    private String ciudad;

    public Equipo() {
    }

    public Equipo(Long id, String nombre, Integer numeroTitulos, LocalDate fechaFundacion, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.numeroTitulos = numeroTitulos;
        this.fechaFundacion = fechaFundacion;
        this.ciudad = ciudad;
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

    public Integer getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(Integer numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}