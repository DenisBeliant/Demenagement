package demenagementPack;

import java.util.Scanner;

public class TestDem {
	 public static void main(String[] args) {
		 // D�finition du scanner :
		 Scanner sc = new Scanner(System.in);
		 System.out.printf("Entrez le nom de l'entreprise : ");
		 String entreprise = sc.nextLine();
		 System.out.printf("Entrez la capacit� de votre camion : ");
		 int capCamion = sc.nextInt();
		 System.out.printf("Nombre de cartons � transpoter : ");
		 int totalCartons = sc.nextInt();
		 System.out.printf("Prix � payer par voyage : ");
		 int prixChoisi = sc.nextInt();
		 System.out.println();
		 
		 System.out.println("Bienvenus " + entreprise);
		Demenagement dem = new Demenagement(entreprise,capCamion, prixChoisi); // on cr�e une "instance"
		dem.auTravail(totalCartons); // on appelle la m�thode d�instance "auTravail()
		}
}
