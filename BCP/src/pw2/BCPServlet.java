package pw2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BCPServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int cont=0;
		ArrayList<Cliente> lista=new ArrayList<Cliente>();
		lista.add(new Cliente("456987", "4557880192837465", "Ahorro", "Juan Gabriel", "Perez Aguilar", "930485712"));
		lista.add(new Cliente("450007", "3412231284593901", "Empresarial", "Jose Gabriel", "Choque Figueroa", "949300212"));
		lista.add(new Cliente("123456", "5432112236443343", "Empresarial", "Carlos", "Gomez", "958714157"));
		lista.add(new Cliente("000000", "1234567890345678", "Ahorro", "Jose", "Aguilar Quispe", "930974256"));
		String tipotarjeta=req.getParameter("tipotarjeta");
		String ntarjeta=req.getParameter("ntarjeta");
		String pin=req.getParameter("pin");
		
		for (int i = 0; i < lista.size(); i++) {
		
			if(lista.get(i).getTipotarjeta().equals(tipotarjeta)){
	
				if(lista.get(i).getNtarjeta().equals(ntarjeta)){
				
					if(lista.get(i).getPin().equals(pin)){

						cont ++;
						System.out.println("5");
						out.println(""+lista.get(i).getNombre()
								+ pin
								+ "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>"
								+ "<!-- The HTML 4.01 Transitional DOCTYPE declaration-->"
								+ "<!-- above set at the top of the file will set     -->"
								+ "<!-- the browser's rendering engine into           -->"
								+ "<!-- 'Quirks Mode'. Replacing this declaration     -->"
								+ "<!-- with a 'Standards Mode' doctype is supported, -->"
								+ "<!-- but may lead to some differences in layout.   -->"
								+ "<html>"
								+ "<head>"
								+ "<meta http-equiv='Content-Type'"
								+ "	content='text/html; charset=windows-1252'>"
								+ "<title>Banco de Crédito&gt;&gt;BCP&gt;&gt;</title>"
								+ "<link href='css/style.css' rel='stylesheet' type='text/css'>"
								+ "<link rel='stylesheet' href='css/numpad.css' type='text/css'>"
								+ "<script language='JavaScript' src='js/numpad2.js'></script>"
								+ "<!--TODO:MODIFICAR RUTA TECLADO-->'"
								+ "</head>"
								+ "<body >"
								+ "	<div align='center'>"
								+ "		<div id='principal'>"
								
								+ "			<div id='titular'>"
								+ "					<table width='100%' border='0' cellpadding='0' cellspacing='0'>"
								+ "						<tbody>"
								+ "							<tr>"
								+ "								<td width='749' height='109' valign='top'><img"
								+ "									src='./img/debitoautomatico.jpg'></td>"
								+ "							</tr>"
								+ "						</tbody>"
								+ "					</table>"
								+ "			</div>"
								+ "			<table width='760' border='0' cellspacing='0' cellpadding='0'>"
								+ "					<tbody>"
								+ "						<tr>"
								+ "							<td width='187' valign='top'>"
								+ "								<div id='menu'>"
								+ "								</div>"
								+ "							</td>"
								+ "							<td width='436' valign='top'>"
								+ "								<h1>Bienvenido</h1>"
								+ "								<br>"
								+ "								<table width='100%' border='0' cellpadding='0' cellspacing='0'>"
								+ "									<tbody>"
								+ "										<tr>"
								+ "											<td width='246' height='18' valign='top'><strong>Información"
								+ "													del cliente</strong></td>"
								+ "											<td><strong> nº de tarjeta</strong></td>"
								+ "										</tr>"
								+ "										<tr>"
								+ "											<td><p>"+lista.get(i).getNombre()+" "+lista.get(i).getApellido()+"</p><br>"
							    + "												<p>Celular: "+lista.get(i).getCelular()+ "</p></td>"
								+ "											<td><p>"+lista.get(i).getNtarjeta()+"<br>"
								+ "												<p>Tipo de cuenta: "+lista.get(i).getTipotarjeta()+ "</p></td>"
								+ "										</tr>"
								+ "									</tbody>"
								+ "								</table>"
								+ "						<tr>"
								+ "							<td colspan='3'>&nbsp;</td>"
								+ "						</tr>"
								+ "					</tbody>"
								+ "				</table>"
								+ "		</div>"
								+ "	</div>"
								+ "</body>"
								+ "</html>");
						break;
					}
				}
			}
		}if (cont==0)
			out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>"
					+ "<!-- The HTML 4.01 Transitional DOCTYPE declaration-->"
					+ "<!-- above set at the top of the file will set     -->"
					+ "<!-- the browser's rendering engine into           -->"
					+ "<!-- 'Quirks Mode'. Replacing this declaration     -->"
					+ "<!-- with a 'Standards Mode' doctype is supported, -->"
					+ "<!-- but may lead to some differences in layout.   -->"
					+ "<html>"
					+ "<head>"
					+ "<meta http-equiv='Content-Type'"
					+ "	content='text/html; charset=windows-1252'>"
					+ "<title>Banco de Crédito&gt;&gt;BCP&gt;&gt;</title>"
					+ "<link href='css/style.css' rel='stylesheet' type='text/css'>"
					+ "<link rel='stylesheet' href='css/numpad.css' type='text/css'>"
					+ "<script language='JavaScript' src='js/numpad2.js'></script>"
					+ "</head>"
					+ "<body >"
					+ "	<div align='center'>"
					+ "		<div id='principal'>"
					
					+ "			<div id='titular'>"
					+ "					<table width='100%' border='0' cellpadding='0' cellspacing='0'>"
					+ "						<tbody>"
					+ "							<tr>"
					+ "								<td width='749' height='109' valign='top'><img"
					+ "									src='./img/debitoautomatico.jpg'></td>"
					+ "							</tr>"
					+ "						</tbody>"
					+ "					</table>"
					+ "			</div>"
					+ "			<table width='760' border='0' cellspacing='0' cellpadding='0'>"
					+ "					<tbody>"
					+ "						<tr>"
					+ "							<td width='187' valign='top'>"
					+ "								<div id='menu'>"
					+ "								</div>"
					+ "							</td>"
					+ "							<td width='436' valign='top'>"
					+ "								<h1>Usuario no valido </h1><a href='index.html'><h2>volver?</h2></a>"
					+ "						</td>"
					+ "					</tbody>"
					+ "				</table>"
					+ "		</div>"
					+ "	</div>"
					+ "</body>"
					+ "</html>");
	}
	
}
	