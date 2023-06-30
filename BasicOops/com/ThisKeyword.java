package BasicOops.com;

public class ThisKeyword {

	int x, y;
	// this is used for differetitate locale varible and class var. when both are same name
	
//	void setdata(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
	
	//by using constructor
	ThisKeyword(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		ThisKeyword tk= new ThisKeyword(10,20);
//		tk.setdata(10, 20);
		tk.display();

	}

}
