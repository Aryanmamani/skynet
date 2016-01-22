package Matricula;

public class Matricula {
	private String Codigo;
	private String numerodmatricula;
	private String ndhermanos;
	private boolean Traslado;
	private String Certificadodestudios;
	private String Gradodestudios;
	private tipodepago pago;
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNumerodmatricula() {
		return numerodmatricula;
	}
	public void setNumerodmatricula(String numerodmatricula) {
		this.numerodmatricula = numerodmatricula;
	}
	public String getNdhermanos() {
		return ndhermanos;
	}
	public void setNdhermanos(String ndhermanos) {
		this.ndhermanos = ndhermanos;
	}
	public boolean isTraslado() {
		return Traslado;
	}
	public void setTraslado(boolean traslado) {
		Traslado = traslado;
	}
	public String getCertificadodestudios() {
		return Certificadodestudios;
	}
	public void setCertificadodestudios(String certificadodestudios) {
		Certificadodestudios = certificadodestudios;
	}
	public String getGradodestudios() {
		return Gradodestudios;
	}
	public void setGradodestudios(String gradodestudios) {
		Gradodestudios = gradodestudios;
	}
	public tipodepago getPago() {
		return pago;
	}
	public void setPago(tipodepago pago) {
		this.pago = pago;
	}
}
