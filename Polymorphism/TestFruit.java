//Create  a base class Fruit with name ,taste and size as its attributes. 
//Create a method called eat() which describes the name of the fruit and its taste. 
//Inherit the same in 2 other classes Apple and Orange
//override the eat() method to represent each fruit taste.
import java.util.*;
class Fruit{
	String name;
	String tatse;
	String size;
	/*Fruit(){
		super();
		System.out.println("Fruit constructor");
	}*/
	void eat(){
		System.out.println("The fruit is colorful and ts size is oval");
		System.out.println("The fruit tatse is sweet");
	}
}
class Apple extends Fruit{
	/*Apple(){
		super();
		System.out.println("Apple constructor");
	}*/
	void eat(){
		System.out.println("Apple is red color and its average size is 7 - 8.5 cm");
		System.out.println("Apple tatse is sweet");
	}
}
class Orange extends Apple{
	/*Orange(){
		super();
		System.out.println("Orange constructor");
	}*/
	void eat(){
		System.out.println("Orange fruit is orange color and its average size is 77-84mm");
		System.out.println("Orange tatse is sweet-tart");
	}
}
public class TestFruit {
	public static void main(String[] args){
		Apple s1 = new Apple();
		Orange s2 = new Orange();
		s1.eat();
		s2.eat();
	}
}
