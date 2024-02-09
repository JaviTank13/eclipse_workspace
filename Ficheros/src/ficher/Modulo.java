package ficher;

public class Modulo{
	
	private String idmod;
	private String modulo;
	private String curso;
	private String horas;
	private String profesor;
	
// Constructor
	
	public Modulo(String idmod, String modulo,String curso, String horas, String profesor) {
		
		this.idmod = idmod;
		this.modulo = modulo;
		this.profesor = profesor;
	}
	
	// Setters y Getters

	public String getidmod() {
		return idmod;
	}

	public void setidmod(String idmod) {
		this.idmod = idmod;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public void mostrar() {
		System.out.println("idmod Modulo: " + getidmod());
		System.out.println("Modulo: " + getModulo());
		System.out.println("Curso: " + getCurso() + "º");
		System.out.println("Horas: " + getHoras() + "horas");
		System.out.println("Profesor del Modulo:" + getProfesor());
	}

	
	
}