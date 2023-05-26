package com.demo;

public class Multi {

	public static void main(String[] args) {
      int a=10;
      int b=10;
      System.out.println("Multiplication :"+(a*b));
      
      a=30;
      b=40;
      System.out.println("Multiplication :"+(a*b));
		
	// added from github by sujit
      a=50;
      b=60;
      System.out.println("Multiplication :"+(a*b));
      
      // added from local by ajit
      a=70;
      b=80;
      System.out.println("Multiplication :"+(a*b));
 
   // added from github by sujit ....this is conflict example
      a=50;
      b=60;
      System.out.println("Multiplication :"+(a*b));
      
		
		
	}

}
