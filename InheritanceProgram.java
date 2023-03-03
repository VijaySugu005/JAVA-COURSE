package polymorphism;

class Staff{
	
	String staffName;
	String staffID;
	
	Staff(String staffName,String staffID){
		
		this.staffName=staffName;
		this.staffID=staffID;
	}
	
	public String getStaffName() {
		return staffName;
	}
	public void SetStaffName(String staffName) {
		this.staffName=staffName;
	}
	public String getStaffID() {
		return staffID;
	}
	public void SetStaffID(String staffID) {
		this.staffID=staffID;
	}
	
	public void display() {
		
		System.out.println("STAFF NAME :"+staffName);
		System.out.println("STAFF ID :"+staffID);
	}
}
class HM extends Staff{
	
	private String designation;
	
	HM(String staffName,String staffID,String designation){
		
		super(staffName,staffID);
		this.designation=designation;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void SetDesignation(String designation) {
		this.designation=designation;
	}
	
}
class Testers{
	
	public static void main(String[] args) {
		
		HM staff1=new HM("Vijay","STAFF 205","ENGLISH MISS");
		
		staff1.display();
		
		System.out.println("STAFF DESIGNATION :"+staff1.getDesignation());
	}
}
