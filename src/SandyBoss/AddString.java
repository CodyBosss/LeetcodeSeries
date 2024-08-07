package SandyBoss;

public class AddString {
	public static void main(String [] args) {
		String a = "11";
		String b = "123";
		System.out.println(addString(a, b));
	}
	public static String addString(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int i=a.length()-1;
		int j=b.length()-1;
		while(i>=0 || j>=0 || carry!=0) {
			int n1 = (i>=0)?a.charAt(i)-'0':0;
			int n2 = (j>=0)?b.charAt(j)-'0':0;
			int sum = n1+n2+carry;
			carry = sum/10;
			sb.append(sum%10);
			i--;
			j--;
		}
		return sb.reverse().toString();
	}
}
