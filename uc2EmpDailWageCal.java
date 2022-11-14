

public class uc2EmpDailWageCal {
	public static final int IS_FULL_TIME = 1;
	public static int EMP_RATE_PER_HOUR = 20;
	
	
	public void calwage() {
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if(empcheck == 1) {
			emphrs = 8;
			System.out.println("employee is present: ");
		}else {
			System.out.println("Employee is abscent: ");
		}
		empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println(""+empwage);
	}
	public static void main(String[] args) {
		uc2EmpDailWageCal income = new uc2EmpDailWageCal();
		income.calwage();
	}
}
