
public class uc3AddPart_Time {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public int EMP_RATE_PER_HOUR = 20;

	public void calempwage() {
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_FULL_TIME) {
			emphrs = 8;
			System.out.println("employee is present full time: ");
		} else if (empcheck == IS_PART_TIME) {
			emphrs = 4;
			System.out.println("Employee is part time: ");
		} else {
			System.out.println("Employee is abscent: ");
		}
		empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("empwage=:" + empwage);
	}

	public static void main(String[] args) {
		uc3AddPart_Time a = new uc3AddPart_Time();
		a.calempwage();
	}
}
