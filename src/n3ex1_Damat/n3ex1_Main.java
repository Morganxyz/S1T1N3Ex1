package n3ex1_Damat;

import java.util.ArrayList;
import java.util.Scanner;

public class n3ex1_Main {
	
	static Scanner entrada = new Scanner(System.in);
	static ArrayList <Redactor> llistaRedactors = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcio;
		
		do {
			System.out.println("Introdueix l´opció desitjada: \n1. Introduïr redactor\n2. Eliminar"
					+ " redactor\n3. Introduïr notícia al redactor\n4. Eliminar notícia\n5. Mostrar"
					+ " totes les notícies per redactor\n6. Calcular puntuació notícia\n7. Calcular"
					+ " preu notícia\n0. Sortir");
			opcio = entrada.nextInt();
			
			switch(opcio) {
			
			case 1: crearRedactor();
				break;
			case 2: eliminarRedactor();
				break;
			case 3: noticiaRedactor();
				break;
			case 4: eliminarNoticia();
				break;
			case 5: mostrarNotiReda();
				break;
			case 6: puntNoti();
				break;
			case 7: preuNoti();
				break;
			case 0:
				System.out.println("Sortint!");
				System.out.println("");
				break;
			default:
				System.out.println("L´opció introduïda no és correcte!");
				System.out.println("");

		}
			
		}while(opcio !=0);
			
	}
	
	public static void crearRedactor() {
		
		String nomRed;
		String dni;
		int i = 0;
		boolean esc = false;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del redactor/a: ");
		nomRed = entrada.nextLine();
		System.out.println("Introdueix el dni del redactor/a: ");
		dni = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redTrovat = llistaRedactors.get(i);
			if(dni.equalsIgnoreCase(redTrovat.getDni())) {
				esc = true;
			}
		i++;
		}
		if(esc){
			System.out.println("El/La redactor/a ja existeix!");
			System.out.println("");
		
		}else {
			Redactor reda0 = new Redactor(nomRed,dni);
			llistaRedactors.add(reda0);
			System.out.println("Redactor/a creat/da correctament!");
			System.out.println("");
		}
	}
	
	public static void eliminarRedactor() {
		
		String nomRed;
		int posRed = -1;
		int i = 0;
		boolean esc = false;
		String resp;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del redactor a eliminar: ");
		nomRed = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redaTrovat = llistaRedactors.get(i);
			
			if(nomRed.equalsIgnoreCase(redaTrovat.getNomRed())) {
				esc = true;
				posRed = i;
			}
			i++;
		}
		 if(esc) {
			 System.out.println(llistaRedactors.get(posRed).toString());
			 System.out.println("Estás seguro de que quieres eliminar este redactor/a? S/N: ");
			 resp = entrada.nextLine();
			 
			 if(resp.equalsIgnoreCase("s")) {
				 llistaRedactors.remove(posRed);
				 System.out.println("El/La redactor/a ha sido eliminado/a");
			 }else {
				 System.out.println("Eliminación abortada");
			 }
			 
		 }else {
			 System.out.println("El/La redactor/a no se ha encontrado");
		 }
		
	}
	
	public static void noticiaRedactor() {
		
		String nomRed;
		int posRed = -1;
		int i = 0;
		boolean esc = false;
		String resp;
		int opcio;
		String titul;
		String texte;
		String compe;
		String club;
		String jugador;
		String escu;
		String equip;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del/la redactor/a a cercar: ");
		nomRed = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redaTrovat = llistaRedactors.get(i);
			
			if(nomRed.equalsIgnoreCase(redaTrovat.getNomRed())) {
				esc = true;
				posRed = i;
			}
			i++;
		}
		 if(esc) {
			 System.out.println(llistaRedactors.get(posRed).toString());
			 System.out.println("Quieres crear una noticia para este redactor/a: (S/N)");
			 resp = entrada.nextLine();
			 
			 if(resp.equalsIgnoreCase("s")) {
				
				 do {
					 System.out.println("Introdueix el tipus de noticia a generar: \n1. Futbol"
					 		+ "\n2. Basquet\n3. Tenis\n4. F1\n5. MotoGP\n0. Sortir");
					 opcio = entrada.nextInt();
					 
					 switch(opcio) {
					 
						 case 1: 
							 entrada.nextLine();
							System.out.println("Introdueix el títol de la notícia: ");
							titul = entrada.nextLine();
							System.out.println("Introdueix el texte de la notícia: ");
							texte = entrada.nextLine();
							System.out.println("Introdueix el nom de la competició: ");
							compe = entrada.nextLine();
							System.out.println("Introdueix el nom del club : ");
							club = entrada.nextLine();
							System.out.println("Introdueix el nom del jugador: ");
							jugador = entrada.nextLine();
						
							Futbol fut0 = new Futbol(titul,texte,compe,club,jugador);
							llistaRedactors.get(posRed).setLlistaNoticies(fut0);
							System.out.println("Notícia afegida al/la redactor/a");
							System.out.println("");
							
							 break;
						 case 2: 
							 entrada.nextLine();
								System.out.println("Introdueix el títol de la notícia: ");
								titul = entrada.nextLine();
								System.out.println("Introdueix el texte de la notícia: ");
								texte = entrada.nextLine();
								System.out.println("Introdueix el nom de la competició: ");
								compe = entrada.nextLine();
								System.out.println("Introdueix el nom del club : ");
								club = entrada.nextLine();
								
								Basquet bas0= new Basquet(titul,texte,compe,club);
								llistaRedactors.get(posRed).setLlistaNoticies(bas0);
								System.out.println("Notícia afegida al/la redactor/a");
								System.out.println("");
							
							 break;
						 case 3: 
							 entrada.nextLine();
								System.out.println("Introdueix el títol de la notícia: ");
								titul = entrada.nextLine();
								System.out.println("Introdueix el texte de la notícia: ");
								texte = entrada.nextLine();
								System.out.println("Introdueix el nom de la competició: ");
								compe = entrada.nextLine();
								System.out.println("Introdueix el nom del jugador : ");
								jugador = entrada.nextLine();
								
								Tennis ten0= new Tennis(titul,texte,compe,jugador);
								llistaRedactors.get(posRed).setLlistaNoticies(ten0);
								System.out.println("Notícia afegida al/la redactor/a");
								System.out.println("");
							 break;
						 case 4: 
							 entrada.nextLine();
								System.out.println("Introdueix el títol de la notícia: ");
								titul = entrada.nextLine();
								System.out.println("Introdueix el texte de la notícia: ");
								texte = entrada.nextLine();
								System.out.println("Introdueix el nom de l´escuderia: ");
								escu = entrada.nextLine();

								F1 esc0= new F1(titul,texte,escu);
								llistaRedactors.get(posRed).setLlistaNoticies(esc0);
								System.out.println("Notícia afegida al/la redactor/a");
								System.out.println("");
							 break;
						 case 5: 
							 entrada.nextLine();
								System.out.println("Introdueix el títol de la notícia: ");
								titul = entrada.nextLine();
								System.out.println("Introdueix el texte de la notícia: ");
								texte = entrada.nextLine();
								System.out.println("Introdueix el nom del equip: ");
								equip = entrada.nextLine();
							
								MotoGp moto0 = new MotoGp(titul,texte,equip);
								llistaRedactors.get(posRed).setLlistaNoticies(moto0);
								System.out.println("Notícia afegida al/la redactor/a");
								System.out.println("");
							 break;
						 case 0:
								System.out.println("Sortint!");
								System.out.println("");
								break;
							default:
								System.out.println("L´opció introduïda no és correcte!");
								System.out.println("");  	
					 }		 
				 }while(opcio != 0);
				 
				 
			 }else {
				 System.out.println("Creación de noticia abortada");
			 }
			 
		 }else {
			 System.out.println("El/La redactor/a no se ha encontrado");
		 }
	}
	
	public static void eliminarNoticia() {
		
		String nomRed;
		String nomTit;
		int posRed = -1;
		int i = 0;
		boolean esc = false;
		String resp;
		int j = 0;
		boolean esc2 = false;
		int posTit = -1;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del/la redactor/a a cercar: ");
		nomRed = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redaTrovat = llistaRedactors.get(i);
			
			if(nomRed.equalsIgnoreCase(redaTrovat.getNomRed())) {
				esc = true;
				posRed = i;
			}
			i++;
		}
		 if(esc) {
			 
			 System.out.println("Introdueix el titular de la notícia: ");
			 nomTit = entrada.nextLine();
			 while(j < llistaRedactors.get(posRed).getLlistaNoticies().size() && !esc2) {
				 Noticia notTrovada = llistaRedactors.get(posRed).getLlistaNoticies().get(j);
				 if(nomTit.equalsIgnoreCase(notTrovada.getTitular())) {
					 posTit = j;
					 esc2 = true;
				 }
			 j++; 
			 }
			 if(esc2) {
				 System.out.println(llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).toString());
				 System.out.println("Vols eliminar aquesta notícia? S/N:");
				 resp = entrada.nextLine();
				 if(resp.equalsIgnoreCase("s")) {
					 llistaRedactors.get(posRed).getLlistaNoticies().remove(posTit);
					 System.out.println("Notícia eliminada!");
				 }else {
					 System.out.println("Eliminació avortada!");
				 }
			 }else {
				 System.out.println("La notícia no s´ha trovat!");
			 }
		 }else {
			 System.out.println("El/La redactor/a no se ha encontrado");
		 }
	}
	
	public static void mostrarNotiReda() {
		
		String nomRed;
		String dniRed;
		int posRed = -1;
		int i = 0;
		boolean esc = false;
		int j = 1;
	
		entrada.nextLine();
		System.out.println("Introdueix el nom del/la redactor/a a cercar: ");
		nomRed = entrada.nextLine();
		System.out.println("Introdueix el dni del/la redactor/a: ");
		dniRed = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redaTrovat = llistaRedactors.get(i);
			
			if(nomRed.equalsIgnoreCase(redaTrovat.getNomRed()) && dniRed.equalsIgnoreCase(redaTrovat.getDni())) {
				posRed = i;
				esc = true;
			}
			i++;
			}
			if(esc) {
				for(Noticia n : llistaRedactors.get(posRed).getLlistaNoticies()) {
					System.out.println(j + " : " + n.toString());
					System.out.println("");
					j++;
				}
				
			}else {
				System.out.println("El/La redactor/a no s´ha trovat/da");
			}
	}
	
	public static void puntNoti() {
		
		String nomRed;
		String nomTit;
		int posRed = -1;
		int i = 0;
		boolean esc = false;
		int j = 0;
		boolean esc2 = false;
		int posTit = -1;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del/la redactor/a a cercar: ");
		nomRed = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redaTrovat = llistaRedactors.get(i);
			
			if(nomRed.equalsIgnoreCase(redaTrovat.getNomRed())) {
				esc = true;
				posRed = i;
			}
			i++;
		}
		 if(esc) {
			 
			 System.out.println("Introdueix el titular de la notícia: ");
			 nomTit = entrada.nextLine();
			 while(j < llistaRedactors.get(posRed).getLlistaNoticies().size() && !esc2) {
				 Noticia notTrovada = llistaRedactors.get(posRed).getLlistaNoticies().get(j);
				 if(nomTit.equalsIgnoreCase(notTrovada.getTitular())) {
					 posTit = j;
					 esc2 = true;
				 }
			 j++; 
			 }
			 if(esc2) {
				 System.out.println(llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).toString());
				 System.out.println("");
				 llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).calcularPuntuacio();
				 System.out.println("La puntuació total de la notícia es de " 
				 + llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).getPuntuacio() 
				 + " punts.");
			 }else {
				 System.out.println("La noticia no s´ha trovat");
			 }
		 }else {
			 System.out.println("El/La redactor/a no se ha encontrado");
		 }
	}
	
	public static void preuNoti() {
		String nomRed;
		String nomTit;
		int posRed = -1;
		int i = 0;
		boolean esc = false;
		int j = 0;
		boolean esc2 = false;
		int posTit = -1;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del/la redactor/a a cercar: ");
		nomRed = entrada.nextLine();
		
		while(i < llistaRedactors.size() && !esc) {
			Redactor redaTrovat = llistaRedactors.get(i);
			
			if(nomRed.equalsIgnoreCase(redaTrovat.getNomRed())) {
				esc = true;
				posRed = i;
			}
			i++;
		}
		 if(esc) {
			 
			 System.out.println("Introdueix el titular de la notícia: ");
			 nomTit = entrada.nextLine();
			 while(j < llistaRedactors.get(posRed).getLlistaNoticies().size() && !esc2) {
				 Noticia notTrovada = llistaRedactors.get(posRed).getLlistaNoticies().get(j);
				 if(nomTit.equalsIgnoreCase(notTrovada.getTitular())) {
					 posTit = j;
					 esc2 = true;
				 }
			 j++; 
			 }
			 if(esc2) {
				 System.out.println(llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).toString());
				 System.out.println("");
				 llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).calcularPreuNoticia();
				 System.out.println("El preu total de la notícia es de " 
				 + llistaRedactors.get(posRed).getLlistaNoticies().get(posTit).getPreu()
				 + " Euros");
			 }else {
				 System.out.println("La noticia no s´ha trovat");
			 }
		 }else {
			 System.out.println("El/La redactor/a no se ha encontrado");
		 }
	}
}
