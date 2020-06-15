//Write a program to check if the program has received command line arguments or not.
public class Test3 {
	public static void main(String[] args){
		int s = args.length;
		int i = 0;
		if(s>0){
			for(i = 0; i < s; i++){
				if(i <= s-2) System.out.print(args[i]+",");
				else System.out.print(args[i]);
			}
		}
		else System.out.println("No values"); 
	}
}
