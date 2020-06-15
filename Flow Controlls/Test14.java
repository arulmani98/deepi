//print the sum of all the digits of a given number.
public class Test14{
	public static void main(String[] args) {
		int len = args[0].length();
		int sum = 0,num1 = 0;
		for(int i = 0; i < len; i++){
			num1 = Integer.parseInt(String.valueOf(args[0].charAt(i)));
			sum = sum + num1;
		}
		System.out.println(sum);
	}
}