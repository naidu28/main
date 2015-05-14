package proj;

import java.util.Scanner;
import java.util.GregorianCalendar;
public class WeatherProcessingSystem {
	public static void main(String[] args){
	
		
		System.out.println("Welcome to Weather Data Processing System!");
		System.out.println("You can process weather information using this system.\n");

		System.out.println("Please select a feature you wish to use from the following:");
		System.out.println("	1.Weather Record");
		System.out.println("	2.Averages");
		System.out.println("	3.Maximums");
		System.out.println("	4.Minimums");
		System.out.println("	5.Total Precipitation");
		System.out.println("	6.Extremes");
		System.out.println("	0.Quit");

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("\nSelection:\n");//Choose selection
		int a = 0;
		int userInput;
		userInput = scan.nextInt();
		
		WeatherDataLoad.SetValue();
		while (userInput != 0)
		{
			if (userInput == 1){
				System.out.println("Please enter a date to view (MM/DD/2008, 0 to Quit):\n");//Choose Date
				String date = "";
				date =scan.next();
				int day = 0;
				int month = 0;
	
				String string = date;
				String[] parts = string.split("/");
				String part1 = parts[0]; 
				String part2 = parts[1]; 
				month = Integer.parseInt(part1);
				day  = Integer.parseInt(part2);
				month = month - 1;
				day = day - 1;
	
				System.out.print("Location: Eagle, NE");
				System.out.print("\t\tDate:" );
				System.out.print("\nHigh Temp: "+WeatherDataLoad.getHIGHS(0,month,day));
				System.out.print("\t\t\tLow Temp: "+WeatherDataLoad.getLOWS(0,month,day));
				System.out.print("\nAvg Wind: "+WeatherDataLoad.getWIND(0,month,day));
				System.out.print("\t\t\tMax Wind: "+WeatherDataLoad.getGUSTS(0,month,day));
				System.out.print("\nPrecipitation: "+WeatherDataLoad.getPRECIP(0,month,day) + " inches");
				
				System.out.println("\n");
				
				System.out.print("Location: New York, NY");
				System.out.print("\t\tDate:" );
				System.out.print("\nHigh Temp: "+WeatherDataLoad.getHIGHS(1,month,day));
				System.out.print("\t\t\tLow Temp: "+WeatherDataLoad.getLOWS(1,month,day));
				System.out.print("\nAvg Wind: "+WeatherDataLoad.getWIND(1,month,day));
				System.out.print("\t\t\tMax Wind: "+WeatherDataLoad.getGUSTS(1,month,day));
				System.out.print("\nPrecipitation: "+WeatherDataLoad.getPRECIP(1,month,day) + " inches");
				
				System.out.println("\n");
				
				System.out.print("Location: Houston, TX");
				System.out.print("\t\tDate:" );
				System.out.print("\nHigh Temp: "+WeatherDataLoad.getHIGHS(2,month,day));
				System.out.print("\t\t\tLow Temp: "+WeatherDataLoad.getLOWS(2,month,day));
				System.out.print("\nAvg Wind: "+WeatherDataLoad.getWIND(2,month,day));
				System.out.print("\t\t\tMax Wind: "+WeatherDataLoad.getGUSTS(2,month,day));
				System.out.print("\nPrecipitation: "+WeatherDataLoad.getPRECIP(2,month,day) + " inches");
				
				System.out.println("\n");
				
				System.out.print("Location: LA, CA");
				System.out.print("\t\tDate:" );
				System.out.print("\nHigh Temp: "+WeatherDataLoad.getHIGHS(3,month,day));
				System.out.print("\t\t\tLow Temp: "+WeatherDataLoad.getLOWS(3,month,day));
				System.out.print("\nAvg Wind: "+WeatherDataLoad.getWIND(3,month,day));
				System.out.print("\t\t\tMax Wind: "+WeatherDataLoad.getGUSTS(3,month,day));
				System.out.print("\nPrecipitation: "+WeatherDataLoad.getPRECIP(3,month,day) + " inches");
				
				System.out.println("\n");
	
			}
			else if(userInput == 2){
				System.out.println("Please select a category to calculate monthly averages:");
				System.out.println("	1.High Temp");
				System.out.println("	2.Low Temp");
				System.out.println("	3.Average Wind");
				System.out.println("	4.Max Wind");
				System.out.println("	5.Precipitation");
				System.out.println("	0.Quit");
	
				System.out.println("\nSelection:\n");
				int Avg = scan.nextInt();
				
				if (Avg == 1){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
				}
				else if (Avg == 2){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
				}
				else if (Avg == 3){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
				}
				else if (Avg == 4){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
				}
				else if (Avg == 5){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
				}
				else if (Avg == 0){
					System.out.println("Please select a feature you wish to use from the following:");
					System.out.println("	1.Weather Record");
					System.out.println("	2.Averages");
					System.out.println("	3.Maximums");
					System.out.println("	4.Minimums");
					System.out.println("	5.Total Precipitation");
					System.out.println("	6.Extremes");
					System.out.println("	0.Quit");
					break;
				}
	
			}
			else if(userInput == 3){
				System.out.println("Please select a category to calculate monthly maximums:");
				System.out.println("	1.High Temp");
				System.out.println("	2.Low Temp");
				System.out.println("	3.Average Wind");
				System.out.println("	4.Max Wind");
				System.out.println("	5.Precipitation");
				System.out.println("	0.Quit");
				
				
				int Max = scan.nextInt();
				if (Max == 1){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
				}
				else if (Max == 2){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "F");
					System.out.println("February: " + "F");
					System.out.println("March: " + "F");
					System.out.println("April: " + "F");
					System.out.println("May: " + "F");
					System.out.println("June: " + "F");
					System.out.println("July: " + "F");
					System.out.println("August: " + "F");
					System.out.println("September: " + "F");
					System.out.println("October: " + "F");
					System.out.println("November: " + "F");
					System.out.println("December: " + "F");
					
					System.out.println("\n");
				}
				else if (Max == 3){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
				}
				else if (Max == 4){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
				}
				else if (Max == 5){
					System.out.println("Location: Eagle, NE");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: New York, NY");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: Houston, TX");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
					
					System.out.println("Location: LA, CA");
					System.out.println("January: " + "");
					System.out.println("February: " + "");
					System.out.println("March: " + "");
					System.out.println("April: " + "");
					System.out.println("May: " + "");
					System.out.println("June: " + "");
					System.out.println("July: " + "");
					System.out.println("August: " + "");
					System.out.println("September: " + "");
					System.out.println("October: " + "");
					System.out.println("November: " + "");
					System.out.println("December: " + "");
					
					System.out.println("\n");
				}
				else if (Max == 0){
					System.out.println("Please select a feature you wish to use from the following:");
					System.out.println("	1.Weather Record");
					System.out.println("	2.Averages");
					System.out.println("	3.Maximums");
					System.out.println("	4.Minimums");
					System.out.println("	5.Total Precipitation");
					System.out.println("	6.Extremes");
					System.out.println("	0.Quit");
					break;
				}
			
	
			}
			else if(userInput == 4){
				System.out.println("Please select a category to calculate monthly minimums:");
				System.out.println("	1.High Temp");
				System.out.println("	2.Low Temp");
				System.out.println("	3.Average Wind");
				System.out.println("	4.Max Wind");
				System.out.println("	5.Precipitation");
				System.out.println("	0.Quit");
				
				int Min = scan.nextInt();
			
	
			}
			else if(userInput == 5){
				System.out.println("Please select a location to see the total precipitation:");
				System.out.println("	1. Eagle, NE");
				System.out.println("	2. New York, NY");
				System.out.println("	3. Houston, TX");
				System.out.println("	4. LA, CA");
				System.out.println("	0. Quit");
				
				int TotPrecip = scan.nextInt();
			
	
			}
			else if(userInput == 6){
				System.out.println("Please select a location to see the statistics:");
				System.out.println("	1. Eagle, NE");
				System.out.println("	2. New York, NY");
				System.out.println("	3. Houston, TX");
				System.out.println("	4. LA, CA");
				System.out.println("	0. Quit");
				
				String Date = scan.nextLine();
				int day = 0;
				int month = 0;
	
				String string = Date;
				String[] parts = string.split("/");
				String part1 = parts[0]; 
				String part2 = parts[1]; 
				day  = Integer.parseInt(part1);
				month = Integer.parseInt(part2);
	
			}
		}
		System.out.println("Thank You, Goodbye");
	}
}






