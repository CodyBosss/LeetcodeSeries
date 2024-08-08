package SandyBoss;

public class FindPowerOfGivenNumber {
	public static void main(String [] args) {
		int base = 2;
		int exponent = 2;
		System.out.println(checkPower(base, exponent));
	}
	static int checkPower(int base, int exponent) {
		int result = 1;
		for(int i=0; i<exponent; i++) {
			result*=base;
		}
		return result;
	}
}
