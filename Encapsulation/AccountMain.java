package Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account acm= new Account();
		acm.setAcno(901);
		acm.setCity("pune");
		acm.setName("vaibhav");
		
		System.out.println(acm.getAcno());
		System.out.println(acm.getCity());
		System.out.println(acm.getName());

	}

}
