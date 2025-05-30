package string_program;

import java.util.Arrays;

public class Program_2 {
	public static void main(String[] args) {
		String s="hello java";
		System.out.println(s.substring(6));//java
		System.out.println(s.substring(6,10));//java
		//   to check value is presnt or not
		System.out.println(s.indexOf('a'));//7
		System.out.println(s.lastIndexOf('a'));//9
		System.out.println(s.contains("j"));//true
		System.out.println(s.startsWith("hi"));//false
		System.out.println(s.endsWith("va"));//true
		
		System.out.println(s.toUpperCase());//HELLO JAVA
		String s2="HELLO JAVA";
		System.out.println(s.toLowerCase());//hello java
		
		//removes whites pace
		System.out.println(s2.length());//12
		String res=s2.trim();
		System.out.println(res);
		System.out.println(res.length());//10
		
		
		String s3="this is java program";
		String[] arr = s2.split(" ");
		System.out.println(Arrays.toString(arr));//[this is,java,program]
		
		
		String s4="this is java program";
		String s5="this is java program";
		System.out.println(s4.equalsIgnoreCase(s5));//true
		System.out.println(s4.equals(s5));//false
		// matches compare based on regex
		System.out.println(s4.matches("Java"));
		
		//based on unicode/ASCII values
		System.out.println("Dog".compareTo("Dog")); // 0 both are same
	    System.out.println("Cat".compareTo("Dog"));//-1
		System.out.println("Dog".compareTo("Cat"));//1
				
		


		
		
	}
	
}