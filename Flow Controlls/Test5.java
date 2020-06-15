//print 'Alphabhet' if the initialized value is an alphabhet 
//print 'Digit' if the initialized value is a number, and 
//print 'Special Character', if the initialized value is anything else.
public class Test5{
	public static void main(String[] args){
	char x = '*';
	if((x >= 'a'&& x <='z') || (x >= 'A' && x <='Z')) System.out.println("Alphabhet");
	else if(x >= '0' && x <= '9') System.out.println("Digit");
	else System.out.println("Special Character");
	}
}