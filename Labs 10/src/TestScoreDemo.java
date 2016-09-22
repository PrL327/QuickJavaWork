/**
 * Peter Laskai
 * Lab Part 1: This the Demo class for TestScores.Java; Creates Two objects for a Test with the IllegalArguement Exception
 * Due Date: 11/19/2014
 */
import java.lang.IllegalArgumentException;
public class TestScoreDemo 
{//begin class

	public static void main(String[] args) 
	{//begin method	  
		//TestScore Objects with values
		 double [] gradegood = {100,90,80,70};
		 double [] gradebad = {-100,90,80,70};
		 //print statement
		 
		try
		{
			TestScores grade2 =  new TestScores(gradebad);
			System.out.println("Score Average: " + grade2.getAverage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Score "+e.getMessage());
		}
		
		try
		{
			 TestScores grade1 =  new TestScores (gradegood);
			 System.out.println("Score Average: " + grade1.getAverage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Score"+e.getMessage());
		}
		 
		 
	}//end method
}//end class

/*
Output:
Exception in thread "main" java.lang.IllegalArgumentException: Score is either too high or low
at TestScores.<init>(TestScores.java:18)
at TestScoreDemo.main(TestScoreDemo.java:6)
*/