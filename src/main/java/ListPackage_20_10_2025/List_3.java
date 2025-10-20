package ListPackage_20_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> games=new ArrayList<>();
		
		games.add("Cricket");
		games.add("Chess");
		games.add("Carrom");
		games.add("Polo");
		games.add("Baseball");
		
		System.out.println("Games starting with 'C' ");
		
		for (int i = 0; i < games.size(); i++) {
			
			String game=games.get(i);
			
			if(game.startsWith("C")) {
				System.out.println(game);
			}
			
		}

	}

}
