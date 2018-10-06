package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcTipoPersona generated by hbm2java
 */
public class LcTipoPersona  implements java.io.Serializable {


     private int idTipoPersona;
     private String descripcion;
     private Date fechaCreacion;
     private String estado;
     private Set lcTelefonoses = new HashSet(0);

    public LcTipoPersona() {
    }

	
    public LcTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public LcTipoPersona(int idTipoPersona, String descripcion, Date fechaCreacion, String estado, Set lcTelefonoses) {
       this.idTipoPersona = idTipoPersona;
       this.descripcion = descripcion;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.lcTelefonoses = lcTelefonoses;
    }
   
    public int getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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


