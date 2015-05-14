

public class ThreadTest implements Runnable {
	
	public void run() 
	{
		for (Customer c: WeatherSimulator.customers) {
			for (Location l: c.getLocations()) {
				for (CustomerCityRule r: WeatherSimulator.rules) {
					//if (r.isApplicable(l)) {
						String s = r.getClass().getSimpleName();
						//GUI.outputTextArea.append("\n" + c.toString() + "\nTemperature: " + Location.getTemp() + "\u00b0" + "F" + "\n" + l.toString() + "\n" + "\nNotification: " + s + "\n");
						GUI.outputTextArea.append("------------------------------------------------------------------------------");
					//}
				}
			}
		}
	}
}