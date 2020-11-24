package moduo1;

public class VisitaTerreno extends Cliente {
	private int idVisita = 0;
	private int rutCliente = 0;
	private String dia = new String();
	private int hora = 0;
	private String lugar = new String();
	private String comentarios = new String();
	public VisitaTerreno() {}
	public VisitaTerreno(int idVisita, int rutCliente, String dia, int hora, String lugar, String comentarios) {
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}
	public int getIdVisita() {
		return idVisita;
	}
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "VisitaTerreno [idVisita=" + idVisita + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}
	
}
