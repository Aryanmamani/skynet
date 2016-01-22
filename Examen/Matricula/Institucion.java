package Matricula;

public class Institucion {
	private String razonsocial;
	private int RUC;
	private String Direccion;
	private String email;
	private String Celular;
	private int fax;
	private String RedesSociales;
	private String Web;
	private String logotipo;
	private Representantelegal Director;
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public int getRUC() {
		return RUC;
	}
	public void setRUC(int rUC) {
		RUC = rUC;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public String getRedesSociales() {
		return RedesSociales;
	}
	public void setRedesSociales(String redesSociales) {
		RedesSociales = redesSociales;
	}
	public String getWeb() {
		return Web;
	}
	public void setWeb(String web) {
		Web = web;
	}
	public String getLogotipo() {
		return logotipo;
	}
	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	public Representantelegal getDirector() {
		return Director;
	}
	public void setDirector(Representantelegal director) {
		Director = director;
	}
	
	
	
}
