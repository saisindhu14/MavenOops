package Com.Epam.MavenOops;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NewYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float weights,quality;
		int total_weights=0,total_chocolates=0,total_sweets = 0;
		int chocolates;
		Boolean t = true;
		Chocolates collect_sweet = null;
		System.out.println("Select sweet or chocolates");
		while(t) {
			System.out.println("1.FiveStar");
			System.out.println("2.MilkyBar");
			System.out.println("3.Rasgulla");
			System.out.println("4.Laddo");
			int choice = sc.next().charAt(0);
			char nextchoice;
			try {
				switch(choice) {
				case '1':
					System.out.println("Enter weight");
					weights = sc.nextInt();
					System.out.println("Enter quality");
					quality = sc.nextInt();
					collect_sweet = new FiveStar();
					collect_sweet = collect_sweet.Sweets_weight(weights,quality);
					total_weights += total_sweets;
					System.out.println("Enter chocolates");
					chocolates = sc.nextInt();
					System.out.println("Total weight of sweet is :" + total_sweets + "grams");
					System.out.println("Total weight of gift is :" + total_weights);
					total_chocolates+=chocolates;
					System.out.println("The total weight of gift = ");
					System.out.println(total_chocolates+total_sweets);
					break;
					
				case '2':
					System.out.println("Enter weight");
					weights = sc.nextInt();
					System.out.println("Enter quality");
					quality = sc.nextInt();
					collect_sweet = new MilkyBar();
					collect_sweet = collect_sweet.Sweets_weight(weights,quality);
					total_weights += total_sweets;
					System.out.println("Enter chocolates");
					chocolates = sc.nextInt();
					System.out.println("Total weight of sweet is :" + total_sweets + "grams");
					System.out.println("Total weight of gift is :" + total_weights);
					total_chocolates+=chocolates;
					System.out.println("The total weight of gift = ");
					System.out.println(total_chocolates+total_sweets);
					break;
					
				case '3':
					System.out.println("Enter weight");
					weights = sc.nextInt();
					System.out.println("Enter quality");
					quality = sc.nextInt();
					collect_sweet = new Rasgulla();
					collect_sweet = collect_sweet.Chocolates_weight(weights,quality);
					total_weights += total_sweets;
					System.out.println("Enter chocolates");
					chocolates = sc.nextInt();
					System.out.println("Total weight of sweet is :" + total_sweets + "grams");
					System.out.println("Total weight of gift is :" + total_weights);
					total_chocolates+=chocolates;
					System.out.println("The total weight of gift = ");
					System.out.println(total_chocolates+total_sweets);
					break;
					
				case '4':
					System.out.println("Enter weight");
					weights = sc.nextInt();
					System.out.println("Enter quality");
					quality = sc.nextInt();
					collect_sweet = new Laddo();
					collect_sweet = collect_sweet.Sweets_weight(weights,quality);
					total_weights += total_sweets;
					System.out.println("Enter chocolates");
					chocolates = sc.nextInt();
					System.out.println("Total weight of sweet is :" + total_sweets + "grams");
					System.out.println("Total weight of gift is :" + total_weights);
					total_chocolates+=chocolates;
					System.out.println("The total weight of gift = ");
					System.out.println(total_chocolates+total_sweets);
					break;
				}
		} catch(Exception e) {
			System.out.println("your choice is out of range");
		}
	}
		sc.close();
	}
}
