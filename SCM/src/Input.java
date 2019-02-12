public class Input {
	public double salary,product;
	public String name;
	public int userID;
	public Input () {}
	public Input (int u,String n,double s,double p) {
		this.userID = u;
		this.salary = s;
		this.product = p;
		this.name = n;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getProduct() {
		return product;
	}
	public void setProduct(double product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		String s = this.name;
		return s;
	}	
}