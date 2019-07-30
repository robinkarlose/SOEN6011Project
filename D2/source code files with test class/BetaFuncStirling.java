package beta;
import java.util.*;

public class BetaFuncStirling
{
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846;

    public static double realfact(double n)
    {
        double t1,t2,p1,p2,rf;

        t1=2*PI*n;
        t2=(n/E);

        p1=Power.powr(t1,0.5,0.0001);
        p2=Power.powr(t2,n,0.0001);

        rf=p1*p2;

        return rf;
    }

    public static double gammaS(double t)
    {
        double gs;
        gs=realfact(t-1);
        return gs;
    }

    public static double CompBetaS(double x,double y)
    {
        double cbs,num,den;

        num=gammaS(x)*gammaS(y);
        den=gammaS((x+y));
        cbs=num/den;

        return cbs;
    }


}
