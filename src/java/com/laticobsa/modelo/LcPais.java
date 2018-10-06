package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LcPais generated by hbm2java
 */
public class LcPais  implements java.io.Serializable {


     private int idPais;
     private String pais;
     private String codigo;
     private String estado;
     private Set lcZonases = new HashSet(0);
     private Set lcClienteses = new HashSet(0);
     private Set lcProvincias = new HashSet(0);
     private Set lcEmpresas = new HashSet(0);

    public LcPais() {
    }

	
    public LcPais(int idPais) {
        this.idPais = idPais;
    }
    public LcPais(int idPais, String pais, String codigo, String estado, Set lcZonases, Set lcClienteses, Set lcProvincias, Set lcEmpresas) {
       this.idPais = idPais;
       this.pais = pais;
       this.codigo = codigo;
       this.estado = estado;
       this.lcZonases = lcZonases;
       this.lcClienteses = lcClienteses;
       this.lcProvincias = lcProvincias;
       this.lcEmpresas = lcEmpresas;
    }
   
    public int getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getLcZonases() {
        return this.lcZonases;
    }
    
    public void setLcZonases(Set lcZonases) {
        this.lcZonases = lcZonases;
    }
    public Set getLcClienteses() {
        return this.lcClienteses;
    }
    
    public void setLcClienteses(Set lcClienteses) {
        this.lcClienteses = lcClienteses;
    }
    public Set getLcProvincias() {
        return this.lcProvincias;
    }
    
    public void setLcProvincias(Set lcProvincias) {
        this.lcProvincias = lcProvincias;
    }
    public Set getLcEmpresas() {
        return this.lcEmpresas;
    }
    
    public void setLcEmpresas(Set lcEmpresas) {
        this.lcEmpresas = lcEmpresas;
    }




}


