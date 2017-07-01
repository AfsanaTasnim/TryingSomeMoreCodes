package tryingtowork;

public class VariableScope {
	
	private int x = 0;
	private int y = 0;
	
	public void print() {						
		System.out.println("x = " + x);			
		System.out.println("y = " + y);
		int q = 6;
		if(q > 5) {								//block 1 (outer block)
			int n = 9;
			
			if(q == 9) {						//block2 (inner block)
				n = 0;
			}
		}
		
		//n = 0;								//n is out of scope, so I have commented it out.
	}
	

	public static void main(String[] args) {
		
		VariableScope v = new VariableScope();
		v.print();

	}

}
