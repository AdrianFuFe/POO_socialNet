package practica.herencias;

import java.time.LocalDate;

import es.imatia.units.Car;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Director d1 = new Director("Juan", 52, LocalDate.of(1995, 06, 22), 3200, "i+D", 15);
		
		d1.incentivar();
	}

}
