public class Process {
	public double salary,product;
	public Process() {}
	public Process(Input input){
		this.salary = input.getSalary();
		this.product = input.getProduct();
	}
	public double calculate(){
		if(this.product>0&&this.product<=50000)
			return this.salary+(this.product*0.05);
		else if(this.salary<15000&&this.product>100000)
			return this.salary+(this.product*0.1)+5000;
		else 
			return this.salary+(this.product*0.1);
	}

}