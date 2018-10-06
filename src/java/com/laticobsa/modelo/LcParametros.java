package com.laticobsa.modelo;
// Generated 31/03/2017 06:57:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcParametros generated by hbm2java
 */
public class LcParametros  implements java.io.Serializable {


     private int id;
     private Integer idParametro;
     private String parametro;
     private String valor;
     private Date fechaRegistro;
     private String estado;

    public LcParametros() {
    }

	
    public LcParametros(int id) {
        this.id = id;
    }
    public LcParametros(int id, Integer idParametro, String parametro, String valor, Date fechaRegistro, String estado) {
       this.id = id;
       this.idParametro = idParametro;
       this.parametro = parametro;
       this.valor = valor;
       this.fechaRegistro = fechaRegistro;
       this.estado = estado;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getIdParametro() {
        return this.idParametro;
    }
    
    public void setIdParametro(Integer idParametro) {
        this.idParametro = idParametro;
    }
    public String getParametro() {
        return this.parametro;
    }
    
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}

