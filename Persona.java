
public class Persona {
	//Atributos
	int edad;
	String nombre;
	String apellidos;
	char colorPelo;
	//Constructor
	Persona(int edad,String nombre,String apellidos,char colorPelo){
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.colorPelo=colorPelo;
	}
	//Métodos
	  //Cambiaría la edad
	void setEdad(int nuevaEdad){
		edad=nuevaEdad;
	}
	  //Cambiar el nombre
	void setNombre(String nuevoNombre){
		nombre=nuevoNombre;
	}
	void setColorPelo(char nuevoColorPelo){
		colorPelo=nuevoColorPelo;
	}
	String getNombre(){
		return nombre;
		
	}
	

}




