
import java.util.Scanner;


public class testing {

	static int[][] temperature = new int[12][2];
	int[][] i;

	
	public static void main(String[] args) {
		
		inputTempForYear();
		System.out.println("Average high temperature of year: " + calculateAverageHigh(temperature));
		System.out.println("Average low temperature of year: " + calculateAverageLow(temperature));
		System.out.println("Highest temperate of year was on: " + monthName(findHighestTemp(temperature)));
		System.out.println("Lowest temperature of year was on: " + monthName(findLowestTemp(temperature)));
		

	}
	public static int[][] inputTempForMonth(int month, int[][] i)
	{
		int month;
		System.out.println("Enter highest temperature for " + monthName(month + 1));
		Scanner keyboard = new Scanner(System.in);
		int hightemp = keyboard.nextInt();
		i[month][0] = hightemp;
		
		System.out.println("Enter the low temperature for " + monthName(month + 1));
		int lowtemp = keyboard.nextInt();
		i[month][1] = lowtemp;
	}
	public static int[][] inputTempForYear()
	{
		System.out.println("Display the high and low temperatures for the year.");
		for(int j=0; j < temperature.length; j++)
		inputTempForMonth(j, temperature);
		
		return temperature;
	}
	
	public static int calculateAverageHigh(int[][] i)
	{
		int total = 0;
		int average = 0;
		for (int j = 0; j < i.length; j++)
			total += i[j][0];
		average = total/i.length;
		return average;
	}
	public static int calculateAverageLow(int[][] i)
	{
		int total = 0;
		int average = 0;
		for (int j=0; j < i.length; j++)
			total += i[j][1];
			average = total/i.length;
			return average;
	}
	public static int findHighestTemp(int[][] i)
	{
		int temp = i[0][0];
		int high = 0;
		for(int j = 1; j < i.length; j++)
		{
			if (i[j][0] < temp)
			{
				temp = i[j][0];
				high = j + 1;
			}
		}
		return high;
	}
	public static int findLowestTemp(int[][] i)
	{
		int temp = i[0][1];
		int low = 0;
		for (int j = 1; j < i.length; j++)
		{
			if (i[j][1] < temp)
			{
				temp = i[j][1];
				low = j + 1;
			}
		}
		return low;
	}
	public static String monthName(int i)
	{
		String monthName1;
		
		switch(i)
		{
		case 1:
			monthName1 = "January";
			break;
		case 2:
			monthName1 = "February";
			break;
		case 3:
			monthName1 = "March";
			break;
		case 4:
			monthName1 = "April";
			break;
		case 5:
			monthName1 = "May";
			break;
		case 6:
			monthName1 = "June";
			break;
		case 7:
			monthName1 = "July";
			break;
		case 8:
			monthName1 = "August";
			break;
		case 9:
			monthName1 = "September";
			break;
		case 10:
			monthName1 = "October";
			break;
		case 11:
			monthName1 = "November";
			break;
		case 12:
			monthName1 = "December";
			break;	
			default:
				monthName1 ="error";
				break;
			
		}
		return monthName1;
	}

}
