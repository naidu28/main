public class Lab04 {
   public static void main(String[]args){
	   for (int line = 5; line >=1; line--){
	      for (int j = 1; j <= ( line-1); j++){
		     System.out.print(" ");
         }
         for (int j =1;j <=(8-2*line);j++){
              System.out.print("*");
         }
         System.out.println();
      }
    }
 }

 