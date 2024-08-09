package SandyBoss;

public class SquareRootOfGivenNumber {
	public static void main(String [] args) {
		int x = 8;
		System.out.println(sqrt(x));
	}
	public static int sqrt(int x) {
//		return (int)Math.sqrt(x);   1st approach
		
		if(x<0) {
			throw new IllegalArgumentException("can not compute square root of negative number");
		}
		if(x==0) {
			return 0;
		}
		double guess = x;
		double tolerance = 1e-6;// Precision of the approximation
		double nextGuess;
		do {
			nextGuess = (guess+x/guess)/2.0;
			if(Math.abs(nextGuess-guess)<tolerance) {
				break;
			}
			guess = nextGuess;
		}
		while(true);
		
		return (int) guess;
	}
}
