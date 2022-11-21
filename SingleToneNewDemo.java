package demoJava;



	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class SingleToneNewDemo {

		private static SingleToneNewDemo instance;
	    public static String str;
	    private SingleToneNewDemo() {}

	    static SingleToneNewDemo getSingleInstance() {
	        if (instance == null) {
	            instance = new SingleToneNewDemo();
	        }
	        return instance;
	    }
	}