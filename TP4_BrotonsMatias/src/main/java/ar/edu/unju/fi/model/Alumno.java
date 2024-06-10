package ar.edu.unju.fi.model;

import java.util.Calendar;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private Calendar fechadenacimiento;
	private String domicilio;
	private String lu;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	public Alumno(String dni, String nombre, String apellido, String email, String telefono, Calendar fechadenacimiento,
			String domicilio, String lu) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fechadenacimiento = fechadenacimiento;
		this.domicilio = domicilio;
		this.lu = lu;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Calendar getFechadenacimiento() {
		return fechadenacimiento;
	}
	public void setFechadenacimiento(Calendar fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLu() {
		return lu;
	}
	public void setLu(String lu) {
		this.lu = lu;
	}
	
	
	
	
}