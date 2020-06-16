
public class Box {
	int width;
	int height;
	int depth;
	Box(int width1,int height1,int depth1){
		width = width1;
		height = height1;
		depth = depth1;
	}
	int display(){
		return width * height * depth;
	}
	public static void main(String[] args){
		Box s = new Box(4,4,4);
		int volume;
		volume = s.display();
		System.out.println(volume);
	}
}