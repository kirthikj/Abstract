package fullyabstract;

public class model implements SchoolName,CollegeNames{

	public void collection() {
		System.out.println("kirthik");
	}
	@Override
	public void hero() {
		System.out.println("swathi");
		
	}

	@Override
	public void yamaha() {
		System.out.println("sri");

	}
	
	public static void main(String[]args) {
		model a= new model();
		a.collection();
		a.hero();
		a.yamaha();
		
	}
	
	

}