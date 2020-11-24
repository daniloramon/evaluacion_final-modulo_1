package moduo1;


public class Profesional extends Usuario implements Iasesoria{
	private String titulo = new String();
	private String fecIngreso = new String();
	public Profesional() {}
	public Profesional(String titulo, String fecIngreso) {
		this.titulo = titulo;
		this.fecIngreso = fecIngreso;
	}
	public Profesional(String run, String nombre, String fecNac, String titulo, String fecIngreso, String tipoUsuario) {
		super(run, nombre, fecNac, tipoUsuario);
		this.titulo = titulo;
		this.fecIngreso = fecIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFecIngreso() {
		return fecIngreso;
	}
	public void setFecIngreso(String fecIngreso) {
		this.fecIngreso = fecIngreso;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fecIngreso=" + fecIngreso + ", toString()=" + super.toString()
				+ "]";
	}
	/**
	 * Metodo analizarUsuario despliega los datos de la clase padre, muestra la edad, el titulo del profesional junto con la fecha de ingrerso.
	 * @param getnombreU, getRun, mostrarEdad, titulo y fecIngreso
	 */
	@Override
	public void analizarUsuario() {
		System.out.println("\nEl nombre del usuario es " + getNombreU() + " y el rut es " + getRun() + ". ");
		System.out.println(mostrarEdad() + "\nEl título es " + titulo + ", he ingreso en la fecha " + fecIngreso + ".");
	}
	/* el método validarTitulo recibe el @param y realiza la validación del titulo
	 * 
	 * @param String titulo 
	 * @return this.titulo devuelve el titulo validado o el campo vacío
	 */
	public String validarTitulo(String titulo) {
		if(titulo.length() >= 10 && titulo.length() <= 50) {
			this.titulo = titulo;
		} else {
			this.titulo = "";
		}
		return this.titulo;
	}
	/* el método validarFechaIngreso recibe el @param y realiza la validación de la fecha
	 * 
	 * @param String fechaIngreso
	 * @return this.fecIngreso devuelve la fecha de ingreso validado o el campo vacío
	 */
	public String validarFechaIngreso(String fechaIngreso) {
		if(fechaIngreso.charAt(2)=='/' || fechaIngreso.charAt(2)=='-') {
			if(fechaIngreso.charAt(5)=='/' || fechaIngreso.charAt(5)=='-') {
				this.fecIngreso = fechaIngreso;
			} else {
				this.fecIngreso = "";
			}
		}else {
			this.fecIngreso = "";
		}
		return this.fecIngreso;
	}
	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		
	}
}
