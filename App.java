package dealer;

import java.util.Scanner;

public class App {

	
	
	public static void main(String[] args) {
		
		//String and Scanner to take user input.

		String temp;

		Scanner input = new Scanner(System.in); 

		
		
		
		System.out
				.println("Welcome. Thanks for checking our cars in the showroom. Please, select any of the following models:");

		System.out.println("Camaro, Corvette, SS");

		temp = input.next();

		
		
		//Conditional for each case. Passing to lower case to avoid errors.
		
		if (temp.equalsIgnoreCase("camaro")) {

			Camaro one = new Camaro();

			System.out
					.println("Exelent! Let´s choose now from the following models:");

			System.out.println("V6, SS, ZL1");

			temp = input.next();

			temp.toLowerCase();

			
			
			if (temp.equals("v6")) {

				one.RPO01();

				one.showRPO01();
			}

			else

			if (temp.equals("ss")) {

				one.RPO02();

				one.showRPO02();

			}

			else

			if (temp.equals("zl1")) {

				one.RPO03();

				one.showRPO03();

			}
		}

		
		
		if (temp.equalsIgnoreCase("corvette")) {

			Corvette one = new Corvette();

			System.out
					.println("Exelent! Let´s choose now from the following models:");

			System.out.println("Z51, Z06, ZR1");

			temp = input.next();

			temp.toLowerCase();

			
			
			
			if (temp.equals("z51")) {

				one.RPO04();

				one.showRPO04();
			}

			else

			if (temp.equals("z06")) {

				one.RPO05();

				one.showRPO05();

			}

			else

			if (temp.equals("zr1")) {

				one.RPO06();

				one.showRPO06();

			}
		}

		
		
		
		if (temp.equalsIgnoreCase("ss")) {

			SS one = new SS();

			one.RPO07();

			one.showRPO07();
		}
		
		else {
			
			System.out.println("The model introduced is not in the showroom at present time. Please try later.");
			
			System.exit(0);
		}
		
		
		input.close();

	}

}