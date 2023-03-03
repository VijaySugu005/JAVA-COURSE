package polymorphism;

class Employee{
	
	String employeeName;
	int employeeId;
	String employeeAddress;
	
	Employee (String employeeName,int employeeId,String employeeaddress){
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.employeeAddress=employeeAddress;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress=employeeAddress;
	}
	
	public void display() {
		
		System.out.println("Employee Details");
		System.out.println("Employeee Name :"+employeeName);
		System.out.println("Employee ID :"+employeeId);
		System.out.println("Employee Address :"+employeeAddress);
	}
}

class Manager extends Employee{
	
	private String designation;
	
	Manager (String employeeName,int employeeId,String employeeAddress,String designation){
		
		super (employeeName,employeeId,employeeAddress);
		this.designation=designation;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
}
class InHeriTester{
	
	public static void main(String[] args) {
		Manager employee=new Manager("Vijay", 101,"Gudiyattam", "Lead");
		employee.display();
		System.out.println(employee.getDesignation());
	}
}