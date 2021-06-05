package app.ito.poo;

import java.time.LocalDate;

import Clases.ito.poo.Transporte;
import Clases.ito.poo.Viajes;

public class MyApp {
	
	static void run() {
		Transporte lineax=(new Transporte("Ferrari",2001,5500,LocalDate.of(2020, 05, 06), "No ha realizado viajes" ));
		System.out.println (lineax);
		Viajes viajesx=(new Viajes("Las vegas","Nevada, EE. UU.",LocalDate.of(2021, 05, 06),LocalDate.of(2021, 30, 06),1000,"Fichas y cartas"));
		System.out.println (viajesx);
	}
	public static void main(String[] args) {
		run();

	}

}
