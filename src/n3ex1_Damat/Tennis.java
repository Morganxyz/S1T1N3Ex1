package n3ex1_Damat;

public class Tennis extends Noticia{
	
		private String competicio;
		private String jugador;
	
	
	public Tennis(String titular,String text,String competicio,String jugador){
		super(titular,text);
		this.competicio = competicio;
		this.jugador = jugador;
	}

	/*Preu inicial: 150 € 

Federer, Nadal o Djokovic: 100 €*/
	
	public void calcularPreuNoticia() {
		int preuIni = 150;
		int preuJug;
		int preuTot;
		
		if(this.jugador.equalsIgnoreCase("Federer") || this.jugador.equalsIgnoreCase("Nadal")
				|| this.jugador.equalsIgnoreCase("Djokovic")) {
			preuJug= 100;
		}else {
			preuJug = 0;
		}
		
		preuTot = preuIni + preuJug;
		
		super.setPreu(preuTot);
	}
	
	/*4 punts

Federer, Nadal o Djokovic: 3 punts*/
	
public void calcularPuntuacio() {
		
		int puntIni = 4;

		int puntJug;
		int puntTot;
		
		if(this.jugador.equalsIgnoreCase("Federer") || this.jugador.equalsIgnoreCase("Nadal")
				|| this.jugador.equalsIgnoreCase("Djokovic")) {
			puntJug= 3;
		}else {
			puntJug = 0;
		}
		
		puntTot = puntIni + puntJug;
		
		super.setPuntuacio(puntTot);
	}

		public String toString() {
			return "La noticia : " + super.getTitular() + " té el següent texte: "  + super.getText()
			+ "." + " Va lligada a la competicio de: " + this.competicio +
			" ,i relacionada amb el jugador: " + this.jugador + ".";
}

}
