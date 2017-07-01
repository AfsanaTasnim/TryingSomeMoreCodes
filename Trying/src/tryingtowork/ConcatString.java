package tryingtowork;

public class ConcatString {

	public static void main(String[] args) {
		String greetings = "Hello " + "world";
		System.out.println(greetings);
		String name = "Afsana";
		System.out.println("Hello " + name);
		
		int hour = 4;
		System.out.println("We have been waiting here for over " + hour + " hours.");
		
		System.out.println();
		
		System.out.println(5 + 3 + " Abcd");
		System.out.println(5 + 3 * 2 + " Abcd");
		System.out.println("Abcd " + 5 + 3);
		System.out.println("Abcd " + 5 + 3 * 2);
		
		System.out.println();
		
		System.out.println("Abcd " + (5 + 3 * 2));
		System.out.println("Result: " + (7 + 7 + 2 * 10 + 16));

	}

}
