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
        <div>

            <ol class="breadcrumb">
                <li><a href="#"  onclick="empresa(this)">Lista Empresas</a></li>
                <li class="active"><a href="#"  onclick="frm_empresa(this)">Registra Empresas</a></li>
            </ol> 
            <div class="col-md-6">



                <div class="box box-danger">
                    <div class="box-header with-border bg-yellow"   >
                        <h3 class="box-title" >Registrar Empresas</h3>
                    </div>
                    <form name="form" action="empresa" method="get" class="well" id="frmnuevorol">  
                        <div class="box-body">
                            <!-- Color Picker -->
                            <div class="form-group hidden">
                                <input type="text" class="form-control" placeholder="Ingrese Nombre Rol" value="registrar" required="required" name="accion" id="accion">

                            </div>
                            <div class="row">
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label>Tipo Identificación:</label>
                                        <select class="form-control" name="t_identificacion" required="required" id="t_identificacion" >
                                            <option value='' >Seleccionar tipo de identificación</option>
                                            <option value='CED' >CÉDULA</option>
                                            <option value='RUC' >R.U.C.</option>
                                        </select>
                                    </div>          
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label>Identificación:</label>
                                        <input type="text" class="form-control" placeholder="Ingrese numero identificación" required="required" name="identificacion" id="identificacion" onkeypress="ValidaSoloNumeros();">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Nombre Empresa:</label>
                                <input type="text" class="form-control" placeholder="Ingrese Nombre Empresa" required="required" name="nombre" id="nombre">
                            </div>
                            <div class="row">
                                <div class="col-xs-4">
                                    <div class="form-group">
                                        <label>País</label>
                                        <select class="form-control" name="pais" required="required" id="pais" >
                                            <option value='' >Seleccionar País</option>
                                            <option value='ECU' >Ecuador</option>
                                            <option value='CO' >Colombia</option>
                                            <option value='PE' >Peru</option>
                                            <option value='EU' >EE.UU</option>
                                            <option value='BR' >Brasil</option>
                                            <option value='AR' >Argentina</option>
                                        </select>
                                    </div>      
                                </div>    
                                <div class="col-xs-4">
                                    <div class="form-group">
                                        <label>Provincia</label>
                                        <select class="form-control" name="provincia" required="required" id="provincia" >
                                            <option value='' >Seleccionar Provincia</option>
                                            <option value='1' >Guayas</option>
                                            <option value='2' >Pichincha</option>
                                            <option value='3' >Azuay</option>

                                        </select>
                                    </div>
                                </div>
                                <div class="col-xs-4">
                                    <div class="form-group">
                                        <label>Ciudad</label>
                                        <select class="form-control" name="ciudad" required="required" id="ciudad" >
                                            <option value='' >Seleccionar Ciudad</option>
                                            <option value='GYE' >Guayaquil</option>
                                            <option value='UIO' >Quito</option>
                                            <option value='CUE' >Cuenca</option>
                                            <option value='AMB' >Ambato</option>
                                        </select>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label>Dirección:</label>
                                <input type="text" class="form-control" placeholder="Ingrese Dirección" required="required" name="direccion" id="direccion">
                            </div>
                            <div class=" form-group">
                                <label>Email de Contacto:</label>
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                                    <input type="email" class="form-control" placeholder="Email" name="email" required="required" name="mail" id="mail">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-4">
                                    <div class="form-group">     
                                        <label>Teléfono:</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-phone"></i>
                                            </div>
                                            <input type="text" class="form-control" data-inputmask='"mask": "(99) 999-9999"' data-mask name="telefono" id="telefono" onkeypress="ValidaSoloNumeros();">
                                        </div>

                                    </div>
                                </div>
                                <div class="col-xs-4">
                                    <div class="form-group">
                                        <label>Teléfono 2:</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-phone"></i>
                                            </div>
                                            <input type="text" class="form-control" data-inputmask='"mask": "(99) 999-9999"' data-mask name="telefono2" id="telefono2" onkeypress="ValidaSoloNumeros();">
                                        </div>                
                                    </div>
                                </div>
                                <div class="col-xs-4">
                                    <div class="form-group">
                                        <label>Celular:</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-phone"></i>
                                            </div>
                                            <input type="text" class="form-control" data-inputmask='"mask": "(99) 999-9999"' data-mask name="celular" id="celular" onkeypress="ValidaSoloNumeros();">
                                        </div>
                                    </div>  
                                </div>
                            </div>



                            <div class=" form-group">
                                <!-- <button type="submit" class="btn btn-primary fa fa-save"> Registrar</button>-->
                                <input id="btncrearempresa" type="submit" value="Registrar" class="btn btn-primary"  title="Crea Empresa">
                            </div>

                        </div>  
                    </form>
                    <!-- /.box-body -->
                </div>




            </div>
            <!-- /.content-wrapper -->


        </div>
        <!-- /.content-wrapper -->
        <!-- ./wrapper -->
        <script src="dist/js/empresa.js"></script> 
    </body>
</html>


