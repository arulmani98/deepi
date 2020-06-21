/*
 * Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
 */
package deepika;
import java.util.Scanner;
public class TestS9{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 =s.next();
		if(s1.length() == s2.length()){
			for(int i = 0; i < s1.length(); i++)
				System.out.print(s1.charAt(i)+""+s2.charAt(i));
		}
	}
}