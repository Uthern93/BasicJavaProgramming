class JBT3 {
	public static void main(String[] args) {
		JBT3 obj = new JBT3();
		obj.methodTwo();
	}
	void methodOne(){
		System.out.println("Inside Method ONE");
		}
	void methodTwo(){
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
	}
}
