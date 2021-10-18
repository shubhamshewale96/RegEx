import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegestration {
	/*
	 * first name Validation
	 */
	private void firstName() {
		String firstName;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter FirstName: \t note:First Latter should capital");
		firstName = get.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.find())
			System.out.println("Pattern matched");
		else
			System.out.println("Pattern not matched");
	}

	/*
	 * last name Validation
	 */
	private void lastName() {
		String lastName;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter LastName: \t note:First Latter should capital");
		lastName = get.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.find())
			System.out.println("Pattern matched");
		else
			System.out.println("Pattern not matched");
	}

	/*
	 * Email Validation
	 */
	private void emailValidation() {
		String email;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter Email Id: \t Eg:abc.xyz@bl.co.in");
		email = get.next();
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find())
			System.out.println("Pattern matched");
		else
			System.out.println("Pattern not matched");
	}
	/*
	 * Mobile number Validation
	 */
	private void mobileValidation() {
		String mNumber;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter Mobile Number : \t Eg:91 8542365232");
		mNumber = get.next();
		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mNumber);
		if (matcher.find())
			System.out.println("Pattern matched");
		else
			System.out.println("Pattern not matched");
	}
	/*
	 * Password Validation
	 */
	private void passwordValidation() {
		String pass;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter Password : \t note:min 8char,one capital,one numaric");
		pass = get.next();
		String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		if (matcher.find())
			System.out.println("Pattern matched");
		else
			System.out.println("Pattern not matched");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to regex");
		UserRegestration userRegestration = new UserRegestration();
		userRegestration.firstName();
		userRegestration.lastName();
		userRegestration.emailValidation();
		userRegestration.mobileValidation();
		userRegestration.passwordValidation();
	}
}