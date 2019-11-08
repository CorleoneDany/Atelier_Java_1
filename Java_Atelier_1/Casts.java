package Java_Atelier_1;

public class Casts {
	void int_to_ASCII() {
		int yourInt = 33;
		while (yourInt < 127) {
			char ascii_char = (char) yourInt;
			System.out.println("The ASCII representation of " + yourInt + " is : " + ascii_char);
			yourInt++;
		}
	}
}
