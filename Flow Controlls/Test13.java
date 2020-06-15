//print prime numbers between 10 and 99.
public class Test13{
	public static void main(String[] args) {
		for(int i = 10; i <= 99; i++){
			int flag = 1;
			for(int j = 2; j <= 99; j++){
				if(i%j == 0){
					flag++;
				}
			}
			if(flag == 2) 
				System.out.println(i);
		}
	}
}
