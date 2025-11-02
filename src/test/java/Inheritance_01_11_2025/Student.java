package Inheritance_01_11_2025;

public class Student extends College {
	
	public void name() {
		
		System.out.println("name");
	}
	 
	public static void main(String[] args) {
		
		Student st=new Student();
		st.name();
		st.library();
		st.library(10);
		
		College cg=new College();
		cg.library();
		
	}
	

}
