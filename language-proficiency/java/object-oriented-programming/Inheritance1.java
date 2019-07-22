//Start of code segment locked by HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}
//End of code segment locked by HackerRank
class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    //Simply add an identical method to fly called sing and edit the pritn accordingly
    void sing(){
        System.out.println("I am singing");
    }
}
//Start of code segment locked by HackerRank
public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();

   }
}
//End of code segment locked by HackerRank
