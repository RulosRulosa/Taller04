package Main;

public class Persona {

	private int ID;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Sexo;

	public Persona(int ID, String nombre, String apellido, int edad, String sexo) {
		this.ID = ID;
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Sexo = sexo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}
}