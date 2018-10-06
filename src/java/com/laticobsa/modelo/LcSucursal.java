package com.laticobsa.modelo;
// Generated 31/03/2017 06:57:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcSucursal generated by hbm2java
 */
public class LcSucursal  implements java.io.Serializable {


     private int idSucursal;
     private String nombre;
     private String idCiudad;
     private String direccion;
     private String telefonos;
     private Date fechaCreacion;
     private Date fechaActualizacion;
     private String estado;

    public LcSucursal() {
    }

	
    public LcSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    public LcSucursal(int idSucursal, String nombre, String idCiudad, String direccion, String telefonos, Date fechaCreacion, Date fechaActualizacion, String estado) {
       this.idSucursal = idSucursal;
       this.nombre = nombre;
       this.idCiudad = idCiudad;
       this.direccion = direccion;
       this.telefonos = telefonos;
       this.fechaCreacion = fechaCreacion;
       this.fechaActualizacion = fechaActualizacion;
       this.estado = estado;
    }
   
    public int getIdSucursal() {
        return this.idSucursal;
    }
    
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdCiudad() {
        return this.idCiudad;
    }
    
    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaActualizacion() {
        return this.fechaActualizacion;
    }
    
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


