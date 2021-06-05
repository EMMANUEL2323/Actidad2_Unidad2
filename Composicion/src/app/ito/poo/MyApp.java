package app.ito.poo;

import java.util.Date;
import clases.ito.poo.Composicion;

public class MyApp {


	static void run() {
		
		
		 
		
		Composicion composicion1 = new Composicion ("Belivever", 3.17f,"Rock", new Date(), new Date());
		 
		
		
		composicion1.solicitarCompositor("Imagine Dragons");
		System.out.println(composicion1);
		
	
	}
	

	public static void main(String[] args) {
		run();
	} 

}