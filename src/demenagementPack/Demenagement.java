package demenagementPack;

public class Demenagement {
	 private String nom; // attributs
	 private int capCamion;
	 private int prixVoyage;
	 public Demenagement(String nom,int capCamion, int prix) { // constructeur
	this.nom = nom;
	this.capCamion = capCamion;
	this.prixVoyage = prix;
	}
	 public void auTravail(int cartons){
	System.out.println(nom + " possède un camion de capacité : " + capCamion);
	System.out.println("Début du déménagement");
	System.out.println("Nombre de cartons à amener :" + cartons);
	int voyages = 1;
	System.out.printf("Cartons restant : ");
	System.out.printf("		Voyage : ");
	System.out.printf("	Emport :");
	System.out.println("	Capacité Camion :");
	int emport;
	do  {
		System.out.printf(cartons + "					");
		System.out.printf(voyages + "		");
		if(cartons > capCamion) {
			emport = capCamion;
		}
		else {
			emport = cartons;
		}
		System.out.printf(emport + "			");
		System.out.println(capCamion);
		voyages++;
		cartons -= capCamion;
	} while(cartons > 0);
	
	int totalPrix = voyages * prixVoyage;
	System.out.println("Prix à payer : " + totalPrix + " €");
	System.out.println("Fin du déménagement.");
	}

}
