public class Display {
	public double gSalary;
	public String empName;
	public Display() {}
	public Display(double gS,String eN) {
		this.gSalary = gS;
		this.empName = eN;
	}
	public String toString() {
		String s = "Name employee is: "+this.empName+" Salary is: "+this.gSalary;
		return s;
	}
}