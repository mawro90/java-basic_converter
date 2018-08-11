package basic_converter;

public class Binary {
	private String decimal;
	private String binary;
	private String octal;
	private String hexal;
	
	public Binary(String binary_number) {
		int d = Integer.parseInt(binary_number, 2);
		this.decimal = Integer.toString(d);
		this.binary = binary_number;
		this.octal = String.format("%o", d);
		this.hexal = String.format("%x", d);
	}
	public void print() {
		System.out.println("Dec: "+decimal);
		System.out.println("Bin: "+binary);
		System.out.println("Oct: "+octal);
		System.out.println("Hex: "+hexal);
	}

}
