package Garden;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Altibus p = new Altibus();
		Declinus d = new Declinus();

		Jardi jardi = new Jardi(50);
		
		jardi.plantaLlavor(p, 1);
		jardi.plantaLlavor(d, 30);
		Scanner sc= new Scanner(System.in);
		String s= " ";
		while(s.equals("surt")==false) {
			s=sc.next();
			jardi.temps();
			System.out.println(jardi.toString());
			
		}
	}
	
	
}
