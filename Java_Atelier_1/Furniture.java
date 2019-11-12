package Java_Atelier_1;

public class Furniture {
	// Cet objet sert a calculer la taille d'un meuble en m3 via 3 paramètres
	// This object is showing the size of furniture via a calculation with 3 parameters
	void Calculate(Integer longueur, Integer largeur, Integer hauteur){
		if(longueur == null || largeur == null || hauteur ==null) {
			System.out.println("Il manque un ou plusieurs paramètres");
		}
		else {
			System.out.println("Votre meuble fait :" + longueur * largeur * hauteur + "M3");
		}
	}
}
