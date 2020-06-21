/*
 * Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
 
package deepika;
import java.util.Scanner;
public class TestS10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int n = s.nextInt();
		String a = s1.substring(n-1);
		for(int i = 0; i < n; i++)
			System.out.print(a);
	}
}*/



