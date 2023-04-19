package n3ex1_Damat;

import java.util.ArrayList;

public class Redactor {

	private String nomRed;
	private String dni;
	private static float sou;
	ArrayList<Noticia>llistaNoticies = new ArrayList<>();
	
	public Redactor(String nomRed,String dni) {
		this.nomRed = nomRed;
		this.dni = dni;
		Redactor.sou = 1500f;
	}
	
	public String getNomRed() {
		return this.nomRed;
	}
	public String getDni() {
		return this.dni;
	}
	public float getSou() {
		return this.sou;
	}
	
	public ArrayList<Noticia> getLlistaNoticies(){
		return this.llistaNoticies;
	}
	public void setNomRed(String nomRed) {
		this.nomRed = nomRed;
	}

	public void setLlistaNoticies(Noticia llistaNoticies) {
		this.llistaNoticies.add(llistaNoticies);
	}
	
	public void setIncrement(int increment) {
		
		Redactor.sou = Redactor.sou + (Redactor.sou * increment);
	}
	
	public String toString() {
		
		return "El/La redactor/a " + this.nomRed + " i D.N.I. " + this.dni +  " té un sou de " + this.sou
				+ " Euros/Mes.";
	}
}
