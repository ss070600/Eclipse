package Assignment2;

import java.util.Scanner;

class InvalidMonthException extends Exception {
	public InvalidMonthException() {
		super("Invalid month in constructor parameter");
	}
}

class InvalidYearException extends Exception {
	public InvalidYearException() {
		super("Invalid year in constructor parameter");
	}
}

class InvalidDateException extends Exception {
	public InvalidDateException() {
		super("Invalid date in constructor parameter");
	}
}

class Date {

	private int day, month, year;

	Date(int day, int month, int year) throws InvalidYearException, InvalidMonthException, InvalidDateException {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}

	int getDay() {
		return day;
	}

	void setDay(int day) throws InvalidDateException {
		if (this.getMonth() == 4 || this.getMonth() == 6 || this.getMonth() == 9 || this.getMonth() == 11)
			if (day >= 1 && day <= 30)
				this.day = day;
			else
				throw new InvalidDateException();
		else if (this.getMonth() == 1 || this.getMonth() == 3 || this.getMonth() == 5 || this.getMonth() == 7
				|| this.getMonth() == 8 || this.getMonth() == 10 || this.getMonth() == 12)
			if (day >= 1 && day <= 30)
				this.day = day;
			else
				throw new InvalidDateException();
		else if (this.getMonth() == 2)
			if (isLeap(this.getYear()))
				if (day == 29)
					this.day = day;
				else
					throw new InvalidDateException();
			else if (day == 28)
				this.day = day;
			else
				throw new InvalidDateException();
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) throws InvalidMonthException {
		if (month < 1 || month > 12)
			throw new InvalidMonthException();
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) throws InvalidYearException {
		if (year < 1600 || year > 2022)
			throw new InvalidYearException();
		this.year = year;
	}

	static boolean isLeap(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}

	public void displayDate() {
		System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
	}
}

public class TestDate {

	public static void main(String args[]) throws InvalidYearException, InvalidMonthException, InvalidDateException {

		Date date1 = new Date(12, 11, 2022);
		date1.displayDate();

		// invalid date example
		Date date = new Date(0, 0, 0);
		date.displayDate();

	}

}