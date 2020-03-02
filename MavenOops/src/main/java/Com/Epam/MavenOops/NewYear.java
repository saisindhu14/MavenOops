package Com.Epam.MavenOops;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NewYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Float> mp = new HashMap<String,Float>();
		mp.put("FiveStar",(float) 0.000); 
		System.out.println(mp.get("FiveStar"));
					/*put("MilkyBar", 0);
					put("Rasgulla", 0);
					put("Laddo", 0);*/
	}
}
