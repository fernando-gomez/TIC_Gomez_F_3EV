
public class ManejaMascotas {

	public static void main(String[] args) {
		Mascota cuqui;
		cuqui=new Mascota("cuqui",3,"perro",'h');
		System.out.println("Mi mascota se llama "+cuqui.getNombre());
		System.out.println("y tiene "+cuqui.getEdad() +" años");
		//pasa un año
		cuqui.setEdad(4);
		System.out.println("Ahora tiene "+cuqui.getEdad());
		System.out.println("por lo tanto nació en el año "+cuqui.getAnioNacimiento(2018));
	}

}
