/*
 * Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
 */
package deepika;
import java.util.Scanner;
public class TestS8 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int index = s1.indexOf("*");
		for(int i = 0; i < s1.length(); i++){
			if((i == (index-1))||(i == (index+1))||(i == (index))) continue;
			else System.out.print(s1.charAt(i));
		}
	}
}
