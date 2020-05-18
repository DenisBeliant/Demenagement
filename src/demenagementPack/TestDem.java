package demenagementPack;

import java.util.Scanner;

public class TestDem {
	 public static void main(String[] args) {
		 // Définition du scanner :
		 Scanner sc = new Scanner(System.in);
		 System.out.printf("Entrez le nom de l'entreprise : ");
		 String entreprise = sc.nextLine();
		 System.out.printf("Entrez la capacité de votre camion : ");
		 int capCamion = sc.nextInt();
		 System.out.printf("Nombre de cartons à transpoter : ");
		 int totalCartons = sc.nextInt();
		 System.out.printf("Prix à payer par voyage : ");
		 int prixChoisi = sc.nextInt();
		 System.out.println();
		 
		 System.out.println("Bienvenus " + entreprise);
		Demenagement dem = new Demenagement(entreprise,capCamion, prixChoisi); // on crée une "instance"
		dem.auTravail(totalCartons); // on appelle la méthode d’instance "auTravail()
		}
}
