/**
 * Peter Laskai
 * Purpose: An exception class for Lab 10 Part ; it supers and extends Exception creating a message
 *
 */
public class InvalidTestScore extends Exception 
{//begin class

   public InvalidTestScore() 
   {//begin method
      super("Invalid test score");//error message
   }//end method

   public InvalidTestScore(String message) 
   {//begin method
      super(message);
   }//end method

   public InvalidTestScore(Throwable throwable) 
   {//begin method
      super(throwable);
   }//end method
}//end class