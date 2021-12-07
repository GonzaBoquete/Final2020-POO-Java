package modelo;

public class OperadorMovil {
	private int codigoMovil;
	private String companiaMovil;
	
	public OperadorMovil(int codigoMovil, String companiaMovil) {
		super();
		this.codigoMovil = codigoMovil;
		this.companiaMovil = companiaMovil;
	}
	
	public int getCodigoMovil() {
		return codigoMovil;
	}
	
	public String getCompaniaMovil() {
		return companiaMovil;
	}
	
	public void setCodigoMovil(int codigoMovil) {
		this.codigoMovil = codigoMovil;
	}
	
	public void setCompaniaMovil(String companiaMovil) {
		this.companiaMovil = companiaMovil;
	}
	
	@Override
	public String toString() {
		return "OperadorMovil [codigoMovil=" + codigoMovil + ", companiaMovil=" + companiaMovil + "]";
	}
}
