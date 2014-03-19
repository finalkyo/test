package test;

import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
	    String patternStop="停止|停下|停下来"; 
        boolean result = Pattern.matches(patternStop, "停下来"); 
		// TODO Auto-generated method stub
		System.out.print(result);
		System.out.print("test");
		System.out.print("test1");
		System.out.print("test2");
	}

}
