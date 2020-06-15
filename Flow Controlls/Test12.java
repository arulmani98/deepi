//check if a given number is prime or not.
public class Test12{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int flag = 1;
		for(int i = 2;i <= num;i++){
			if(num%i == 0){
				flag++;
			}
		}
		if(flag == 2) System.out.println(args[0]+" is a prime number");
		else System.out.println(args[0]+" is not a prime number");
	}
}