package finals;
import java.util.Scanner;
public class Test {
public static void main(String args[]) {

		char ch,input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Person Manager");
		do {
			
			System.out.println("Create Customer/Employee(c/e):");
			ch = sc.next().charAt(0);

			switch (ch) {
			case 'c':
				System.out.println("Enter your firstname");
				String fname = sc.next();
				System.out.println("Enter your Last name");
				String lname = sc.next();
				System.out.println("Enter your customer number");
				String cnum = sc.next();
				Customer cust = new Customer(fname, lname, cnum);
				System.out.println(cust.toString());
				break;
			case 'e':
				System.out.println("Enter your firstname:");
				fname = sc.next();
				System.out.println("Enter your lastname:");
				lname=sc.next();
				System.out.println("Enter your SSn:");	
				String ssn = sc.next();
				Employee em = new  Employee(fname,lname,ssn);
				System.out.println(em.toString());
				break;
			default:
				System.out.println("Entry should be c or e. Retry");
				continue;
			}
			
			System.out.println("TO Continue. Pyess yes else no(y/n)?");
			do {
			input=sc.next().charAt(0);
			if(input!='y' && input!='n') {
				System.out.println("Entry should be y or n. Retry");
			}
			}while(input!='y' && input!='n');
			if(input=='y') {
				continue;
			}
			else {
				break;
			}
		} while (true);
		System.out.println("BYE");
	}

}

