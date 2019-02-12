public class Process {
	public double salary,product;
	public Process() {}
	public Process(Input input){
		this.salary = input.getSalary();
		this.product = input.getProduct();
	}
	public double calculate(){
		double compensation;
		if(this.product>0&&this.product<=50000)
			compensation = this.product*0.05;
		else 
			compensation = this.product*0.1;
		if(this.product>0&&compensation < 20000)
			compensation = 20000;
		
		return this.salary+compensation;
		
			
	}
}
