
public class uc6 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private int EMP_RATE_PER_HOUR;
	private int NUM_OF_WORKING_DAYS;
	private int MAX_HRS_IN_MONTH;

	public void computeWage(int empRatePerHour, int numberOfWorkingDays, int maxHrs) {
		this.EMP_RATE_PER_HOUR = empRatePerHour;
		this.NUM_OF_WORKING_DAYS = numberOfWorkingDays;
		this.MAX_HRS_IN_MONTH = maxHrs;

		int empHrs = 0;
		int empWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int totalEmpWage = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs);
			totalEmpWage += empWage;
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
		uc6 empWageBuilder = new uc6();
		empWageBuilder.computeWage(20, 20, 100);
	}

}
