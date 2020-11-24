package moduo1;

public class Administrativo extends Usuario implements Iasesoria{
	private String area = new String ();
	private String expPrevia = new String ();
	public Administrativo() {}
	public Administrativo(String area, String expPrevia) {
		this.area = area;
		this.expPrevia = expPrevia;
	}
	public Administrativo(String run, String nombre, String fecNac, String area, String expPrevia, String tipoUsuario) {
		super(run, nombre, fecNac, tipoUsuario);
		this.area = area;
		this.expPrevia = expPrevia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExpPrevia() {
		return expPrevia;
	}
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + ", toString()=" + super.toString() + "]";
	}
	/**
	 * Metodo analizarUsuario despliega los datos
	 * de la clase padre, y la area de trabajo del administrativo junto con la experiencia previa.
	 */
	@Override
	public void analizarUsuario() {
		System.out.println("\nEl nombre del usuario es " + getNombreU() + " y el rut es " + getRun() + ".");
		System.out.println(mostrarEdad() + "\nEl area de trabajo es " + getArea() + " y su experiencia previa es " + getExpPrevia());
	}
	/* el método validarArea recibe el @param y realiza la validación del area
	 * 
	 * @param String area 
	 * @return this.area devuelve el area validado o el campo vacío
	 */
	public String validarArea(String area) {
		if(area.length() >= 5 && area.length() <= 20) {
			this.area = area;
		} else {
			this.area = "";
		}
		return this.area;
	}
	/* el método validarExperiencia recibe el @param y realiza la validación de la experiencia
	 * 
	 * @param String experiencia 
	 * @return this.expPrevia; devuelve la experiencia previa validado o el campo vacío
	 */
	public String validarExperiencia(String experiencia) {
		if(experiencia.length() <= 100) {
			this.expPrevia = experiencia;
		} else {
			this.expPrevia = "";
		}
		return this.expPrevia;
	}
	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		
	}

}
