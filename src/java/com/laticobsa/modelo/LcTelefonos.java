package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcTelefonos generated by hbm2java
 */
public class LcTelefonos  implements java.io.Serializable {


     private int idTelefono;
     private LcTipoPersona lcTipoPersona;
     private LcTiposTelefono lcTiposTelefono;
     private Integer idPersona;
     private String identificacionDeudor;
     private String telefono;
     private Integer scoring;
     private Date fechaCreacion;
     private String estado;
     private String descripcionCarga;

    public LcTelefonos() {
    }

	
    public LcTelefonos(int idTelefono) {
        this.idTelefono = idTelefono;
    }
    public LcTelefonos(int idTelefono, LcTipoPersona lcTipoPersona, LcTiposTelefono lcTiposTelefono, Integer idPersona, String identificacionDeudor, String telefono, Integer scoring, Date fechaCreacion, String estado, String descripcionCarga) {
       this.idTelefono = idTelefono;
       this.lcTipoPersona = lcTipoPersona;
       this.lcTiposTelefono = lcTiposTelefono;
       this.idPersona = idPersona;
       this.identificacionDeudor = identificacionDeudor;
       this.telefono = telefono;
       this.scoring = scoring;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.descripcionCarga = descripcionCarga;
    }
   
    public int getIdTelefono() {
        return this.idTelefono;
    }
    
    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }
    public LcTipoPersona getLcTipoPersona() {
        return this.lcTipoPersona;
    }
    
    public void setLcTipoPersona(LcTipoPersona lcTipoPersona) {
        this.lcTipoPersona = lcTipoPersona;
    }
    public LcTiposTelefono getLcTiposTelefono() {
        return this.lcTiposTelefono;
    }
    
    public void setLcTiposTelefono(LcTiposTelefono lcTiposTelefono) {
        this.lcTiposTelefono = lcTiposTelefono;
    }
    public Integer getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }
    public String getIdentificacionDeudor() {
        return this.identificacionDeudor;
    }
    
    public void setIdentificacionDeudor(String identificacionDeudor) {
        this.identificacionDeudor = identificacionDeudor;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Integer getScoring() {
        return this.scoring;
    }
    
    public void setScoring(Integer scoring) {
        this.scoring = scoring;
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
    public String getDescripcionCarga() {
        return this.descripcionCarga;
    }
    
    public void setDescripcionCarga(String descripcionCarga) {
        this.descripcionCarga = descripcionCarga;
    }




}


