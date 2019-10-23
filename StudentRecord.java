public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private static int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   public static double average(int first, int last)
   {
       double sum=0.0;
       for (int i = first; i<=last; i++)
       {
           sum+=scores[i];
        }
       return sum/(last-first+1); //done
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private static boolean hasImproved()
   {
      int a = 0;
      int count = 0;
      for (int i = 0; i<scores.length; i++)
      {
          if (scores[i]>a)
          {
              a = scores[i];
              count++;
        }
   } 
   
   boolean imp = (count==(scores.length-1));
   return imp;//done
}
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public static double finalAverage(boolean imp, int first, int last)
   {
       if  (imp)
       {
           first = scores.length/2;
           scores.average(first, last);
        }
        scores.average(first, last);
   
}
}