package kapitel0.aufgabe2;

import java.util.*;

/**
 * @class Das folgende Programm liest von der Console die Angestelltennummer,
 *        den Stundenlohn und die wöchentliche Arbeitszeit ein. Anschliessend
 *        wird der Name, wöchentliche Verdienst sowie die Überstunden
 *        ausgegeben.
 */

public class EmployeeSalary {

	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
		long employeeNumber = 0;
		String employeeName;
		double hourlySalary = 0.00;
		double weeklyTime = 0.00;
		double regularTime, overtime;
		double regularPay, overtimePay, netPay;

		System.out.print("Enter Employee Number (00000): ");

		
		while(true){
		try {
			employeeNumber = scnr.nextLong();
			break;
		} catch (InputMismatchException e) {
			System.out.println("Falsche Eingabe!");
			continue;
		}
		}

		//Wie kann man das Scannner Objekt leeren?
		
		if (employeeNumber == 82500)
			employeeName = "Peter Baker";
		else if (employeeNumber == 92746)
			employeeName = "John Kouma";
		else if (employeeNumber == 54080)
			employeeName = "Steg Larson";
		else if (employeeNumber == 86285)
			employeeName = "Gertrude Monay";
		else
			employeeName = "Unknown";

		System.out.print("Enter Hourly Salary: ");

		try {
			hourlySalary = scnr.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Falsche Eingabe!");
		}

		System.out.print("Enter Weekly Time: ");
		weeklyTime = scnr.nextDouble();

		if (weeklyTime < 40) {
			regularTime = weeklyTime;
			overtime = 0;
			regularPay = hourlySalary * regularTime;
			overtimePay = 0;
			netPay = regularPay;
		} else {
			regularTime = 40;
			overtime = weeklyTime - 40;
			regularPay = hourlySalary * 40;
			overtimePay = hourlySalary * overtime;
			netPay = regularPay + overtimePay;
		}

		System.out.println("======================");
		System.out.println("==-=-= Employee Payroll =-=-==");
		System.out.println("-------------------------------------------");
		System.out.printf("Employee #:    %d\n", employeeNumber);
		System.out.printf("Employee Name: %s\n", employeeName);
		System.out.printf("Hourly Salary: %.2f\n", hourlySalary);
		System.out.printf("Weekly Time:   %.2f\n", weeklyTime);
		System.out.printf("Regular Pay:   %.2f\n", regularPay);
		System.out.printf("Overtime Pay:  %.2f\n", overtimePay);
		System.out.printf("Total Pay:     %.2f\n", netPay);
		System.out.println("======================");
	}

}
}
