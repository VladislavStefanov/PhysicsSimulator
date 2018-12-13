package physSim;

public class TreeFunction { //TODO needs parser
	private TreeFunction branch1 = null;
	private TreeFunction branch2 = null;
	private String data = null;
	private double value = 0.0;
	
	public TreeFunction(TreeFunction branch1, TreeFunction branch2, String data, double value)
	{
		this.branch1 = branch1;
		this.branch2 = branch2;
		this.data = data;
		this.value = value;
	}
	
	public TreeFunction() 
	{
		//empty
	}
	
	public double operate (double x) {
		double ans = 0;
		switch (data) {
			case "x" : ans = x; break;
			case "number" : ans = this.value; break;
			case "+" : ans = this.branch1.operate(x) + this.branch2.operate(x); break;
			case "-" : ans = this.branch1.operate(x) - this.branch2.operate(x); break;
			case "*" : ans = this.branch1.operate(x) * this.branch2.operate(x); break;
			case "/" : ans = this.branch1.operate(x) / this.branch2.operate(x); break;
			case "^" : ans = Math.pow(this.branch1.operate(x),this.branch2.operate(x)); break;
			case "sqrt" : ans = Math.sqrt(this.branch1.operate(x)); break;
			case "sin" : ans = Math.sin(this.branch1.operate(x)); break;
			case "cos" : ans = Math.cos(this.branch1.operate(x)); break;
			case "tan" : ans = Math.tan(this.branch1.operate(x)); break;
			case "ln" : ans = Math.log(this.branch1.operate(x)); break;
			case "log" : ans = Math.log(this.branch1.operate(x))/Math.log(this.branch2.operate(x)); break;
		}
		return ans;
	}
	
	public TreeFunction getBranch1() {
		return branch1;
	}

	public void setBranch1(TreeFunction branch1) {
		this.branch1 = branch1;
	}

	public TreeFunction getBranch2() {
		return branch2;
	}

	public void setBranch2(TreeFunction branch2) {
		this.branch2 = branch2;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
