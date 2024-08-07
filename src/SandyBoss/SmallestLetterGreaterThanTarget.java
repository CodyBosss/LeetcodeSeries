package SandyBoss;

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char letters[] = { 'x', 'x', 'y', 'y' };
		char target = 'w';
		System.out.println(smallestLetterGreaterThanTarget(letters, target));
	}

	public static char smallestLetterGreaterThanTarget(char letters[], char target) {
		int i = 0;
		char res = 0;
		while (i < letters.length) {
			if ((int) letters[i] > (int) target) {
				res = letters[i];
				return res;

			} else if ((int) letters[i] == (int) target || (int) letters[i] < (int) target) {
				i++;
			}
		}
		res = letters[0];
		return res;
	}

}
