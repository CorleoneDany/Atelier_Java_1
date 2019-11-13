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


//public class test {
//
//    public static void main(String[] args) throws Exception {
//           if (args.length != 3) {
//                    throw new Exception("Il nous faut au minimum 3 paramètres.");
//            }
//            System.out.println("Il y a assez de paramètres.");
//    }
//
//}