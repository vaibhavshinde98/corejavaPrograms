package BasicOops.com;

public class EmpMain {

	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.eid=101;
		emp1.ename="vaibhav";
		emp1.job="sde";
		emp1.esal=32000;

		emp1.display();
		System.out.println();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="ganesh";
		emp2.esal=10000;
		
		
		emp2.display();
	}

}
