public class HW4{

	public static int daysInMonth(int month){	
		if (month ==1 ) {
			return 31;
		} else if (month ==2 ){
			return 28;
		} else if (month ==3){
			return 31;
		} else if (month ==4){
			return 30; 
		} else if (month ==5){
			return 31; 
		} else if (month ==6){
			return 30; 
		} else if (month ==7){
			return 31; 
		} else if (month ==8){
			return 31; 
		} else if (month ==9){
			return 30; 
		} else if (month ==10){
			return 31; 
		} else if (month ==11){
			return 30; 
		} else if (month ==12){
			return 31; 
		} else
			return 0;
	}

	public static void main(String [] args){
		System.out.println(daysInMonth(1));
		System.out.println(daysInMonth(2));
		System.out.println(daysInMonth(3));
		System.out.println(daysInMonth(4));
		System.out.println(daysInMonth(5));
		System.out.println(daysInMonth(6));
		System.out.println(daysInMonth(7));
		System.out.println(daysInMonth(8));
		System.out.println(daysInMonth(9));
		System.out.println(daysInMonth(10));
		System.out.println(daysInMonth(11));
		System.out.println(daysInMonth(12));
	}
}