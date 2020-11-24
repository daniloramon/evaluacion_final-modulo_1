package moduo1;

public class Capacitacion implements Iasesoria{
	
	private int idCap = 1;
	private String rutCliente = new String();
	private String dia = new String();
	private String hora = new String();
	private String lugar = new String();
	private String duracion = new String();
	private int cantAsistentes = 0;
	int num = 0;
	
	public Capacitacion() {}
	
	public Capacitacion(String rutCliente, String dia, String hora, String lugar, 
		String duracion, int cantAsistentes) {
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}
	
	public int getIdCap() {
		return idCap;
	}
	public void setIdCap(int idCap) {
		this.idCap = idCap;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public int getCantAsistentes() {
		return cantAsistentes;
	}
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Capacitacion [idCap=" + idCap + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes=" + cantAsistentes + "]";
	}
	/*
	 * metodo mostrarDetalle muestra el lugar, hora, día y duración de la capacitación.
	 */
	public void mostrarDetalle() {
		System.out.println("La capacitación será en " + this.lugar + " a las " + this.hora + " del día " + this.dia + ", y durará " + this.duracion + " minutos.\n");
	}
	/*
	 * el metodo numID se auto incrementa dependiendo de las veces que uno ingrese una capacitación
	 * @return num retorna el numero de la capacitacion
	 */
	public int numID() {
		num = num + this.idCap;
		return num;
	}
	/* el método validarRun recibe el @param y realiza la validación del rut
	 * 
	 * @param String rut 
	 * @return rutCliente devuelve el rut validado o el campo vacío
	 */
	public String validarRun(String rut) {
		if(rut.length()==9 || rut.length()==10) {
			String[] runDescompuesto = rut.split("-");
			int runSinDv = Integer.parseInt(runDescompuesto[0]);
			this.rutCliente = runSinDv + "";
			return rutCliente;
		} else {
			this.rutCliente = "";
			System.out.println("\tFavor intente nuevamente.");
			return rutCliente;
		}
	}
	/* el método validarDia recibe el @param y realiza la validación del día
	 * 
	 * @param String dias 
	 * @return this.dia devuelve el dia validado 
	 */
	public String validarDia(String dias){
		int j, i=0;
		do {
			j=Integer.parseInt(dias);
		    if (j==1) {
		    	this.dia="Lunes";
		       i=1;
		    }else if(j==2) {
		    	this.dia="Martes";
		    	i=1;
		    }else if(j==3){
		    	this.dia="Miercoles";
		    	i=1;
		    }else if(j==4) {
		    	this.dia="Jueves";
		    	i=1;
		    }else if(j==5) {
		    	this.dia="viernes";
		    	i=1;
		    }else if(j==6) {
		    	this.dia="Sabado";
		    	i=1;
		    }else if (j==7) {
		    	this.dia="Domingo";
		    	i=1;
		    } else {
		    	i=0;
		    }
		}while(j<1 || j>7);
		return this.dia;
	}
	/* el método validarLugar recibe el @param y realiza la validación del lugar
	 * 
	 * @param String lugar 
	 * @return this.lugar devuelve el lugar validado o campo vacío
	 */
	public String validarLugar(String lugar) {
		if(lugar.length() >= 10 && lugar.length() <= 50) {
			this.lugar = lugar;
		} else {
			this.lugar = "";
			System.out.println("Dato fuera de rango.");
		}
		return this.lugar;
	}
	/* el método validarHora recibe el @param y realiza la validación de la hora
	 * 
	 * @param String horaFinal 
	 * @return this.hora devuelve la hora validada o campo vacío
	 */
	public String validarHora(String horaFinal) {
		String[] hora2 = horaFinal.split(":");
		int hora = Integer.parseInt(hora2[0]);
		int minutos = Integer.parseInt(hora2[1]);
		if((hora >= 0 && hora <= 23) && (minutos >= 0 && minutos <= 59)) {
			this.hora = horaFinal;
		} else {
			this.hora = "";
			System.out.println("\tHora inválida.");
		}
		return this.hora;
	}
	/* el método validarDuracion recibe el @param he ingresa al setter
	 * 
	 * @param String duracion 
	 * @return getDuracion devuelve el param
	 */
	public String validarDuracion(String duracion) {
		setDuracion(duracion);
		return getDuracion();
	}
	/* el método validarCantidad recibe el @param he ingresa al setter
	 * 
	 * @param String cantAsistentes
	 * @return getCantAsistentes devuelve el param
	 */
	public int validarCantidad(int cantAsistentes) {
		setCantAsistentes(cantAsistentes);
		return getCantAsistentes();
	}
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
	}
	@Override
	public String buscarCliente() {
		return null;
	}
	@Override
	public String eliminarUsuario() {
		// TODO Auto-generated method stub
		return null;
	} 
}
