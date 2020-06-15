//find if the given number is palindrome or not
public class Test17{
	public static void main(String[] args) {
		int len = args[0].length();
		int i = 0,count = 0;
		while(i < len){
			if((args[0].charAt(i)) == (args[0].charAt(len-i-1))) count++;
			i++;
		}
		if(count == len) System.out.println(args[0]+"is a palindrome");
		else System.out.println(args[0]+" is not a palindrome");
	}
}