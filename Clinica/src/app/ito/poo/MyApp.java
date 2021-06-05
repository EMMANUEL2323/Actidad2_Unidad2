package app.ito.poo;
import clases.ito.poo.Clinica;
import java.time.LocalDate;
public class MyApp {
	static void run() {
		Clinica c= new Clinica("Emmanuel","DIVE2155515",LocalDate.of(2002, 02, 21));
		System.out.println(c+"\n");
		c.agregarConsulta(null, "Dolor de estomago", 34, 72, 1.70f);
		System.out.println(c+"\n");
		System.out.println(c.receta("Genoprasol", "Mantener reposo, tomar pastilla cada 8 horas\n"));
	
		System.out.println("Tu edad es de: "+c.obtenEdad(2001));
	}
	

	
	public static void main(String []args) {
		run();
	}

}