package javaCodeTesting;

public class Test2 {
	
	 static int x = 9;
	static class InnerTest {
		void msg() {
			System.out.println("Value of variable is : " + x);
		}
		
		public static void main(String[] args) {
			
			Test2.InnerTest ob = new Test2.InnerTest();
			ob.msg();
		}
	}
}