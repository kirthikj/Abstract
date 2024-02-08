package Partial;

public class college extends school {
	
	public void boy(int name) {
		System.out.println("boy name:"+name);
	}

	//@Override
	public void name(long rollno) {
		System.out.println("girlname:"+rollno);
	}
	
	public static void main(String[]args) {
		college a= new college();
		a.boy(125);
		a.name(123456);
		a.name("kirthik");
		
		
		
	}
	

}
