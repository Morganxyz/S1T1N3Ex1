package n3ex1_Damat;

public class Futbol extends Noticia{

	
	private String competicio;
	private String club;
	private String jugador;
	
	public Futbol(String titular,String text,String competicio,String club,String jugador){
		super(titular,text);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	
	public String getCompeticio() {
		return this.competicio;
	}
	public String getClub() {
		return this.club;
	}
	public String getJugador() {
		return this.jugador;
	}
	
	/*peu inicial: 300 €
	Lliga de Campions: 100 €
	Barça o Madrid: 100 €
	Ferran Torres o Benzema: 50 €*/
	
	public void calcularPreuNoticia() {
		
		int preuIni = 300;
		int preuComp;
		int preuClub;
		int preuJug;
		int preuTot;
		
		if(this.competicio.equalsIgnoreCase("Lliga de Campions")) {
			preuComp = 100;
		}else {
			preuComp = 0;
		}
		
		if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			preuClub = 100;
		}else {
			preuClub = 0;
		}
				
		if(this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
			preuJug= 50;
		}else {
			preuJug = 0;
		}
		
		preuTot = preuIni + preuComp + preuClub + preuJug;
		
		super.setPreu(preuTot);
	}
	
	
		/*5 Punts.
	
	Lliga de Campions: 3 punts
	
	Lliga: 2 punts
	
	Barça o Madrid: 1 punt
	
	Ferran Torres o Benzema: 1 punt*/
	
	public void calcularPuntuacio() {
		
		int puntIni = 5;
		int puntComp;
		int puntClub;
		int puntJug;
		int puntTot;
		
		if(this.competicio.equalsIgnoreCase("Lliga de Campions")) {
			puntComp = 3;
		}else if(this.competicio.equalsIgnoreCase("Lliga")){
			puntComp = 2;
		}else {
			puntComp = 0;
		}
		
		if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			puntClub = 1;
		}else {
			puntClub = 0;
		}
				
		if(this.jugador.equalsIgnoreCase("Ferran Torres") || this.club.equalsIgnoreCase("Benzema")) {
			puntJug= 1;
		}else {
			puntJug = 0;
		}
		
		puntTot = puntIni + puntComp + puntClub + puntJug;
		
		super.setPuntuacio(puntTot);
	}
	
	public String toString() {
		return "La noticia : " + super.getTitular() + " té el següent texte: "  + super.getText()
		+ "." + " Va lligada a la competicio de:  " + this.competicio + " , el club. " + this.club +
		" ,i relacionada amb el jugador: " + this.jugador + ".";
}
}
