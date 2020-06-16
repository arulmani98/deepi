
public class Box {
	int width;
	int height;
	int depth;
	Box(int width1,int height1,int depth1){
		this.width = width1;
		this.height = height1;
		this.sdepth = depth1;
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
