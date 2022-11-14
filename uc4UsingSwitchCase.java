
public class uc4UsingSwitchCase {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public int EMP_RATE_PER_HOUR = 20;

	public void empWageCal() {
		int emphrs = 0;
		int empwage = 0;
		int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empcheck) {
		case IS_FULL_TIME:
			emphrs = 8;
			System.out.println("employee is present full time: ");
			break;

		case IS_PART_TIME:
			emphrs = 4;
			System.out.println("Employee is present part time: ");
			break;
		default:
			emphrs = 0;
			System.out.println("Employee is abscent: ");
		}
		empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("empwage: " + empwage);
	}

	public static void main(String[] args) {
		uc4UsingSwitchCase s = new uc4UsingSwitchCase();
		s.empWageCal();
	}
}
