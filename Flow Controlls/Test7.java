//Initialize a character variable with an alphabhet in a program.
public class Test7{
	public static void main(String[] args) {
		char s = args[0].charAt(0);
		int as = (int)s;
		if(s >= 'A' && s <= 'Z'){
			char s1 = (char)(as+32);
			System.out.println(s+"->"+s1);
		}
		else{
			char s2 = (char)(as-32);
			System.out.println(s+"->"+s2);
		}
	}
}