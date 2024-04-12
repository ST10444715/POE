import java.util.Scanner;

public class Login {
	
	//Creating a global scanner for my login class, cause if i open a scanner in every method/function java has a meltdown, im also not sure where to close a scanner, will youtube it out later
	public static Scanner s = new Scanner(System.in);
	
	//Creating a boolean to use for my checkUserName method/function, set it to false, cause it means its incorrect, will make it TRUE when username is correct, or TRUE that all the conditions are met
	static boolean userNameCheck = false;
	
	//Creating a boolean to use for the LoginUser function 
	static boolean userLoginDetails = false;
	
	
	//Creating the variables for the user to enter
	static String user_name;
	static String pass_word;
	static String first_name;
	static String last_name;
	
	//Function that calls all the "set functions" to register the user name, password, first name and last name of the user  
	static String registerUser() {
		
		user_name = setUserName();
		pass_word = setPassword();
		first_name = setFirstName();
		last_name = setLastName();
		displayUserDetails();

		return first_name + pass_word + first_name + last_name;
	}	
	
	//Setting a user desired user name
	public static String setUserName() {
		System.out.println("Please enter a username you would like to use. It must be no more than 5 characters long, and must contain a underscore.");
		user_name = s.nextLine();
		
//		userCheckNameFunction();
		
		System.out.println("The username you have entered is :" + user_name);
		//System.out.println("Username successfully  captured.");
		return user_name;
	}
	
	
	//Setting a user desired password
	public static String setPassword() {
		System.out.println("Please enter your desired password");
		pass_word = s.nextLine();
		
		while(pass_word.length() < 8 /*&& Login.pass_word.contains("a capital letter") && contains a number and a special character      */) {
			System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
			System.out.println("PLease reenter your password.");
			pass_word = s.nextLine();
		}
		
		System.out.println("Password successfully captured.");
		return pass_word;
	}
	
	//Setting the users first name
	public static String setFirstName() {
		System.out.println("Please enter your first name.");
		first_name = s.nextLine();
		System.out.println("The first name your have entered is : " + Login.first_name);
		System.out.println("First name captured successfully.");
		return Login.first_name;
	}
	

	
	//Setting the users last name
	public static String setLastName() {
		System.out.println("Please enter your last name.");
		last_name = s.nextLine();
		System.out.println("The last name you have entered is :" + Login.last_name);
		System.out.println("Last name captured successfully");
		
		
		return last_name;
	}
	
	//Display user details when a successful account creation has occurred
	public static void displayUserDetails() {
		System.out.println();
		System.out.println("You have successfully created a account, your details are displayed below.");
		System.out.println();
		System.out.println("Username :" + user_name);
		System.out.println("First name :" + first_name);
		System.out.println("Last name :" + last_name);
		System.out.println();
	}

	
//	static boolean userCheckNameFunction() {
//		
//		while(userNameCheck) {
//			if (user_name.length() < 5 && user_name.contains("_")) {
//				System.out.println("username captured successfully in checkname function");
//			}else{
//				System.out.println("Username is not corecctly formatted please ensure that your username contains an underscore and is no more than 5 characters in length.");
//				System.out.println("Please retype your username to meet with the username requirements");
//				user_name = s.nextLine();
//			}
//			
//		}
//		userNameCheck = true;
//		return userNameCheck;
//	}
	
	//Login in function for a user after they have registered an account
	static boolean loginUser() {
		
		//Creating local variables as to avoid to many global variables
		String loginUserName;
		String loginPassword;
		
		//Prompting the login name
		System.out.println("Please enter your username.");
		loginUserName = s.nextLine();
		
		//Prompting the login password
		System.out.println("please eneter your password.");
		loginPassword = s.nextLine();
		System.out.println("end");
		
		return userLoginDetails;
	}
	
	
	
}


