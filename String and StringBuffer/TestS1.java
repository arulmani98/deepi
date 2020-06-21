//check given string is palindrome or not
package deepika;
import java.util.*;
public class TestS1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		StringBuffer s1 = new StringBuffer(input1);
		StringBuffer rev = s1.reverse();
		if(input1.equals(rev.toString())){
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
	}
}
