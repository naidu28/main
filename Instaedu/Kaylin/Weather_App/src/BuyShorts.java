
public class BuyShorts implements CustomerCityRule 
{
 	
	public boolean isApplicable(Location location) 
    {
        if (Integer.parseInt(location.getTemp()) >= 80){
        	return true;
        }
        else{ 
        	return false;
        }
    }
}