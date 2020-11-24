package moduo1;

public class Revision extends Cliente {
	private int idRevision = 0;
	private int idVisita = 0;
	private String nombreVisita = new String();
	private String detalleRevisar = new String();
	private char estado;
	public Revision() {}
	public Revision(int idRevision, int idVisita, String nombreVisita, String detalleRevisar, char estado) {
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreVisita = nombreVisita;
		this.detalleRevisar = detalleRevisar;
		this.estado = estado;
	}
	public int getIdRevision() {
		return idRevision;
	}
	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}
	public int getIdVisita() {
		return idVisita;
	}
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	public String getNombreVisita() {
		return nombreVisita;
	}
	public void setNombreVisita(String nombreVisita) {
		this.nombreVisita = nombreVisita;
	}
	public String getDetalleRevisar() {
		return detalleRevisar;
	}
	public void setDetalleRevisar(String detalleRevisar) {
		this.detalleRevisar = detalleRevisar;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreVisita=" + nombreVisita
				+ ", detalleRevisar=" + detalleRevisar + ", estado=" + estado + "]";
	}
	
}
