//* in Floyds format
public class Test15{
	public static void main(String[] args) {
	int n1 = Integer.parseInt(args[0]);
	int s = args.length;
	if(s == 1){
		for(int i = 1; i <= n1; i++){
			for (int j = 1;j <= i ;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	else System.out.println("Please enter an integer number");
	}
}