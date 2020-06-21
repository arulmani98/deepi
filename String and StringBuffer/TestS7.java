/*
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
 */
package deepika;

import java.util.Scanner;

public class TestS7 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		if((s1.endsWith("x")) || (s1.startsWith("x")))
			System.out.print("\""+s1.replace("x","")+"\"");
		else System.out.print("\""+ s1 +"\"");	
	}
}
