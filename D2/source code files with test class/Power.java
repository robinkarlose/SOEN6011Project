package beta;

public class Power
{
    public static double series(double a, double b)
    {
        double result = (b - a) / 6;
        result = result * (fu(a) + 4 * fu((a + b) / 2) + fu(b));
        return result;
    }

    public static double fu(double x)
    {
        return 1 / x;
    }

    public static double nat_log(double x)
    {
        if (x == 1)
            return 0;

         if(x<0)
             System.out.println("ERORR - Logarithm cannot have negative domain");


        double result = 0,a;
        double step = (x - 1) / 100;
        for (a = 1; a < x; a += step)
        {
            result = result + series(a, a + step);
        }
        return result;
    }

    public static double powr(double a, double b, double epsilon)
    {
        double result = 1, temp = 1;
        double m = b * nat_log(a);
        for (int i = 1; Math.abs(temp) >= epsilon; i++)
        {
            temp = temp * (m / i);
            result += temp;
        }
        return result;
    }

    public static double powr(double val,int pow)
    {
        int i;
        double t=1;
        for(i=1;i<=pow;i++)
        {
            t=t*val;
        }
        return t;
    }

    public static double intfact(int num)
    {
        int i;
        double fact = 1.0;

        for (i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static double epowerx(double x)
    {
        int i;
        double ex=1.0,term;

        for(i=1;i<=50;i++)
        {
            term=(powr(x,i)/intfact(i));
            ex +=term;
        }
        return ex;
    }


}
