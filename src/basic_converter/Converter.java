package basic_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("1. Decimal");
		System.out.println("2. Binary");
		System.out.println("3. Octal");
		System.out.println("4. Hexal");
		System.out.print("Choose the system number:");
		Scanner choice = new Scanner(System.in);
		int switcher=choice.nextInt();
		
		System.out.print("Give a number:");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		
		switch(switcher) {
			case 1:
				Decimal dec = new Decimal(number);
				dec.print();
			case 2:
				Binary bin = new Binary(number);
				bin.print();
			case 3:
				Octal oct = new Octal(number);
				oct.print();
			case 4:
				Hexal hex = new Hexal(number);
				hex.print();
			
		}
		System.exit(0);
	}
}