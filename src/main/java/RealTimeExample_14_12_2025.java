import java.util.HashMap;

public class RealTimeExample_14_12_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> testCaseStatus =new HashMap<>();
		
		testCaseStatus.put("TC_001", "Pass");
		testCaseStatus.put("TC_002", "Fail");
		testCaseStatus.put("TC_003", "Blocked");
		
		System.out.println(testCaseStatus.get("TC_002"));
		System.out.println(testCaseStatus.get("TC_001"));
				

	}

}
