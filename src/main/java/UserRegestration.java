import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegestration {
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
	public static void main(String[] args) {
		System.out.println("Welcome to regex");
		UserRegestration userRegestration = new UserRegestration();
		userRegestration.firstName();
		userRegestration.lastName();
	}
}
