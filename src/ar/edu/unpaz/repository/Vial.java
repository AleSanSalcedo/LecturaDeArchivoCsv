package ar.edu.unpaz.repository;

public class Vial {
	private String n�meroDeHoja;
	private String tipoObjeto;
	private String identificadorTramo;
	private String tipoCamino;
	private String longitud;
	
	
	public Vial(String n�meroDeHoja, String tipoObjeto, String identificadorTramo, String tipoCamino, String longitud) {
		super();
		this.n�meroDeHoja = n�meroDeHoja;
		this.tipoObjeto = tipoObjeto;
		this.identificadorTramo = identificadorTramo;
		this.tipoCamino = tipoCamino;
		this.longitud = longitud;
	}
	public String getN�meroDeHoja() {
		return n�meroDeHoja;
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
