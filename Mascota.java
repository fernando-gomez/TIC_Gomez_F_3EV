
public class Mascota {
	String nombre;	
	int edad;
	String especie;
	char sexo;
	public Mascota(String nombre, int edad, String especie, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAnioNacimiento(int anioActual){
		int anioNacimiento;
		anioNacimiento=anioActual-edad;
		return(anioNacimiento);
	} 
	public int getAnioNacimiento(){
		int anioNacimiento;
		int anioActual=2018;
		anioNacimiento=anioActual-edad;
		return(anioNacimiento);
	}
	


}
