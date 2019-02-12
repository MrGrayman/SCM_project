import java.util.Scanner;
public class DemoFindSalary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userID;
		double product,salary,gSalary;
		String name,empName;
		System.out.println("Enter Username, Name employee, Salary and Sum of product : ");
		userID = in.nextInt();
		name = in.next();
		salary = in.nextDouble();
		product = in.nextDouble();
		Input input = new Input(userID,name,salary,product);
		empName = input.getName();
		Process process = new Process(input);
		gSalary = process.calculate();
		Display display = new Display(gSalary,empName);
		System.out.println(display.toString());
	}
}