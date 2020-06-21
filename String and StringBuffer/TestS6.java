/*
 * Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
 */
package deepika;
import java.util.Scanner;
public class TestS6{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 =s.nextLine();
		if(s1.length() != s2.length()){
			String ans = s2.concat(s1);
			ans = s1.concat(ans);
			System.out.println("\""+ans+"\"");
		}
	}
}