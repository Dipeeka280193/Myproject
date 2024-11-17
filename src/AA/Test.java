package AA;

public class Test {
	
	int a = 100;
	
	public static void main(String[] args) {
		
		M1();    
		//M2();// we cant call non static method in static method or block
		Test t = new Test();
		t.M2();
		 
	}
		public static  void  M1()
		{
		   
			System.out.println("M1 method");
			
		}
		
		public void M2()
		{
			M1();
			System.out.println("M2 method");
		}
	
	}

