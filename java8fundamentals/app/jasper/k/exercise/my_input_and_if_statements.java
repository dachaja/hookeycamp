package jasper.k.exercise;

import java.util.Scanner;

public class my_input_and_if_statements {
	public static void main (String args[])
	{
	    Scanner jonks = new Scanner(System.in);
	    String name, gender, answer;
	    System.out.println("What is your name?");
	    name = jonks.next();
	    System.out.print("Hello ");
	    System.out.print( name);
	    System.out.println(" are you male or female?");
	    gender = jonks.next();

	        if (("male".equals(gender)) && ("brendan".equals(name)))            
	            {
	            System.out.println("blah blah");
	            }

	        else
	            {
	            System.out.println(" Welcome to one of my first java applications. I hope you like it");
	            }

	        if (("female".equals(gender)) && ("nicole".equals(name))) 
	            {
	            System.out.println("blah blah 2");
	            }
	        else
	            {
	            System.out.println(" Welcome to one of my first java applications. I hope you like it");
	            }
	        
	        //Anna
	        if (("male".equals(gender)) && ("brendan".equals(name))) {
	        	System.out.println("blah blah");
	    	} else if (("female".equals(gender)) && ("nicole".equals(name))) {
	    		System.out.println("blah blah 2");
	    	} else {
	    		System.out.println(" Welcome to one of my first java applications. I hope you like it");
	    	}
		}
	}