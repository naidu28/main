
import java.util.List;
import java.util.ArrayList;

public class Customer
{
    private String fName;
	private String lName;
    private ArrayList<Location> locations = new ArrayList<Location>();
    private ArrayList<CustomerCityRule> customerRules = new ArrayList<CustomerCityRule>();
	
    public Customer(String fName, String lName)
    {
        this.fName = fName;
		this.lName = lName;
    }
        
 	public void addLocation(Location l) {
		if (locations.size() < 5)
			locations.add(l);
		else
			GUI.outputTextArea.setText("This customer already has 5 saved locations");
	}
	
	public void addRule(CustomerCityRule r) {
		if (!customerRules.contains(r))
			customerRules.add(r);
	}
	
	public List<Location> getLocations() {
		return locations;
	}
	
	public List<CustomerCityRule> getRules() {
		return customerRules;
	}
            
    public String toString()
    {
        return "Customer: " + fName + " " + lName;
    }

}