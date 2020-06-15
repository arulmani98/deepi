//Write a program to receive a color code from the user (an Alphabhet). 

public class Test8{
	public static void main(String[] args) {
		char s = args[0].charAt(0);
		switch(s){
			case 'R':System.out.println("R->Red");
					 break;
			case 'B':System.out.println("B->Blue");
					 break;
			case 'G':System.out.println("G->Green");
					 break;
		    case 'O':System.out.println("O->Orange");
					 break;
			case 'Y':System.out.println("Y->Yellow");
					 break;
			case 'W':System.out.println("W->White");
					 break;
		    default :System.out.println("Invalid Code");
					 break;
		}
	}
}