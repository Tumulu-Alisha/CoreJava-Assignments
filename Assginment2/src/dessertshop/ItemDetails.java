package dessertshop;
import java.util.Scanner;
public class ItemDetails {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your role");
	String role=sc.nextLine();
	if(role.equalsIgnoreCase("Customer"))
			{
				System.out.println("Enter the item you want to buy: 1.Cookies 2.Candy 3.Ice Cream");
				String item=sc.nextLine();
				System.out.println("Enter the quantity of item you want to buy: ");
				float quant=sc.nextFloat();
				if(item.equalsIgnoreCase("Candy"))
				{
					Candy c= new Candy(quant);
					System.out.println("Your bill: "+c.getcost());
				}
				else if(item.equalsIgnoreCase("Cookies"))
				{
					Cookies co= new Cookies(quant);
					System.out.println("Your bill: "+co.getcost());
				}
				else if(item.equalsIgnoreCase("IceCream"))
				{
					IceCream ic= new IceCream(quant);
					System.out.println("Your bill: "+ic.getcost());
				}
			}
			if(role.equalsIgnoreCase("Owner"))
			{
				System.out.println("Enter the item you want to store: Cookies/Candy/Ice Cream");
				String item1= sc.nextLine();
				System.out.println("Enter the quantity you want to store: ");
				int quan1= sc.nextInt();
				System.out.println("You stored " +quan1+ " "+ item1);
			}
			sc.close();
	}
}
