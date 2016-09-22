/**
 * Peter Laskai
 * Purpose: To calculate Test Score average and to check for exceptions; if there are any IllegalArgument exception is thrown
 * Due Date: 11/19/2014
 */
import java.lang.IllegalArgumentException;
public class TestScores
{//begin class

	double avg;
	double[] scoresarray;
	/**
	 * 
	 * @param scores
	 */
	public TestScores(double[] scores)
	{//begin method



		this.scoresarray = scores;      
		double total = 0.0;

		for(int i = 0; i < scores.length; i++) 
		{	
			if(this.scoresarray[i] < 0 || this.scoresarray[i] > 100)
			{
				throw new IllegalArgumentException(this.scoresarray[i] + " is not vaild");
			}
			else
			total += scores[i];
		}
		avg = total / scores.length;
	}//end method
	
	/**
	 * 
	 * @return this.avg
	 */
	
	public double getAverage()
	{//begin method 
		return this.avg;

	}//end method
}//end class
/*
 * PsuedoCode:
 * 1.0 import illegalArgumentException
 * 2.0 Construct scoresarray
 * 3.0 Check for exceptions in a for loop
 * 4.0 if there is an exception is thrown
 * 5.0 add to score to sum
 * 6.0 calculate sum/scores.length
 * 7.0 print results
 */