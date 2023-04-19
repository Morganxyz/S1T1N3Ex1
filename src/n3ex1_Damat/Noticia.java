package n3ex1_Damat;

public abstract class Noticia {

	private String titular;
	private String text = " ";
	private int puntuacio;
	private int preu;
	
	public Noticia(String titular,String text) {
		this.titular = titular;
		this.text = text;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getText() {
		return this.text;
	}
	
	public int getPuntuacio() {
		return this.puntuacio;
	}
	
	public int getPreu() {
		return this.preu;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setPreu(int preu) {
		this.preu = preu;
	}
	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}
	
	public abstract void calcularPreuNoticia();
	public abstract void calcularPuntuacio();
	
}
