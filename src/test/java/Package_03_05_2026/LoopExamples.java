package Package_03_05_2026;

public class LoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks = {95,67,40,30,85};
		
		for (int i = 0; i < marks.length; i++) {
			
			System.out.println("Student " + (i+1)	 + " Marks: " + marks[i]);
			
			if(marks[i]>=90) {
				
				System.out.println("Grade : A");
				
				
			} else if (marks[i] >= 60) {
				
			}
			
		}

	}

}
