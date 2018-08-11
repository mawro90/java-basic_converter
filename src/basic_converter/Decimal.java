package basic_converter;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class Decimal {
	private String decimal;
	private String binary;
	private String octal;
	private String hexal;
	
	public Decimal(String number) {
		this.decimal = number;
		this.binary = Integer.toBinaryString(Integer.parseInt(number));
		this.octal = String.format("%o", number);
		this.hexal = String.format("%x", number);
	}
	public void print() {
		System.out.println("Dec: "+decimal);
		System.out.println("Bin: "+binary);
		System.out.println("Oct: "+octal);
		System.out.println("Hex: "+hexal);
	}

}
