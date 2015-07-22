package headFirst;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		
		HashMap<String, Integer> scores = new HashMap<>();
		
		scores.put("Atul", 9);
		scores.put("Vipul", 28);
		scores.put("Mukul", 5);
		
		System.out.println(scores);
		
		System.out.println(scores.get("Atul"));
	}

}
