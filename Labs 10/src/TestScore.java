/**
 * Peter Laskai
 * Lab Part 2: This program calculates Test Score average and will catch any exceptions implemented by InvalidTestScore
 * Due Date: 11/19/2014
 */
public class TestScore
{//begin class
	//private variables
	double avg; 
	double[] scoresarray;
	
	/**
	 * 
	 * @param scores
	 */
	
	public TestScore(double[] scores)
	{//begin method
		this.scoresarray = scores;      

		double total = 0.0;
		//exception statement
		for(int i = 0; i < scores.length; i++) {

			if(scores[i] < 0.0 || scores[i] > 100.0)

				try
			{

					throw new InvalidTestScore();
			}
			catch(InvalidTestScore e) 
			{
				e.printStackTrace();
			}

			total += scores[i];

		}
		//calculated average
		avg = total / scores.length;
	}//end method
	
	/**
	 * 
	 * @return this.avg
	 */
	
	public double getAverageScore()
	{//begin method
		return this.avg;
	}//end method
}//end class

/*
 * PsuedoCode:
 * 1.0 implement InvalidTestCore.java
 * 2.0 Construct scoresarray
 * 3.0 Check for exceptions in a for loop
 * 4.0 if there is an exception is thrown
 * 5.0 add to score to sum
 * 6.0 calculate sum/scores.length
 * 7.0 print results
 */