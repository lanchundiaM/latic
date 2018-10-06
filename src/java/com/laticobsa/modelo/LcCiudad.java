package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LcCiudad generated by hbm2java
 */
public class LcCiudad  implements java.io.Serializable {


     private int idCiudad;
     private Integer idProvincia;
     private String ciudad;
     private String estado;
     private Set lcEmpresas = new HashSet(0);
     private Set lcClienteses = new HashSet(0);
     private Set lcZonases = new HashSet(0);
     private Set lcReferenciases = new HashSet(0);
     private Set lcDatosDeudoreses = new HashSet(0);

    public LcCiudad() {
    }

	
    public LcCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public LcCiudad(int idCiudad, Integer idProvincia, String ciudad, String estado, Set lcEmpresas, Set lcClienteses, Set lcZonases, Set lcReferenciases, Set lcDatosDeudoreses) {
       this.idCiudad = idCiudad;
       this.idProvincia = idProvincia;
       this.ciudad = ciudad;
       this.estado = estado;
       this.lcEmpresas = lcEmpresas;
       this.lcClienteses = lcClienteses;
       this.lcZonases = lcZonases;
       this.lcReferenciases = lcReferenciases;
       this.lcDatosDeudoreses = lcDatosDeudoreses;
    }
   
    public int getIdCiudad() {
        return this.idCiudad;
    }
    
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public Integer getIdProvincia() {
        return this.idProvincia;
    }
    
    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getLcEmpresas() {
        return this.lcEmpresas;
    }
    
    public void setLcEmpresas(Set lcEmpresas) {
        this.lcEmpresas = lcEmpresas;
    }
    public Set getLcClienteses() {
        return this.lcClienteses;
    }
    
    public void setLcClienteses(Set lcClienteses) {
        this.lcClienteses = lcClienteses;
    }
    public Set getLcZonases() {
        return this.lcZonases;
    }
    
    public void setLcZonases(Set lcZonases) {
        this.lcZonases = lcZonases;
    }
    public Set getLcReferenciases() {
        return this.lcReferenciases;
    }
    
    public void setLcReferenciases(Set lcReferenciases) {
        this.lcReferenciases = lcReferenciases;
    }
    public Set getLcDatosDeudoreses() {
        return this.lcDatosDeudoreses;
    }
    
    public void setLcDatosDeudoreses(Set lcDatosDeudoreses) {
        this.lcDatosDeudoreses = lcDatosDeudoreses;
    }




}


