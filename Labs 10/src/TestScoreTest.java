/**
 * Peter Laskai
 * This is the TestScore test class for Lab 10 part 2
 * Due Date 11/19/2014
 *
 */
public class TestScoreTest 
{//begin class
	public static void main(String[] args)
	{//begin method
		
		//test score objects
		 TestScore grade1 =  new TestScore (new double[]  {100,90,80,70});
		 TestScore grade2 =  new TestScore (new double[]  {-100,90,80,70});
		 
		 //print statements
		 System.out.println("Score Average: " + grade1.getAverageScore());
		 System.out.println("Score Average: " + grade2.getAverageScore());
	}//end method
}//end class

/*
 * Output:
 * 
 * InvalidTestScore: Invalid test score
	at TestScore.<init>(TestScore.java:36)
	at TestScoreTest.main(TestScoreTest.java:7)
	Score Average: 85.0
 */