package pw2;

public class Cliente {
	String pin;
	String ntarjeta;
	String tipotarjeta;
	String nombre;
	String apellido;
	String celular;
	
	public Cliente(String pin, String ntarjeta, String tipotarjeta,
			String nombre, String apellido, String celular) {
		super();
		this.pin = pin;
		this.ntarjeta = ntarjeta;
		this.tipotarjeta = tipotarjeta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String clave) {
		this.pin = clave;
	}

	public String getNtarjeta() {
		return ntarjeta;
	}

	public void setNtarjeta(String tarjeta) {
		this.ntarjeta = tarjeta;
	}

	public String getTipotarjeta() {
		return tipotarjeta;
	}

	public void setTipotarjeta(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
