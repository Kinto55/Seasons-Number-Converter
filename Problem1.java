
/**
 *  Problem1 here with commas, hundreds and thousands.
 *
 * @author (Markintus MOrris)
 * @version (4-16-21)
 */
public class Problem1
{
    // instance variables 
    private int value;

    /**
     * This currently, Establishes v as an argument
     */
    public Problem1(int v)
    {
        // initialise instance variables
        value = v;
    }

    /**
     * 
     * adding commas to numbers 
     * 
     * @param none
     * @return  number with comma
     */
    public String addComma()
    {
         // creating varibles this time
         String commaNumber;
         int thousands;
         int hundreds;
         
         //convert int to a string
         thousands= value / 1000;
         String t = String.valueOf(thousands);
         
         //Convert int to string for hundreds
         hundreds = value % 1000;
         String h = String.valueOf(hundreds);
         
         //combine
         commaNumber = t + "," + h;
         
         //return commaNumber to the user
         return commaNumber;
    }
}
