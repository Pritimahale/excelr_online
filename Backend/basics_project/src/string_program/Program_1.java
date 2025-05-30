package string_program;
import java.lang.String;
import java.util.Arrays;
public class Program_1 {
	public static void main(String[] args) {
		String a="Priti Mahale";
		String b=new String ("Priti Mahale");
		
		System.out.println(b);//Priti Mahale
		System.out.println(a);//Priti Mahale
        
		String s1="Priti";
		String s2="Priti";
		System.out.println(s1==s2);//true
		
		String s3=new String ("Priti");
		String s4=new String ("Priti");
		System.out.println(s3==s4);//false
		
		String s5="this is a string program";
		char []arr=s5.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		String s6="Mahale";
		System.out.println("size of "+s6+" is " +s6.length());
		
		String s7="this is a string program";
		System.out.println(s7.substring(10,16));
		System.out.println(s7.charAt(0));//t
		//System.out.println(s7.charAt(89));//SIBE(String Index out of bound Exception)
		                                  //RTE(run time exception)
		
		System.out.println(s7.indexOf('z'));
		
		
	
}
}