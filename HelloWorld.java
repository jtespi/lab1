/**
CS 371 M01 Software Development
File: HelloWorld.java
Purpose: prints a basic message to the user,
  tests that git is set up correctly.
Lab 01 - initial Git
Written by: Jacob Espinoza 
Date: 2018 January 26
**/

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*;

public class HelloWorld {

	public static void main (String args[]){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date timeDate = new Date();
		System.out.println("Hello world!");
		System.out.println("--- this is a test message.");
		System.out.println("The program ran successfully!");
		System.out.printf("  date & time is %s\n", dateFormat.format( timeDate ));
	}
}
