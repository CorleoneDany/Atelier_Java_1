package Java_Atelier_1;

public class Scope {
	// Cette m�thode permet d'afficher une s�rie de chiffres s�par�s d'une virgule
	// This method prints out numbers separated by a comma
	void count() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + ", ");
		}
		System.out.print("\n");
	}
}