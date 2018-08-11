package basic_converter;

public class Octal {
	private String decimal;
	private String binary;
	private String octal;
	private String hexal;
	
	public Octal(String octal_number) {
		int d = Integer.parseInt(octal_number, 8);
		this.decimal = Integer.toString(d);
		this.binary = Integer.toBinaryString(Integer.parseInt(decimal));
		this.octal = octal_number;
		this.hexal = String.format("%x", d);
	}
	public void print() {
		System.out.println("Dec: "+decimal);
		System.out.println("Bin: "+binary);
		System.out.println("Oct: "+octal);
		System.out.println("Hex: "+hexal);
	}
}
