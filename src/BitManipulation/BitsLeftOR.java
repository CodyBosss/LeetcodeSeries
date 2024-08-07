package BitManipulation;

public class BitsLeftOR {
	public static void main(String [] args) {
		int n = 7;
		int pos = 3;
		int bitMask = 1<<pos;
		
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	}
}
