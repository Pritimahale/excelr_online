package string_program;

public class ReverseString {
	public static void main(String[] args) {
		String s="hello";
		//String output="olleh";
		String output="";
		
		
		for(char c: s.toCharArray()) {
			output=c+output;
		}
		System.out.println(output);
	}

}
