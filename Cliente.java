package moduo1;

import java.util.Scanner;

public class Cliente extends Usuario implements Iasesoria{
	private String apellido = new String();
	private String fono = new String();
	private String afp = new String();
	private String sistSalud = new String();
	private String direccion = new String();
	private String comuna = new String();
	private int edad = 0;
	Scanner leer = new Scanner(System.in);
	public Cliente() {}
	public Cliente(String run, String nombre, String apellido, String fono, String afp, String sistSalud, 
			String direccion, String comuna, String fecNac, String tipoUsuario) {
		super(run, nombre, fecNac, tipoUsuario);
		this.apellido = apellido;
		this.fono = fono;
		this.afp = afp;
		this.sistSalud = sistSalud;
		this.direccion = direccion;
		this.comuna = comuna;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFono() {
		return fono;
	}
	public void setFono(String fono) {
		this.fono = fono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getSistSalud() {
		return sistSalud;
	}
	public void setSistSalud(String sistSalud) {
		this.sistSalud = sistSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Cliente [fono=" + fono + ", afp=" + afp + ", sistSalud=" + sistSalud + ", direccion=" + direccion
				+ ", comuna=" + comuna + ", edad=" + edad + ", toString()=" + super.toString() + "]";
	}
	/**
	 * Metodo analizarUsuario despliega los datos de la clase padre, muestra la edad, 
	 * el nombre completo, la direccion del cliente junto con la comuna y sistema de salud.
	 * 
	 * @param getNombreU(), getRun(), mostrarEdad(), obtenerNombre(), getSistSalud()
	 */ 
	@Override
	public void analizarUsuario() {
		System.out.println("\nEl nombre del usuario es " + getNombreU() + " y el rut es " + getRun() + ". ");
		System.out.println(mostrarEdad() + "\nSu nombre completo es " + obtenerNombre() + ". \nLa Dirección es " + 
				direccion + ", comuna " + comuna + ". "	+ "\nY su sistema de salud es " + getSistSalud() + ".\n\n");
	}
	/* el método obtenerNombre 
	 *  
	 * @return el nombre más el apellido
	 */
	public String obtenerNombre() {
		return super.getNombreU() + " " + apellido;
	}
	/* el método validarApellido recibe el @param y realiza la validación del apellido
	 * 
	 * @param String apellido
	 * @return this.area devuelve el apellido validado o el campo vacío
	 */
	public String validarApellido(String apellido) {
		if(apellido.length() >= 2 && apellido.length() <= 50) {
			this.apellido = apellido;
		} else {
			this.apellido = "";
			System.out.println("\tFavor intente nuevamente.");
		}
		return this.apellido;
	}
	/* el método validarAFP recibe el @param y realiza la validación de la afp
	 * 
	 * @param String afp
	 * @return this.afp devuelve el afp validado o el campo vacío
	 */
	public String validarAFP(String afp) {
		if(afp.length() >= 4 && afp.length() <= 30) {
			this.afp = afp;
		} else {
			this.afp = "";
			System.out.println("\tFavor intente nuevamente.");
		}
		return this.afp;
	}
	/* el método validarTelefono recibe el @param y realiza la validación del telefono
	 * 
	 * @param String num
	 * @return this.fono devuelve el telefono validado o el campo vacío
	 */
	public String validarTelefono(String num){
		int cont = 0;
		for(int i = 0; i < num.length(); i++) {
			if(Character.isDigit(num.charAt(i)) == false) {
				cont = 0;
				System.out.println("\tFavor intente nuevamente. Recuerde, solo números.");
			} else {
				cont++;
			}
			if(cont == num.length()) {
				this.fono = num;
			} else {
				this.fono = "";
			}
		}
		return this.fono;
	}
	/* el método sistemaSalud recibe el @param y realiza la validación del sistema de salud
	 * 
	 * @param String sisSalud
	 * @return this.sistSalud devuelve el sistema de salud validado o el campo vacío
	 */
	public String sistemaSalud(String sisSalud) {
		switch(sisSalud) {
		case "1":
			this.sistSalud = "Fonasa";
		case "2":
			this.sistSalud = "Isapre";
		default:
			this.sistSalud = "";
			System.out.println("\tOpción inválida.");
		}
		return this.sistSalud;
	}	
	/* el método validarDireccion recibe el @param y realiza la validación de la direccion
	 * 
	 * @param String direccion
	 * @return this.direccion devuelve la direccion validado o el campo vacío
	 */
	public String validarDireccion(String direccion) {
		if(direccion.length() < 70) {
			this.direccion = direccion;
		} else {
			this.direccion = "";
		}
		return this.direccion;
	}
	/* el método validarComuna recibe el @param y realiza la validación de la comuna
	 * 
	 * @param String comuna
	 * @return this.comuna devuelve la comuna validado o el campo vacío
	 */
	public String validarComuna(String comuna) {
		if(comuna.length() < 50) {
			this.comuna = comuna;
		} else {
			this.comuna = "";
		}
		return this.comuna;
	}
	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		
	}
}
