function frm_cargos()
{
   // alert("Url  ="+document.location);
        jQuery("#page-wrapper").html("<br/><br/><center><img alt='cargando' src='dist/img/hourglass.gif' /><center>"); 
        jQuery("#page-wrapper").load("cargos?accion=agregar",{},function(){ });
}
function cargos()
{       jQuery("#page-wrapper").html("<br/><br/><center><img alt='cargando' src='dist/img/hourglass.gif' /><center>"); 
        jQuery("#page-wrapper").load("cargos?accion=listar",{},function(){ });
}

function validaDatos(empresa,cargo,observacion,accion){
         
            
                 if(cargo.length > 1 ){
                        if(observacion.length > 0 ){
                                return true;
                        }else{ alert("Debe dar un abservacion");}
                    }else{ alert("Debe escoger un cargo");}
             
                 
   return false; 
}


function deletecargo(data)
        
{      if(confirm("Realmente desea eliminar los datos")){
    jQuery("#page-wrapper").html("<br/><br/><center><img alt='cargando' src='dist/img/hourglass.gif' /><center>"); 
        jQuery("#page-wrapper").load("cargos?accion=eliminar&id=" + data,{},function(){ });
    cargos();    
    }
        
}

function ConnsultaDatosID(str)        
{  

  if(confirm("Realmente desea actualizar los datos")){
     jQuery("#page-wrapper").html("<br/><br/><center><img alt='cargando' src='dist/img/hourglass.gif' /><center>"); 
      jQuery("#page-wrapper").load("cargos?accion=buscaID&id=" + str,{},function(){ });
  }
    
}

$('#btncrearcargo').click(function(e){
   e.preventDefault();
   
   var empresa = $("#empresa").val();
   var cargo  = $("#cargo").val();
   var observacion = $("#observacion").val();
   var accion = $("#accion").val();
   
   if(validaDatos(empresa,cargo,observacion,accion)){
      
          var parametros = {
              "accion" : accion,
                "empresa" : empresa,
                "cargo" : cargo,
                "observacion" : observacion
                
                 };
        $.ajax({
                data:  parametros,
                url:   'cargos',
                type:  'GET',
                beforeSend: function () {                      
                } ,
               success:  function (response) {
                      if(response){
                           alert(response);
                           frm_cargos();//vuelvo a llamar a la pantalla
                      }                        
                }
        });
   }
});



$('#btnactcargo').click(function(e){
   e.preventDefault();
   

       
   var idcargo = $("#idcargo").val();
   var empresa = $("#empresa").val();
   var cargo  = $("#cargo").val();
   var observacion = $("#observacion").val();
   var accion = $("#accion").val();
   
          var parametros = {
              "accion" : accion,
                "idcargo" : idcargo,
                "empresa" : empresa,
                "cargo" : cargo,
                "observacion" : observacion
                
                 };
        $.ajax({
                data:  parametros,
                url:   'cargos',
                type:  'GET',
                beforeSend: function () {                      
                } ,
               success:  function (response) {
                      if(response){
                           alert(response);
                           cargos();//vuelvo a llamar a la pantalla
                      }                        
                }
        });  
});
