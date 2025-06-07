package abstraction_program;

public class Main {
	public static void main(String[] args) {
		//Employee employee=new Employee("BOB","bob@gmail.com",123345778,154);
		
	Developer developer=new Developer("BOb","bob@gmail.com",1223344566,154,"java");
	developer.work();
	//upcasting/implicit casting/widening casting
	Employee employee=new Developer("Priti","priti@gmai.com",12334,34,"python");
	employee.work();
	
	//downcasting/explicit casting/narrowing casting
	Developer developer2=(Developer)employee;
		
	}
}
abstract class Employee{
	String name;
	String email;
	long phone;
	int id;
	public Employee(String name,String email,long phone,int id) {
		this.email=email;
		this.name=name;
		this.phone=phone;
		this.id=id;
		System.out.println("employee class const");
		}
	public abstract void work();
}
class Developer extends Employee{
	String language;
	public Developer(String name,String email,long phone,int id,String language) {
		super(name,email,phone,id);
		this.language = language;
		System.out.println("const in developer class");
	}
	@Override
	public void work() {
		System.out.println(name+" developer working on "+language);
	}
}
