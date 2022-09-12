package practica.herencias;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Operario extends Empleado{
	protected int nivel;
	
	//CONSTRUCTOR
	public Operario (String nombre, int edad,LocalDate fechaIngreso, int salario, int nivel) {
		super (nombre, edad,fechaIngreso, salario);
		this.nivel = nivel;
	}
	
	//GETTERS AND SETTERS
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	//METHODS
	@Override
	public void incentivar() {
		this.getEdad();
		this.getNivel();
		if (this.getEdad() > 30 && this.nivel > 2) {
			this.setSalario((int) (this.getSalario() + (BONO * 2)));
			System.out.println("recibe incentivo doble");
		}else if (this.getEdad() > 30 || this.getNivel() > 2) {
			this.setSalario((int) (this.getSalario() + (BONO)));
			System.out.println("recibe incentivo simple");
		}
		System.out.println("No recibe incentivo");
	}
	
	public void actualizarNivel() {
		long diffTime = this.getFechaIngreso().until(LocalDate.now(), ChronoUnit.YEARS);
		if (diffTime > 2 && this.getNivel() < 5) {
			this.setNivel(this.getNivel() + 1);
		}
	}
}
