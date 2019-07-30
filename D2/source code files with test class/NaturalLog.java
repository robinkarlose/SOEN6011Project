package beta;

public class NaturalLog
{

    public static double ln(Double n)
    {
        double natlog=0.0;
        double t1,t2,t3,t4,t5;



        t1=((1/fact(1))*(intpow(n-1.0,1)));
        System.out.println(t1);
        t2=((-1.0/intpow(n,2))/fact(2))*(intpow(n-1.0,2));
        System.out.println(t2);
        t3=((2.0/intpow(n,3))/fact(3))*(intpow(n-1.0,3));
        System.out.println(t3);
        t4=((-6.0/intpow(n,4))/fact(4))*(intpow(n-1.0,4));
        System.out.println(t4);
        t5=((24.0/intpow(n,5))/fact(5))*(intpow(n-1.0,5));
        System.out.println(t5);

        /*
        t1=(intpow(n-1,1));
        System.out.println(t1);
        t2=((-1.0/2.0)*(intpow(n-1,2)));
        System.out.println(t2);
        t3=((1.0/3.0)*(intpow(n-1,3)));
        System.out.println(t3);
        t4=((-1.0/4.0)*(intpow(n-1,4)));
        System.out.println(t4);
        t5=((1.0/5.0)*(intpow(n-1,5)));
        System.out.println(t5);
        */
        natlog=natlog+t1+t2+t3+t4+t5;

        return natlog;
    }

    public static double fact(int num)
    {
        int i;
        double fact = 1.0;

        for (i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static double intpow(double val,int pow)
    {
    int i;
    double t=1;
    for(i=1;i<=pow;i++)
    {
        t=t*val;
    }
        return t;
    }


}
