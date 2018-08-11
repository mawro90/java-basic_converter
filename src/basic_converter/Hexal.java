package basic_converter;

public class Hexal {
	private String decimal;
	private String binary;
	private String octal;
	private String hexal;
	
	public Hexal(String hexal_number) {
		int d = Integer.parseInt(hexal_number, 16);
		this.decimal = Integer.toString(d);
		this.binary = Integer.toBinaryString(Integer.parseInt(decimal));
		this.octal = String.format("%o", d);
		this.hexal = hexal_number;
	}
	public void print() {
		System.out.println("Dec: "+decimal);
		System.out.println("Bin: "+binary);
		System.out.println("Oct: "+octal);
		System.out.println("Hex: "+hexal);
	}
}
