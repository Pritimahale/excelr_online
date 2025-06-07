package modifier_2;

import modifier_1.Task_1;//fully qualified name of a class

public class Task3 {
	
	public void m1(){
			Task_1 task1=new Task_1();
			System.out.println(task1.publicModifier);
//			System.out.println(task1.protectedModifier);
//			System.out.println(task1.defaultModifier);
//		 System.out.println(task1.privateModifier);cant access outside class
		}

	}


