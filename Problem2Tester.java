
/**
 * Write a description of class Problem2Tester here.
 *
 * @author (Markintus Morris)
 * @version (3/18/21)
 */
import java.util.Scanner;
public class Problem2Tester
{
    public static void main(String[] args)
    {
       //creating a canner object
       Scanner in = new Scanner(System.in);
       
       //prompt user for month 
       System.out.println("Enter a month as a number : ");
       int month = in.nextInt();
       
       //prompt user for a day 
       System.out.println(" Enter a day : ");
       int day = in.nextInt();
       
       //Problem2 object
       Problem2 p2 = new Problem2(month, day);
       
       //calculate then print the accurate season
       System.out.println(p2.calcSeason());
       
       
       
      
    }
}
