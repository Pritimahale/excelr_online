package array_programs;

public class Array_Program2 {
	public static void main(String[] args) {
		
		int []arr=new int[6];
		
		System.out.println(arr.length);//6 - to find size
		//printing values using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[1]);//0 0 0 0 0

		}
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
//		arr[6]=70;RTE(run time exception)
//		arr[7]=80;AIOBE(array index out of bound exception)
		System.out.println("\n after assigning");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");//0 0 0 0 0
		}
		System.out.println("\n using for each loop");
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
