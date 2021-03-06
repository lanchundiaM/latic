package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcEmpleadoCampania generated by hbm2java
 */
public class LcEmpleadoCampania  implements java.io.Serializable {


     private int idEmpleadoCampania;
     private Integer idCampanias;
     private Integer idEmpleado;
     private String nombreEmpleado;
     private Date fechaRegistro;
     private String estado;

    public LcEmpleadoCampania() {
    }

	
    public LcEmpleadoCampania(int idEmpleadoCampania) {
        this.idEmpleadoCampania = idEmpleadoCampania;
    }
    public LcEmpleadoCampania(int idEmpleadoCampania, Integer idCampanias, Integer idEmpleado, String nombreEmpleado, Date fechaRegistro, String estado) {
       this.idEmpleadoCampania = idEmpleadoCampania;
       this.idCampanias = idCampanias;
       this.idEmpleado = idEmpleado;
       this.nombreEmpleado = nombreEmpleado;
       this.fechaRegistro = fechaRegistro;
       this.estado = estado;
    }
   
    public int getIdEmpleadoCampania() {
        return this.idEmpleadoCampania;
    }
    
    public void setIdEmpleadoCampania(int idEmpleadoCampania) {
        this.idEmpleadoCampania = idEmpleadoCampania;
    }
    public Integer getIdCampanias() {
        return this.idCampanias;
    }
    
    public void setIdCampanias(Integer idCampanias) {
        this.idCampanias = idCampanias;
    }
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }
    
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
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


