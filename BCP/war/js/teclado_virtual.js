// UNIVERSIDAD NACIONAL DE SAN AGUSTIN
// Programación Web II
// Laboratorio

//declaración de un arreglo vacio para guardar numeros sin repetir
var usados = [];
var temp=0;
//esta función genera numeros aleatorios del 0 al 9 
function aleatorio(){
	var num;
	do{ 
	num = Math.floor(Math.random()*10); 
	}while (repetido(num) == true); 
	usados.push(num); 
	return num;	
}
//Esta función recibe un número y lo busca en usados
//devuelve true si el num. ya existe
function repetido(num){
	var i,repe=false;
	for (i=0; i<usados.length; i++)
		 if (num === usados[i]) 
			repe = true;
	return repe; 
} 

//crea la estructura de la tabla
document.write("<table>");
for(var i=0;i<3;i++){
  document.write("<tr>");
  for(var j=0;j<3;j++){
	  temp=aleatorio();
   document.write("<td><input onclick='pin.value+="+temp+"' type='button' value='"+temp+"'>");
   }
  if(i===2){
	 temp=aleatorio();
  document.write("<tr><input onclick='pin.value+="+temp+"' type='button' value='"+temp+"'><td><td colspan=2><	");
  }
}
document.write("</table>");
//se accede a la tabla
var objt=document.getElementsByTagName("table");
//se aplica estilo a la tabla
objt[0].style.backgroundColor="yellow";
objt[0].style.width="100px";
objt[0].style.height="100px";

//se accede a las celdas
var objceldas=document.getElementsByTagName("td");
//se aplica estilos a cada celda
for(i=0;i<objceldas.length;i++){
 objceldas[i].style.border="1px blue solid";
 objceldas[i].style.textAlign="center";
 objceldas[i].style.width="25px"; 
}

