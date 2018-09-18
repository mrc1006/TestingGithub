import java.util.Scanner;
import java.text.DecimalFormat;
/**
* Determine the amount of money the user will have when they reach retirement
*
* @author (Michael Carhart)
* @version (Due: Sep. 18, 2018)
*/
public class Retirement 
{
	public static double interest(double yearsToRetire, double moneySaved)
    {
        // .05 is the interest rate (constant)
        double interest = 0;
        double money = moneySaved;
        for(int i=0; i<yearsToRetire; i++)
        {
        	interest = money * .05;
        	money += interest;
        }
        return money;
    }
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        double yearsToRetire;
        double moneySaved;
        //interestMoney will have own method
        double interestMoney;
        double totalMoney;
        
        do
        {
            System.out.print("Years until retirement: ");
            yearsToRetire = input.nextDouble();
            if (yearsToRetire <= 0)
            {
                System.out.println("Value must be greater than 0.");
            }
            else
            {
                break;
            }
        }while(true);
        do
        {
            System.out.print("Money being saved annually: ");
            moneySaved = input.nextDouble();
            if (moneySaved <= 0)
            {
                System.out.println("Value must be greater than 0.");
            }
            else
            {
                break;
            }
        }while(true);
        input.close();
        
        interestMoney = interest(yearsToRetire, moneySaved);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Money earned from interest: $" + df.format(interestMoney));
        totalMoney = (yearsToRetire * moneySaved) + interestMoney;
        System.out.println("Money available for retirement: $" +df.format(totalMoney));
        
    }

}
