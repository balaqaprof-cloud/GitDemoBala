package javahandson;

public class MethodOverrdiding {
	public static void main(String args[]) {
		Animal a = new Animal();
		a.sound();
		Animal b = new Dog();
		b.sound();
	}

}

class Animal{
	public void sound(){
		System.out.println("animal sound is some sound");
	}
}

class Dog extends Animal{
	public void sound(){
		System.out.println("Dog  sound is bow bow");
	}
}
