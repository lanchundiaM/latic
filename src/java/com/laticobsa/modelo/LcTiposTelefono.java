package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcTiposTelefono generated by hbm2java
 */
public class LcTiposTelefono  implements java.io.Serializable {


     private int idTipoTlf;
     private String nombreTipoTlf;
     private String observacion;
     private Date fechaCreacion;
     private String estado;
     private Set lcTelefonoses = new HashSet(0);

    public LcTiposTelefono() {
    }

	
    public LcTiposTelefono(int idTipoTlf) {
        this.idTipoTlf = idTipoTlf;
    }
    public LcTiposTelefono(int idTipoTlf, String nombreTipoTlf, String observacion, Date fechaCreacion, String estado, Set lcTelefonoses) {
       this.idTipoTlf = idTipoTlf;
       this.nombreTipoTlf = nombreTipoTlf;
       this.observacion = observacion;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.lcTelefonoses = lcTelefonoses;
    }
   
    public int getIdTipoTlf() {
        return this.idTipoTlf;
    }
    
    public void setIdTipoTlf(int idTipoTlf) {
        this.idTipoTlf = idTipoTlf;
    }
    public String getNombreTipoTlf() {
        return this.nombreTipoTlf;
    }
    
    public void setNombreTipoTlf(String nombreTipoTlf) {
        this.nombreTipoTlf = nombreTipoTlf;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
    public Set getLcTelefonoses() {
        return this.lcTelefonoses;
    }
    
    public void setLcTelefonoses(Set lcTelefonoses) {
        this.lcTelefonoses = lcTelefonoses;
    }




}


