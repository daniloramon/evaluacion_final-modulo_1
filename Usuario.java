package moduo1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Usuario implements Iasesoria{
	private String nombre = new String();
	private String fecNac = new String();
	private String run = new String();
	private String tipoUsuario = new String();
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	private int edad;
	DateTimeFormatter fmt2;
	LocalDate fechaNaci2;
	LocalDate ahora2;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Usuario(String fecNac) {
		this.fecNac = fecNac;
	}
	Scanner leer = new Scanner(System.in);
	public Usuario() {}
	public Usuario(String run,String nombre, String fecNac, String tipoUsuario) {
		this.nombre = nombre;
		this.fecNac = fecNac;
		this.run = run;
		this.tipoUsuario = tipoUsuario;
	}
	public String getNombreU() {
		return nombre;
	}
	public void setNombreU(String nombre) {
		this.nombre = nombre;
	}
	public String getFecNac() {
		return fecNac;
	}
	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fecNac=" + fecNac + ", run=" + run + "]";
	}
	@Override
	public abstract void analizarUsuario();
	/*
	 * el metodo buscarCliente 
	 * @return getTipoUsuario retorna el tipo de usuario
	 */
	public String buscarCliente() {
		return getTipoUsuario();
	}
	/* el método descomponerRun recibe el @param y realiza la validación del rut
	 * 
	 * @param String rut 
	 * @return this.run devuelve el run validado o el campo vacío
	 */
	public String descomponerRun(String rut) {
		if(rut.length()==9 || rut.length()==10) {
			String[] runDescompuesto = rut.split("-");
			int runSinDv = Integer.parseInt(runDescompuesto[0]);
			this.run = runSinDv + "";
		} else {
			this.run = "";
			System.out.println("\tFavor intente nuevamente.");
		}
		return run;
	}
	/*
	 * el metodo mostrarEdad
	 * @return retorna la edad del usuario
	 */
	public String mostrarEdad() {
		return ("El usuario tiene " + getFecNac() + " años. ");
	}
	/* el método ingresarFecha recibe el @param y realiza la validación del fecha de nacimiento
	 * 
	 * @param String fechaNac 
	 * @return res devuelve la fecha de nacimiento validado o el campo vacío
	 */
	public String ingresarFecha(String fechaNac) {
		String res = new String();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNaci = LocalDate.parse(fechaNac, fmt);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNaci, ahora);
		if(periodo.getYears() >=0 && periodo.getYears() < 150) {
			setEdad(periodo.getYears());	
			setFecNac(fechaNac);
			System.out.println("\t\tSu edad es: " + getEdad());
			res = getEdad()+"";
		} else {
			setEdad(-1);
			System.out.println("\tFavor intente nuevamente.");
			res = "";
		}
		return res;
	}
	/* el método validarNombre recibe el @param y realiza la validación del nombre
	 * 
	 * @param String nombre
	 * @return this.nombre devuelve el nombre validado o el campo vacío
	 */
	public String validarNombre(String nombre) {
		if(nombre.length() >= 2 && nombre.length() <= 50) {
			this.nombre = nombre;
		} else {
			this.nombre = "";
			System.out.println("\tFavor intente nuevamente.");
		}
		return this.nombre;
	}
	@Override
	public String eliminarUsuario() {
		return getRun();
	}
}
