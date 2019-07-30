package beta;

import java.util.Scanner;

public class BetaFunction
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        //int flag=1;



            System.out.println("Enter value of X (positive real number)");
            double x = inp.nextDouble();

            inp.nextLine();

            System.out.println("Enter value of Y (positive real number)");
            double y = inp.nextDouble();

            if (x > 0 && y > 0)
            {
                System.out.println("Approximation of Complete Beta Function using Stirlings Approximation is :-");
                System.out.println(BetaFuncStirling.CompBetaS(x, y));

                System.out.println("Approximation of Complete Beta Function using Log of Gamma Function (using Lancoz formula approximation) :-");
                System.out.println(BetaFuncLnGamma.beta(x, y));
                //flag=0;
            }

            else
            {

                System.out.println("Either X or/and Y is not a positive real number. Please re-enter positive real number values of X and Y");

            }



        //System.out.println( realfact(3.0));
    }
}
