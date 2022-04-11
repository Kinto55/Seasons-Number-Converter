
/**
 * Write a description of class Problem2 here.
 *
 * @author (Marklintus Morris)
 * @version (3/18/21)
 */
public class Problem2
{
    //instance varibles 
    private int month;
    private int day;
    
    /**
     * Constructor for objects of class Problem2
     * 
     */
    public Problem2(int m, int d)
    {
        //initialise instance varibles 
        month = m;
        day = d;
    }
    
    /**
     * Curently writing if statments to establish a current season
     * 
     * @param none 
     * @return  what the season will actually be
     */
    public String calcSeason()
    {
       //calcuate the current season as a string
       String season = "";
       
       //if month is between 1 and 3
       if(month <=3)
         season = "Winter"; 
         
       //if the month is between 4 and 6
       else if(month <=6)
         season = "Spring";
         
       //if month is between 7 and 9
       else if(month <=9)
         season = "Summer";
         
       //if month is over 9 
       else 
          season = "Fall";
       
       //if month is divisible by 3
       if(month % 3 == 0 && day >= 21)
       {
           if(season.equalsIgnoreCase("Winter"))
             season = "Spring";
           
           else if(season.equalsIgnoreCase("Spring"))
             season = "Summer";
           else if(season.equalsIgnoreCase("Summer"))
             season = "Fall";
           else 
             season = "Winter";
       }
         
       //get the correct season for this class
       return season;
    }
}
