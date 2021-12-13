package com.hexa;

public class Test {
	 public void Test(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void Test(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }

	
	   public static void main(String args[])
	   {
		   Test obj = new Test();
	      obj.Test('s', 33);
	      obj.Test(33, 'c');
	      
	   }

	
}
