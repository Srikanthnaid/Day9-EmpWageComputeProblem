
public class uc5calwagemonth {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private int EMP_RATE_PER_HOUR;
	private int NUM_OF_WORKING_DAYS;

	public void empwagecal(int empRatePerHour, int numberOfWorkingDays) {
		this.EMP_RATE_PER_HOUR = empRatePerHour;
		this.NUM_OF_WORKING_DAYS = numberOfWorkingDays;
		int emphrs = 0;
		int empwage = 0;
		int totalempwage = 0;
		for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {
			int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empcheck) {
			case IS_FULL_TIME:
				emphrs = 8;
				break;
			case IS_PART_TIME:
				emphrs = 4;
				break;
			default:
				emphrs = 0;
				break;
			}
			empwage = emphrs * EMP_RATE_PER_HOUR;
			System.out.println("Day#" + day + "  empWage: " + empwage);
			totalempwage += empwage;
		}
		System.out.println("total employee wage=: " + totalempwage);
	}

	public static void main(String[] args) {
		uc5calwagemonth m = new uc5calwagemonth();
		m.empwagecal(20, 30);
	}
}
