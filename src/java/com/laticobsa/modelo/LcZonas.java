package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcZonas generated by hbm2java
 */
public class LcZonas  implements java.io.Serializable {


     private int idZona;
     private LcCiudad lcCiudad;
     private LcEmpresa lcEmpresa;
     private LcPais lcPais;
     private LcProvincia lcProvincia;
     private String nombreZona;
     private String sectorDescripcion;
     private Date fechaCreacion;
     private String estado;

    public LcZonas() {
    }

	
    public LcZonas(int idZona) {
        this.idZona = idZona;
    }
    public LcZonas(int idZona, LcCiudad lcCiudad, LcEmpresa lcEmpresa, LcPais lcPais, LcProvincia lcProvincia, String nombreZona, String sectorDescripcion, Date fechaCreacion, String estado) {
       this.idZona = idZona;
       this.lcCiudad = lcCiudad;
       this.lcEmpresa = lcEmpresa;
       this.lcPais = lcPais;
       this.lcProvincia = lcProvincia;
       this.nombreZona = nombreZona;
       this.sectorDescripcion = sectorDescripcion;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
    }
   
    public int getIdZona() {
        return this.idZona;
    }
    
    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }
    public LcCiudad getLcCiudad() {
        return this.lcCiudad;
    }
    
    public void setLcCiudad(LcCiudad lcCiudad) {
        this.lcCiudad = lcCiudad;
    }
    public LcEmpresa getLcEmpresa() {
        return this.lcEmpresa;
    }
    
    public void setLcEmpresa(LcEmpresa lcEmpresa) {
        this.lcEmpresa = lcEmpresa;
    }
    public LcPais getLcPais() {
        return this.lcPais;
    }
    
    public void setLcPais(LcPais lcPais) {
        this.lcPais = lcPais;
    }
    public LcProvincia getLcProvincia() {
        return this.lcProvincia;
    }
    
    public void setLcProvincia(LcProvincia lcProvincia) {
        this.lcProvincia = lcProvincia;
    }
    public String getNombreZona() {
        return this.nombreZona;
    }
    
    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
    public String getSectorDescripcion() {
        return this.sectorDescripcion;
    }
    
    public void setSectorDescripcion(String sectorDescripcion) {
        this.sectorDescripcion = sectorDescripcion;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


