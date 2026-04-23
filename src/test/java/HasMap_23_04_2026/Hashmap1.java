package HasMap_23_04_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new LinkedHashMap<>();
		
		map.put(1000, "India");
		map.put(2000, "America");
		map.put(3000, "Australia");
		
		System.out.println("LinkedMap : " + map);

	}

}
