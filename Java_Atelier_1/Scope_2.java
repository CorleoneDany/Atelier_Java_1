package Java_Atelier_1;

public class Scope_2 {
	// Cette méthode affiche toutes les valeurs entre val_min et val_demandee séparés d'une virgule ou d'un point si c'est le dernier argument
	// This method prints out values between the two variables, the numbers are gonna be separated by a comma and the list is gonna finish with a dot
	void Count_2(int valeur_min, int valeur_demandee) {
		for (valeur_min = 0; valeur_min <= valeur_demandee; valeur_min++) {
			if(valeur_min < valeur_demandee) {
				System.out.print(valeur_min + ", ");
			}
			else if (valeur_min == valeur_demandee) {
				System.out.print(valeur_min + ".");
			}
		}
		System.out.print("\n");
	}
}
