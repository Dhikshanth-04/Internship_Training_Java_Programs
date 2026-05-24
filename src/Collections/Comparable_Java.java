import java.util.*;

class Employee implements Comparable<Employee>{
	private String eName;
	private String eCompany;
	private double eSalary;
	public Employee(String eName, String eCompany, double eSalary) {
		super();
		this.eName = eName;
		this.eCompany = eCompany;
		this.eSalary = eSalary;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void getECompany(String eCompany) {
		this.eCompany = eCompany;
	}
	public String getECompany() {
		return eCompany;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eCompany=" + eCompany + ", eSalary=" + eSalary + "]";
	}
	
	@Override
	public int compareTo(Employee e2) {
		String eCompany1 = this.eCompany;
		String eCompany2 = e2.eCompany;
		int res = eCompany1.compareTo(eCompany2);
		if(res!=0) {
			return res;
		}
		
		String eName1 = this.eName;                                
		String eName2 = e2.eName;
		res = eName1.compareTo(eName2);
		if(res!=0) {
			return res;
		}
		
		Double eSalary1 = this.eSalary;
		Double eSalary2 = e2.eSalary;
		return eSalary1.compareTo(eSalary2);
	}
}

public class Comparable_Java{
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee details : ");
		while(sc.hasNextLine()) {
			System.out.println("Enter Employee details : ");
			String str = sc.nextLine();
			if(str.isEmpty()) {
				break;
			}
			String[] data = str.split(",");
			Employee e = new Employee(data[0], data[1], Double.parseDouble(data[2]));
			list.add(e);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}