package finals;

public class Employee extends Person{
private String ssn;
private String mdigit;
public Employee() {
	
}
public Employee(String firstName, String lastName, String ssn) {
	super(firstName,lastName);
	this.ssn=ssn;
	
}
public String getSsn() {
	if(ssn.length()>4) {
		mdigit=ssn.substring(ssn.length()-4);
	}
	return mdigit=ssn;
}

public void setSsn(String ssn) {
	this.ssn = ssn;
}
@Override
public String toString() {
	return super.toString() + "\n SSN:XXXX-XXXX-"+this.ssn;
}

} 
