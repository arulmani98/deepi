/*Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/
class Animal{
	Animal(){
		System.out.println("Animal class constructor");
	}
	void eat(){
		System.out.println("Animal class eat() method");
	}
	void sleep(){
		System.out.println("Animal class sleep() method");
	}
}
class Bird extends Animal{
	Bird(){
		super();
		System.out.println("Bird class constructor");
	}
	void eat(){
		System.out.println("Bird class eat() method");
	}
	void sleep(){
		System.out.println("Bird class sleep() method");
	}
	void fly(){
		System.out.println("Bird class fly() method");
	}
}
public class Inheritance1 {
	public static void main(String[] args){
		Animal s1 = new Animal();
		Bird s2 = new Bird();
		s1.eat();
		s1.sleep();
		s2.eat();
		s2.sleep();
		s2.fly();
	}

}
