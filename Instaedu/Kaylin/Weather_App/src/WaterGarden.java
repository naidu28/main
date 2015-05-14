

public class WaterGarden implements CustomerCityRule 
{
    public boolean isApplicable(Location location)
    {
    	if (Integer.parseInt(location.getTemp()) > 25){
        	return true;
        }
        else{ 
        	return false;
        }
    }
}