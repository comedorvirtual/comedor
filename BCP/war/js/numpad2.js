//NUMPAD 2.0 (teclado virtual)
//17-10-2007

var dom=document.getElementById?1:0
var ie=document.all?1:0
var ie4= ie && !dom
var ns=document.layers?1:0
var ruta;

function clear2(obj)
{
	if (obj) obj.value= '';
}

function show()
{
	this.writenumpad();
}
var mousing='onmouseover="javascript:window.status=\'\';return true" onmouseout="javascript:window.status==\'\';return true"';
function writenumpadbut(j)
{
	but_id= this.numpad_bprefix+j;
	butImg= '\<img border="0" src=' + this.ruta  + 'Bancofiles/getTecla.asp?T='+ this.ticket + '&pos=' + j + '>';
	s= '\<td BGCOLOR="#000066" >\<a ' + mousing +   ' id="'+but_id+'" href="javascript:numKeyPressed(\''+this.numpad_bprefix+'\','+j+')">'+ butImg +'\</a>\</td>'
	
	document.write(s)	
}

function writenumpadtr_in()
{
	document.write('\<tr height="21" align="center">')
}

function writenumpadtr_out()
{
	document.write('\</tr>')                                           
}

function writenumpad()
{
	document.write('\<table id="tab'+ this.name +'" style="display:none" BORDER="0" cellspacing="1" cellpadding="0" bordercolor="#FFFFFF">')
	
	for (i=0; i< this.BC; i++)
	{
		if (i%3==0) this.writenumpadtr_in();
		this.writenumpadbut(i);	
		if (i%3==2) this.writenumpadtr_out();
	}
	
	if (ie4||ns)
	    document.write('\<td BGCOLOR="#000066" colspan="2">\<a id="bclear" ' + mousing + ' href="javascript:clear(\''+this.numpad_bprefix+'\')"><font color="white">Limpiar</font>\</a>\</td>');
	else
		document.write('\<td class="tablacalc2" BGCOLOR="#000066" colspan="2">\<font class="enlacecalc2">\<a id="bclear" href="javascript:clear(\''+this.numpad_bprefix+'\')"><font color="white">Limpiar</font>\</a>\</font>\</td>');
	
	document.write('\</tr>\</table>');
}
 
function alCargarVer2(tab){
	if (ie4)
		document.all[tab].style.display= '';
	else
	    document.getElementById(tab).style.display= '';
}               

function numpad(numpad_id, ticket)
{
	this.ruta = "";
	var rutaVirtual = new String();
	rutaVirtual = escape(window.location.href);
	var directorios = rutaVirtual.split("/");
	for(var x=0;x<=(directorios.length-5);x++)
	{
		this.ruta = this.ruta + "../";
	}
	
	this.BC= 10;	
	this.ticket= ticket;
	
	this.show= show;
	this.alCargarVer2= alCargarVer2;
	
	this.writenumpad= writenumpad
	this.writenumpadbut= writenumpadbut
	this.writenumpadtr_in= writenumpadtr_in
	this.writenumpadtr_out= writenumpadtr_out
	
	if (numpad_id == '')
		alert('error: numpad_id empty')
	
	this.numpad_bprefix= numpad_id
	
	this.name= 'np_' + numpad_id

	eval("var tabname = 'tab'+ this.name;");

	var old = (window.onload) ? window.onload : function () {};
	window.onload = function () {old(); this.alCargarVer2(tabname)};
}

