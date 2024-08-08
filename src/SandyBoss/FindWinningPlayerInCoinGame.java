package SandyBoss;

public class FindWinningPlayerInCoinGame {
	public static void main(String [] args) {
		int x=4,y=11;
		System.out.println(losingPlayer(x, y));
	}
	public static String losingPlayer(int x, int y) {
		int count = 0;
		while(x>0 && y>3) {
			x-=1;
			y-=4;
			count++;
		}
		return (count%2==1) ? "Alice":"Bob";
	}
}
