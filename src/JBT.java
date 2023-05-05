class JBT {
	int variable = 5; //instance variable
	public static void main(String args[]) {
		JBT obj = new JBT();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		this.variable = variable; //it will choose latest value
		System.out.println("Value of variable :" + variable);
                System.out.println("Value of variable :" + this.variable);
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
                System.out.println("Value of variable :" + this.variable);
	}
}// end of class
