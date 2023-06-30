package BasicOops.com;

public class StudentMain {

	public static void main(String[] args) {
//		Student st= new Student();
		
		//aproach 1 to assign data into varible using ref varible
		//by obj
		
		/*
		 st.name="ganesh";
		 st.rollno=101;
		 st.dept= "cse"; */
		 
//		 st.show();
		 
		 // appraoch 2 by method
		 
//		 st.setData("amay", 110, "entc");
//		 st.show();
		 
		 // aproach 3 by using constuctor
		 Student st= new Student("akash",889,"chem");
		 st.show();
		 
		 
		 
		 
	}

}
