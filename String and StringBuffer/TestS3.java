//Given a string, return a new string made of 'n' copies of the first 2 chars of the original string
// where 'n' is the length of the string.
package deepika;
import java.util.*;
public class TestS3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int len = s1.length();
		String ans = s1.substring(0, 2);
		for(int i = 0 ; i < len; i++){
			String val = ans;
			System.out.print(val);
		}
	}
}

