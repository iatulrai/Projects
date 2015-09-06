// current date and time of you machine
package javaCodeTesting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleTimeClient implements TimeClient {

	private LocalDateTime dateAndTime;

	public SimpleTimeClient() {

		dateAndTime = LocalDateTime.now();
	}

	public void setTime(int hour, int minute, int second) {

		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);

	}

	@Override
	public void setDate(int day, int month, int year) {
		// TODO Auto-generated method stub
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime currentTime = LocalTime.from(dateAndTime);
		dateAndTime = LocalDateTime.of(dateToSet, currentTime);

	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour,
			int minute, int second) {
		// TODO Auto-generated method stub

		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);

	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return dateAndTime;
	}

	public String toString() {
		return dateAndTime.toString();
	}

	public static void main(String[] args) {
		TimeClient myTimeClient = new SimpleTimeClient();
		System.out.println(myTimeClient.toString());
	}

}
