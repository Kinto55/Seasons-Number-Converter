
/**
 * Write a description of class Problem1Tester here.
 *
 * @author (Markintus Morris)
 * @version (4/16/21)
 */
import java.util.Scanner;
public class Problem1Tester
{
    public static void main(String[] args)
    {
         //create scanner object
         Scanner scan = new Scanner(System.in);
         
         //prompt user for a number between 1000 and 99999
         System.out.println("Enter a number between 1000 and 99999");
         
         int n = scan.nextInt();
         
         //Establishing the probelm 1 objective
         Problem1 p1 = new Problem1(n);
         
         //call add coma to the inputted number and then print
         System.out.println(p1.addComma());
    }
}
