package practica.herencias;
import java.time.LocalDate;


public class Empleado {
	private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;
	public static final double BONO = 1000;
	
	
	//CONSTRUCTOR
	public Empleado(String nombre, int edad,LocalDate fechaIngreso, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	//GETTERS AND SETTERS
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

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	//METHODS
	public void incentivar() {
		System.out.println();
	}
	
}