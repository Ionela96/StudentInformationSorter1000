
public class Student {

	private String firstName;
	private String lastName;
	private double GPA;
	private String period1;
	private String period2;
	private String period3;
	private String grade1;
	private String grade2;
	private String grade3;
	
	public Student (String fn, String ln, double gpa, String p1, String p2, String p3, String g1, String g2, String g3)
	{
		firstName = fn;
		lastName = ln;
		GPA = gpa;
		period1 = p1;
		period2 = p2;
		period3 = p3;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public String getPeriod1() {
		return period1;
	}
	public void setPeriod1(String period1) {
		this.period1 = period1;
	}
	public String getPeriod2() {
		return period2;
	}
	public void setPeriod2(String period2) {
		this.period2 = period2;
	}
	public String getPeriod3() {
		return period3;
	}
	public void setPeriod3(String period3) {
		this.period3 = period3;
	}
	public String getGrade1() {
		return grade1;
	}
	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}
	public String getGrade2() {
		return grade2;
	}
	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}
	public String getGrade3() {
		return grade3;
	}
	public void setGrade3(String grade3) {
		this.grade3 = grade3;
	}
	
}
