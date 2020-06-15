//Initialize two character variables in a program and display the characters in alphabetical order.
public class Test4{
	public static void main(String[] args) {
		char s = 's';
		char s1 = 'e';
		int n1 = (int)s;
		int n2 = (int)s1;
		if(n1 < n2) System.out.println(s+","+s1);
		else System.out.println(s1+","+s);
	}
}