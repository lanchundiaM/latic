<%-- 
    Document   : index
    Created on : 12-feb-2017, 22:28:05
    Author     : CIMA2015
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


    <!DOCTYPE html>
<html>
<head>
    
</head>
    <body>
  <!-- Content Wrapper. Contains page content -->
  <div >

      <br >
      <ol class="breadcrumb">
          <li><a href="#" onclick="clientes();">Nuestros Clientes</a></li>
          <li class="active"><a href="#" onclick="frm_clientes();">Registrar Clientes</a></li>             
      </ol>
      
      <div class="col-md-6">
          <div class="box box-danger">
            <div class="box-header with-border bg-yellow"   >
              <h3 class="box-title" >Clientes</h3>
            </div>
            <form name="form" action="clientes" method="get" class="well">
                <div class="form-group hidden">
                    <input type="text" class="form-control " placeholder="Ingrese Nombre Usuario" value="registrar" required="required" name="accion" id="accion">

                </div>
                <div class="form-group">
                            <label>Empresa:</label>
                 
                            <select class="form-control" name="empresa" required="required" id="empresa">
                            <option value=''>Seleccionar Empresa</option>
                            <c:forEach items="${empresas}" var="empresa">
                             <option value="<c:out value="${empresa.getIdEmpresa()}" />"><c:out value="${empresa.getRazonSocial()}" /> </option>                         
                            </c:forEach>                 
                            </select>
                        </div>

                <div class="form-group">  
                    <div class="row">
                        <div class="col-lg-6">
                            <label>Tipo de Identificación:</label>
                            <select class="form-control" name="Tipo_Identificacion" required="required" id="Tipo_Identificacion">
                                <option value=''>Tipo de Identificación</option>
                                <option value='CED' >Cédula</option>
                                <option value='RUC' >RUC</option>
                            </select>
                        </div>
                        <div class="col-lg-6">
                            <label>Número de Identificación:</label>
                            <input type="text" class="form-control" placeholder="Número de Identificación" name="identificacion" id="identificacion" onkeypress="ValidaSoloNumeros()">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label>Razón Social: </label>
                    <input type="text" class="form-control" placeholder="Ingrese Razón Social " required="required" name="razon" id="razon" onkeypress="txNombres()">
                </div>

                <div class="form-group">
                    <label>Dirección: </label>
                    <input type="text" class="form-control" placeholder="Ingrese Dirección " required="required" name="direccion" id="direccion">
                </div>

                <div class="form-group">  
                    <div class="row">
                        <div class="col-lg-4">
                            <label>País:</label>
                            <select class="form-control" name="pais" required="required" id="pais">
                                <option value=''>País</option>
                                <option value='ECU' >Ecuador</option>
                                <option value='CO' >Colombia</option>
                                <option value='PE' >Perú</option>
                            </select>
                        </div>
                        <div class="col-lg-4">
                            <label>Provincia:</label>
                            <select class="form-control" name="Provincia" required="required" id="Provincia">
                                <option value=''>Provincia</option>
                                <option value='1' >Guayas</option>
                                <option value='2' >Pichincha</option>
                                <option value='3' >Azuay</option>
                            </select>
                        </div>
                        <div class="col-lg-4">
                            <label>Ciudad:</label>
                            <select class="form-control" name="Ciudad" required="required" id="Ciudad">
                                <option value=''>Ciudad</option>
                                <option value='GYE' >Guayaquil</option>
                                <option value='UIO' >Quito</option>
                                <option value='CU' >Cuenca</option>    
                            </select>                            
                        </div>
                    </div>
                </div>

                <div class="form-group">  
                    <div class="row">
                        <div class="col-lg-6">
                            <label>Contacto:</label>
                            <input type="text" class="form-control" placeholder="Ingrese el Contacto " required="required" name="contacto" id="contacto">
                        </div>
                        <div class="col-lg-6">
                            <label>Email:</label>
                            <input  type="email" class="form-control" placeholder="Ingrese el Email " required="required" name="email" id="email">
                        </div>
                    </div>
                </div>

                <div class="form-group">  
                    <div class="row">
                        <div class="col-lg-4">
                            <label>Teléfono:</label>
                            <input type="text" class="form-control" placeholder="Teléfono 1 " required="required" name="fono1" id="fono1" onkeypress="ValidaSoloNumeros()">
                        </div>
                        <div class="col-lg-4">
                            <label>Extensión:</label>
                            <input type="text" class="form-control" placeholder="EXT "  name="ext" id="ext" onkeypress="ValidaSoloNumeros()">
                        </div>
                        <div class="col-lg-4">
                            <label>Celular:</label>
                            <input type="text" class="form-control" placeholder="Celular"  name="celular" id="celular" onkeypress="ValidaSoloNumeros()">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <input id="btncrearclientes" type="submit" value="Registrar" class="btn btn-primary"  title="Crear Clientes">
                </div>
            </form>
             
              <!-- /.box-body -->
          </div>

          <!-- /.box -->

        </div>
      
  </div>
  <!-- /.content-wrapper -->
<script src="dist/js/clientes.js"></script>
  
</body>
</html>


