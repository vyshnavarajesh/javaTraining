package com.futureskillit.methods;

public class MethodsExample {
	
	String username = "Test UserName";
	String password;
	int mobileNumber;
	
	//Methods
			// No Params
				//No return - click => it will not return any (String, int, boolean)
					void methodOne() {
						System.out.println("From Method One  - Click Operation");
					}
			
				//return - welcome message
					String methodTwo() {
						return("method Two - return => Welcome Message");
					}
					
				/* => Not allowed as it is a duplicate method of methodTwo	
				 * int methodTwo() {
						return(1);
					}
					*/
					int methodTwo(int abc) {
						return(100);
					}
					
					float methodTwo(float xyz) {
						return(200.50f);
					}
			
					
	// With Params	
				// methods with parameters no return type => language selection 
					void methodThree(int a, int b) {
						int c = a+b;
						System.out.println("Method Three o/p => "+c);
					}
					
					void methodThree(int x, int y,int z) {
						int d = x+y+z;
						System.out.println("Method Three o/p => "+d);
					}
			
					
				// methods with parameters with return type => denomination check in an ATM 
					String methodFour(String username, String password) {
							this.username = username;
							this.password = password;
					
						return username;
					}
					
					String methodFour(String username, String password, long mobileno) {
						this.username = username;
						this.password = password;
				
					return username;
				}
					
					
	public static void main(String[] args) {
		
		MethodsExample obj = new MethodsExample();
		
		obj.methodOne();
		
		String str = obj.methodTwo();
		System.out.println("from method 2 : "+ str);
		
		obj.methodThree(5,25);
		
		String uname = obj.methodFour("Test","password");
		System.out.println(uname);
		
		
	}

}
