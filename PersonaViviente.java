
public class PersonaViviente {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private FechaNacimiento nacimiento;
	public PersonaViviente(String nombre, String apellido1, String apellido2,
			FechaNacimiento nacimiento) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nacimiento = nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public FechaNacimiento getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(FechaNacimiento nacimiento) {
		this.nacimiento = nacimiento;
	}
	
}
