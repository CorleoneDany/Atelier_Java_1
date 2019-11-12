package Java_Atelier_1;

public class Casts {
	// Cet objet affichera les charactères ascii des chifres 33 a 126
	// This object is gonna show all ascii characters from 33 to 126
	void int_to_ASCII() {
		int yourInt = 33;
		while (yourInt < 127) {
			char ascii_char = (char) yourInt;
			System.out.println("The ASCII representation of " + yourInt + " is : " + ascii_char);
			yourInt++;
		}
	}
}