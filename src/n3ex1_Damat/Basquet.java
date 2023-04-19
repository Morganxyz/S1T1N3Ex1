package n3ex1_Damat;

public class Basquet extends Noticia{
	
	private String competicio;
	private String club;
	
	
	public Basquet(String titular,String text,String competicio,String club){
		super(titular,text);
		this.competicio = competicio;
		this.club = club;
	}

	/*preu inicial: 250 €

	Eurolliga: 75 €

	Barça o Madrid: 75 €*/

	public void calcularPreuNoticia() {
		
		int preuIni = 250;
		int preuComp;
		int preuClub;
		int preuJug;
		int preuTot;
		
		if(competicio.equalsIgnoreCase("Eurolliga")) {
			preuComp = 75;
		}else {
			preuComp = 0;
		}
		
		if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			preuClub = 75;
		}else {
			preuClub = 0;
		}
				

		preuTot = preuIni + preuComp + preuClub;
		
		super.setPreu(preuTot);
	}
	
		/*4 punts
	
	Eurolliga: 3 punts
	
	ACB: 2 punts
	
	Barça o Madrid: 1 punt*/
	
		
	public void calcularPuntuacio() {
			
			int puntIni = 4;
			int puntComp;
			int puntClub;
			int puntTot;
			
			if(competicio.equalsIgnoreCase("Eurolliga")) {
				puntComp = 3;
			}else if(competicio.equalsIgnoreCase("ACB")) {
				puntComp = 2;
			}else {
				puntComp = 0;
			
			if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
				puntClub = 1;
			}else {
				puntClub = 0;
			}
			
			puntTot = puntIni + puntComp + puntClub;
			
			super.setPuntuacio(puntTot);
		}
	}
	
	public String toString() {
		return "La noticia : " + super.getTitular() + " té el següent texte: "  + super.getText()
		+ "." + " Va lligada a la competicio de : " + this.competicio + " ,el club: " + this.club + ".";
}

}
