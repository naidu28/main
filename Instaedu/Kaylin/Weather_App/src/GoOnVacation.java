
public class GoOnVacation implements CustomerCityRule 
{
    public boolean isApplicable(Location location) 
    {
    	if (Integer.parseInt(location.getTemp()) < 25 || Integer.parseInt(location.getTemp()) > 100){
        	return true;
        }
        else{ 
        	return false;
        }
    }
}