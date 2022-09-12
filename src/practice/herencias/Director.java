package practice.herencias;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Director extends Empleado{
	protected String departamento;
	protected int personal;
		
	//CONSTRUCTOR
	public Director (String nombre, int edad,LocalDate fechaIngreso, double salario, String departamento, int personal) {
		super (nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}
	
	//GETTERS AND SETTERS
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}
	
	
	//METHODS
	@Override
	public void incentivar() {
		long diffTime = this.getFechaIngreso().until(LocalDate.now(), ChronoUnit.MONTHS);
		double nuevoSalario = this.getSalario();
		if(diffTime > 30 && this.personal > 20) {
			nuevoSalario = this.setSalario(this.getSalario() + (BONO * 2));
			System.out.println("recibe incentivo doble");
		}else if (diffTime > 30 || this.personal > 20) {
			this.setSalario(this.getSalario() + BONO);
			System.out.println("recibe incentivo simple");
		}
		System.out.println("no recive incentivos");
	}
	
}
