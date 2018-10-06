package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1



/**
 * SeqCarteraId generated by hbm2java
 */
public class SeqCarteraId  implements java.io.Serializable {


     private int id;
     private Integer secuencia;
     private Integer idDeudor;

    public SeqCarteraId() {
    }

	
    public SeqCarteraId(int id) {
        this.id = id;
    }
    public SeqCarteraId(int id, Integer secuencia, Integer idDeudor) {
       this.id = id;
       this.secuencia = secuencia;
       this.idDeudor = idDeudor;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getSecuencia() {
        return this.secuencia;
    }
    
    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }
    public Integer getIdDeudor() {
        return this.idDeudor;
    }
    
    public void setIdDeudor(Integer idDeudor) {
        this.idDeudor = idDeudor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SeqCarteraId) ) return false;
		 SeqCarteraId castOther = ( SeqCarteraId ) other; 
         
		 return (this.getId()==castOther.getId())
 && ( (this.getSecuencia()==castOther.getSecuencia()) || ( this.getSecuencia()!=null && castOther.getSecuencia()!=null && this.getSecuencia().equals(castOther.getSecuencia()) ) )
 && ( (this.getIdDeudor()==castOther.getIdDeudor()) || ( this.getIdDeudor()!=null && castOther.getIdDeudor()!=null && this.getIdDeudor().equals(castOther.getIdDeudor()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + ( getSecuencia() == null ? 0 : this.getSecuencia().hashCode() );
         result = 37 * result + ( getIdDeudor() == null ? 0 : this.getIdDeudor().hashCode() );
         return result;
   }   


}


