package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcRoles generated by hbm2java
 */
public class LcRoles  implements java.io.Serializable {


     private int idRol;
     private LcEmpresa lcEmpresa;
     private String descripcion;
     private String observacion;
     private Date fechaCreacion;
     private String estado;
     private Integer nivel;
     private Set lcModuloRols = new HashSet(0);
     private Set lcUsuarioses = new HashSet(0);

    public LcRoles() {
    }

	
    public LcRoles(int idRol) {
        this.idRol = idRol;
    }
    public LcRoles(int idRol, LcEmpresa lcEmpresa, String descripcion, String observacion, Date fechaCreacion, String estado, Integer nivel, Set lcModuloRols, Set lcUsuarioses) {
       this.idRol = idRol;
       this.lcEmpresa = lcEmpresa;
       this.descripcion = descripcion;
       this.observacion = observacion;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.nivel = nivel;
       this.lcModuloRols = lcModuloRols;
       this.lcUsuarioses = lcUsuarioses;
    }
   
    public int getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    public LcEmpresa getLcEmpresa() {
        return this.lcEmpresa;
    }
    
    public void setLcEmpresa(LcEmpresa lcEmpresa) {
        this.lcEmpresa = lcEmpresa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public Integer getNivel() {
        return this.nivel;
    }
    
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    public Set getLcModuloRols() {
        return this.lcModuloRols;
    }
    
    public void setLcModuloRols(Set lcModuloRols) {
        this.lcModuloRols = lcModuloRols;
    }
    public Set getLcUsuarioses() {
        return this.lcUsuarioses;
    }
    
    public void setLcUsuarioses(Set lcUsuarioses) {
        this.lcUsuarioses = lcUsuarioses;
    }




}


