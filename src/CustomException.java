import java.util.Scanner;

class OverAgeException extends Exception{
@Override
public String getMessage() {
	return "You are too old";
}
}

class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You are too young";
	}
}

class Applicant{
	Scanner sc = new Scanner(System.in);
	int age;
	public void acceptInput() {
		age = sc.nextInt();
	}
	public void validate() throws OverAgeException, UnderAgeException{
		if(age>18 && age<60) {
			System.out.println("Eligible");
		}
		else if(age<18) {
		throw new UnderAgeException();
		
		}
		else if(age>60) {
			throw new OverAgeException();
			
		}
	}
}

public class CustomException {
	public static void main(String[] args) {
		Applicant ap = new Applicant();
		ap.acceptInput();
		try {
			ap.validate();
		}catch(OverAgeException oae) {
			System.out.println(oae.getMessage());
		}catch(UnderAgeException uae) {
			System.out.println(uae.getMessage());
		}
	}
}
