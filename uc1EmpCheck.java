
public class uc1EmpCheck {
	public static final int IS_FULL_TIME = 1;
	
	public static void empAtt() {
		double empcheck = Math.floor(Math.random() *10) % 2;
		if(empcheck == 1) {
			System.out.println("employee is present:");
		}else {
			System.out.println("Employee is abscent: ");
		}
	}
	public static void main(String[] args) {
		empAtt();
	}
}
