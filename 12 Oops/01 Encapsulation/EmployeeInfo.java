

public class EmployeeInfo {

	public static void main(String[] args)
	{
		Employee a = new Employee();
		a.setName("vishal Deshmukh");
		a.setdesignation("Frontend Developer");
		a.setdepartmant("IT / Web Team");
		a.setemail("vishaldeshmukh7972@gamil.com");
		a.setphoneNumber("7972628662");
		a.setjobRole("Java Developer");
		a.setsalary("50,000");
		
	
		
		System.out.println("Empoyee Name :- " + a.getName());
		System.out.println("Designation :- " + a.getdesignation());
		System.out.println("Deparment :- "+a.getdepartmant());
		System.out.println("Email Id :- "+a.getemail());
		System.out.println("Phone Number :- " +a.getphoneNumber());
		System.out.println("Job Role :- " + a.getjobRole());
		System.out.println("Salery :- " + a.getsalary());
		
		
	}
}
