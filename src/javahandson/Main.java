package javahandson;



abstract class AnimalA {
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

class Pig extends AnimalA{
public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
}


public class Main {
public static void main(String[] args) {
  Pig myPig = new Pig(); // Create a Pig object
  myPig.animalSound();
  myPig.sleep();
}
}
