package com.sz.homework;

import java.util.Scanner;

public class HomeworkOfCalendarAfter1800s {

	public static String readMonth (Scanner sc) {
		String inputM = sc.next();
		return inputM;
	}
	public static int readYear (Scanner sc) {
		int year = sc.nextInt();
		return year;
	}

	public static int countPartialTotalDays (String month, int year) {
		int totalDays = 0;
		int index = 0;
		int counter = 0;
		String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for (int i=0; i<months.length; i++) {
			if (month.equals(months[i])) {
				index = i;
			}
		}
		int [] numberDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (index>=2) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
				totalDays++;
			}
		}
		while (true) {
			if (index == counter) {
				break;
			}
			totalDays +=numberDays[counter];
			counter++;
		}
		return totalDays;
	}
	public static int counterPreviousTotalDays (int years) {
		int totalDayOfYears =0;
		int numberOfLeapYear = 0;
		int numberOfYears = years-1800;
		int year = 1800;
		for (int i=0; i<numberOfYears; i++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
				numberOfLeapYear++;
			}
			year++;
		}
		totalDayOfYears = numberOfLeapYear + 365 * numberOfYears;
		return totalDayOfYears;
	}
	
	public static void calendar (String month,int totalDays) {
		int remainder = (totalDays)%7;
		int counter = 0;
		int index = 0;
		int matrix = 0;
		String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for (int i=0; i<months.length; i++) {
			if (month.equals(months[i])) {
				index = i;
			}
		}
		int [] numberDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if (remainder == 4) {
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i-1)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();
				}
			}
			
		}
		
		if (remainder == 5) {
			counter = 1;
			System.out.format("%3c", ' ');
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();
				}
			}

		}
		if (remainder == 6) {
			counter = 2;
			System.out.format("%7c", ' ');
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i+1)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();

				}
			}

		}
		if (remainder == 0) {
			counter = 3;
			System.out.format("%11c", ' ');
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i+2)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();

				}
			}

		}
		if (remainder == 1) {
			counter = 4;
			System.out.format("%15c", ' ');
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i+3)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();

				}
			}

		}
		if (remainder == 2) {
			counter = 5;
			System.out.format("%19c", ' ');
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i+4)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();

				}
			}

		}
		if (remainder == 3) {
			counter = 6;
			System.out.format("%23c", ' ');
			for (int i=1; i<=numberDays[index]; i++) {
				if ((i+5)%7 ==0) {
					System.out.format("%3d", i);
				}else {
					System.out.format("%4d", i);
				}

				counter++;
				if (counter%7 ==0) {
					System.out.println();

				}
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String month = readMonth(sc);
		int years = readYear(sc);
		int totalDays = countPartialTotalDays(month,years);
		int totalDayOfYears = counterPreviousTotalDays(years);
		String [] dayOfTheWeek = {"Sun ", "Mon " , "Tue " , "Wed " ,"Thr " ,"Fri ", "Sat"};
		for (int i=0; i<dayOfTheWeek.length; i++) {
			System.out.format("%s",dayOfTheWeek[i]);
		}
		System.out.println();
		calendar(month,totalDays+totalDayOfYears);

	}

}
