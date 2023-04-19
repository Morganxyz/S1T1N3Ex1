package n3ex1_Damat;

public class MotoGp extends Noticia{
	
	private String equip;
	
	public MotoGp(String titular,String text,String equip){
		super(titular,text);
		this.equip = equip;
	}

	/*Preu inicial: 100 €

Honda o Yamaha: 50 €*/
	
	public void calcularPreuNoticia() {
	
		int preuIni = 100;
		int preuEq;
		int preuTot;
		
		if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			preuEq= 50;
		}else {
			preuEq = 0;
		}
		
		preuTot = preuIni + preuEq;
		
		super.setPreu(preuTot);
		
	}
	
	/*3 punts

Honda o Yamaha: 3 punts*/
	
public void calcularPuntuacio() {
		
		int puntIni = 3;
		int puntEq;
		int puntTot;
		
	
		if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
			puntEq= 3;
		}else {
			puntEq = 0;
		}
		
		puntTot = puntIni + puntEq;
		
		super.setPuntuacio(puntTot);
	}
		public String toString() {
			return "La noticia : " + super.getTitular() + " té el següent texte: "  + super.getText()
			+ "." + " Va lligada l´equip: " +  this.equip + ".";
		}
}
