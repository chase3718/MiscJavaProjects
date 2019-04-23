/** Make sure to import java.util.scanner. Must have a Scanner called sc.**/

boolean run = true;
boolean cont = true;
String choice;

while (run) {
	/*CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code 
	 *code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE 
	 *CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code 
	 *code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE 
	 *CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code 
	 *code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE 
	 *CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code 
	 *code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE code CODE
	 */
	
	System.out.print("Continue? (y/n) ");
	choice = sc.next();
	System.out.println();

	cont = true;

	while (cont) {
		if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
			run = false;
			sc.close();
			System.out.println("OK, Goodbye.");
			cont = false;
		} else if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
			cont = false;
		} else {
			System.out.print("Must be in the form of y/n or yes/no.\n\nContinue? (y/n) ");
			choice = sc.next();
			System.out.println();
		}
	}
}