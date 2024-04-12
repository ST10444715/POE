
import java.util.Scanner;

public class Options {
	
	public static Scanner s = new Scanner(System.in);
	enum Items{
		Register,
		Login,
		EndProgam
	}
	
	static void showOptionsList() {
		System.out.println("Please select an option");
		
		for (int i = 0; i < Options.Items.values().length; i++) {
			System.out.println(i + ") " + Options.Items.values()[i]);

		}
	}
	
	static boolean endProgram() {
		//This will end the program 
		return true;
	}
	static void prompUser() {
		
		Options.showOptionsList();
		System.out.println("Please input your choice beneath.");
		int choice = s.nextInt();
		
		
		switch(choice) {
			case 0:
			{
				Login.registerUser();
				break;
			}
			case 1:
			{
				Login.loginUser();
				break;
			}
			case 2:
			{				
				Main.flag = false;
				s.close();	
				break;
			}
		}
	}
}
