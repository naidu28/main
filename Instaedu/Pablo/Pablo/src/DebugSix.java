/**
 * Created 9/29/14
 *
 * @author Pablo Garcia
 */
// Application contains a starting list of three products for sale
// The user is prompted for additional items
// AFter each new entry, the alphabetically soorted list is displayed
import java.util.*;

public class DebugSix {

    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList();
        products.add("shampoo");
        products.add("moisturizer");
        products.add("conditioner");
        Collections.sort(products);
        display(products);
        final String QUIT = "quit";
        String entry;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a product or " + QUIT + " to quit >> ");
        entry = input.nextLine();
        
        
        while (!entry.equals("quit")) {
            products.add(entry);
            Collections.sort(products);
            display(products);

            System.out.println("\nEnter a product or " + QUIT + " to quit >> ");
            entry = input.nextLine();
        }
    }

    public static void display(ArrayList products) {
        System.out.println("\nThe size of the list is ");

        for (int x = 0; x < products.size(); ++x) {
            System.out.println(products.get(x));
        }
    }
}
