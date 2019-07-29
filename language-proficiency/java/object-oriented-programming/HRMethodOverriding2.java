//Start of code segment locked by HackerRank
import java.util.*;
import java.io.*;

class BiCycle
{
	String define_me()
    {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle
{
	String define_me()
    {
		return "a cycle with an engine.";
	}

	MotorCycle()
    {
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
//End of code segment locked by HackerRank
		//The solution is to add the "super" keyword to the define_me() call to call the parent method instead
		String temp=super.define_me();
//Start of code segment locked by HackerRank

		System.out.println("My ancestor is a cycle who is "+ temp );
	}

}
class HRMethodOverriding2
{
	public static void main(String []args)
    {
		MotorCycle M=new MotorCycle();
	}
}
//End of code segment locked by HackerRank
