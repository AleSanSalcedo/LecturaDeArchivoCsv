package ar.edu.unpaz.repository;

public class Vial {
	private String númeroDeHoja;
	private String tipoObjeto;
	private String identificadorTramo;
	private String tipoCamino;
	private String longitud;
	
	
	public Vial(String númeroDeHoja, String tipoObjeto, String identificadorTramo, String tipoCamino, String longitud) {
		super();
		this.númeroDeHoja = númeroDeHoja;
		this.tipoObjeto = tipoObjeto;
		this.identificadorTramo = identificadorTramo;
		this.tipoCamino = tipoCamino;
		this.longitud = longitud;
	}
	public String getNúmeroDeHoja() {
		return númeroDeHoja;
	}
	public String getTipoObjeto() {
		return tipoObjeto;
	}
	public String getIdentificadorTramo() {
		return identificadorTramo;
	}
	public String getTipoCamino() {
		return tipoCamino;
	}
	public String getLongitud() {
		return longitud;
	}
	
	
}
