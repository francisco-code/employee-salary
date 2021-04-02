package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary *= (1 + percent / 100);
	}
	
	public String toString() {
		return name 
			+ ", $ "
			+ String.format("%.2f", netSalary());
	}

}
