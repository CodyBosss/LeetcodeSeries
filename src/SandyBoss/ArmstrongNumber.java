package SandyBoss;

public class ArmstrongNumber {
	public static void main(String [] args) {
		int num = 152;
		int n=3;
		armstrong(num, n);
	}
	public static void armstrong(int num, int n) {
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int rem = temp%10;
			sum+=Math.pow(rem, n);
			temp = temp/10;
		}
		if(sum==num) {
			System.out.println("Is Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
