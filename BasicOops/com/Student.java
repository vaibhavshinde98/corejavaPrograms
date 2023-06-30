package BasicOops.com;

public class Student {

	String name;
	int rollno;
	String dept;
	
	
	void show() {
		System.out.println(name+"  "+rollno+"   "+ dept+"  ");
	}
	
	void setData(String na,int rn,String d) {
		name=na;
		rollno=rn;
		dept=d;
	}
	
	
	//aproach 3rd creating constuctor
		Student(String na,int rn,String d) {
		name=na;
		rollno=rn;
		dept=d;
	}
	
}
