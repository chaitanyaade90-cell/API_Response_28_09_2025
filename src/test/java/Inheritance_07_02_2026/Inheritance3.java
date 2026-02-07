package Inheritance_07_02_2026;

import javax.naming.directory.SearchResult;

class Runtest
{
	
	public void SanityTest() {
		
		System.out.println("Runtest Create TestSuite");
	}
}

class SearchResult extends Runtest{
	
	public void RegressionTest() {
		
		System.out.println("Search result for search the test suite");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchResult s1 = new SearchResult();
		
		s1.SanityTest();
		s1.RegressionTest();
		

	}

}
