package tryingtowork;

public class DemeritsOfTypeCasting {

	public static void main(String[] args) {
		long y = 12337203775807L;
		System.out.println("Long value: " + y);
		int x = (int) y;
		System.out.println("After narrowing primitive conversion: " + x);

	}

}
