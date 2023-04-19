package n3ex1_Damat;

public class F1 extends Noticia{
	
	private String escuderia;
	
	public F1(String titular,String text,String escuderia){
		super(titular,text);
		this.escuderia = escuderia;
	
	}

	/*Preu inicial: 100 €

Ferrari o Mercedes: 50 €*/
	
	public void calcularPreuNoticia() {
		
		int preuIni = 100;
		int preuEsc;
		int preuTot;
		
		if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			preuEsc= 50;
		}else {
			preuEsc = 0;
		}
		
		preuTot = preuIni + preuEsc;
		
		super.setPreu(preuTot);
		
	}
	
	/*4 punts

Ferrari o Mercedes: 2 punts*/
	
public void calcularPuntuacio() {
		
		int puntIni = 4;
		int puntEsc;
		int puntTot;
		
		if(this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
			puntEsc= 4;
		}else {
			puntEsc = 0;
		}
		
		puntTot = puntIni + puntEsc;
		
		super.setPuntuacio(puntTot);
	}
		public String toString() {
			return "La noticia : " + super.getTitular() + " té el següent texte: "  + super.getText()
			+ "." + " Va lligada amb l´escuderia: " + this.escuderia + ".";
		}

}
