package Java_Atelier_1;

import java.util.Scanner;

public class Bonjour0 {
	// Cet objet nous dit bonjour ou hello en se basant sur notre langague
	// This object tells us bonjour or hello based on our language
	final String FRANCAIS = "BONJOUR";
	final String ANGLAIS = "HELLO";
	
	int lu;
	String message;
	void Language() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("(1) Français / (AUTRE) Anglais > ");
		lu = scanner.nextInt();
		scanner.close();
		
		//message = (lu == 1) ? FRANCAIS : ANGLAIS;
		if(lu==1) {
			System.out.println(FRANCAIS);
		}
		else {
			System.out.println(ANGLAIS);
		}
		
		//System.out.println(message);
	}
}
