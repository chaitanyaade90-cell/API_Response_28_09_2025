package SetPackages_03_01_2026;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;


public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		
		set.add("ADO");
		set.add("Agile");
		set.add("Inheritance");
		set.add("ADO");
		
		System.out.println(set);

	}

}
