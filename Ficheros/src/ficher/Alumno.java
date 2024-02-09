package ficher;

public class Alumno {

	private String id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	private String direction;
	private String tef;

// Constructor 

	public Alumno(String id, String nombre, String apellidos, String dni, String email, String direction, String tef) {

		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.direction = direction;
		this.tef = tef;
	}

//Setters y getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getTef() {
		return tef;
	}

	public void setTef(String tef) {
		this.tef = tef;
	}
	
	public void mostrar() {
		System.out.println("ID: " + getId());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("DNI: " + getDni());
		System.out.println("Email: " + getEmail());
		System.out.println("Dirección: " + getDirection());
		System.out.println("Teléfono: " + getTef());
	}

}
