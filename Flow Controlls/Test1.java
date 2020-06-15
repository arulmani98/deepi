public class Test1 {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		if(n > 0) System.out.print("Positive");
		else if(n < 0) System.out.print("Negative");
		else System.out.print("Zero");
	}
}
