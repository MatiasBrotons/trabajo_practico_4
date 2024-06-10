package ar.edu.unju.fi.model;

public class Carrera {
	private String codigo;
	private String nombre;
	private Integer cant_anios;
	private Estado estado;
	public Carrera(String codigo, String nombre, Integer cant_anios, Estado estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cant_anios = cant_anios;
		this.estado = estado;
	}
	public Carrera() {
		// TODO Auto-generated constructor stub
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCant_anios() {
		return cant_anios;
	}
	public void setCant_anios(Integer cant_anios) {
		this.cant_anios = cant_anios;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
