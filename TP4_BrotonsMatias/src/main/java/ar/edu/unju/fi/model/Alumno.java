package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	private float dni;
	private String nombre;
	private String apellido;
	private String email;
	private float telefono;
	private LocalDate nacimiento;
	private String domicilio;
	private float libreta;
	public Alumno(float dni, String nombre, String apellido, String email, float telefono, LocalDate nacimiento,
			String domicilio, float libreta) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.nacimiento = nacimiento;
		this.domicilio = domicilio;
		this.libreta = libreta;
	}
	public float getDni() {
		return dni;
	}
	public void setDni(float dni) {
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
	public float getTelefono() {
		return telefono;
	}
	public void setTelefono(float telefono) {
		this.telefono = telefono;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public float getLibreta() {
		return libreta;
	}
	public void setLibreta(float libreta) {
		this.libreta = libreta;
	}
	

	
	
}
