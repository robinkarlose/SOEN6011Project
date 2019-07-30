package beta;

public class BetaFuncLnGamma
{
    public static double beta(double x, double y)
    {
        return Power.epowerx(lngamma(x) + lngamma(y) - lngamma(x + y));
    }

    //Inspired by the Lanczos formula for the Stieltjes function

    public static double lngamma(double x)
    {
        double a, b, var, p;
        a = 0.0;
        b = 0.0;
        var = 0.0;
        p = 0.0;

        final double[] coeff = { 76.18009172947146, -86.50532032941677,       24.01409824083091, -1.231739572450155, 0.1208650973866179e-2,            -0.5395239384953e-5 };

        int k;
        b = x;
        a = x;

        var = a + 5.5;
        var = var - ((a + 0.5) * Power.nat_log(var));

        p = 1.000000000190015;

        for (k = 0; k <= 5; k++)
        {
            p = p + (coeff[k] / ++b);
        }

        double temp2=-var + Power.nat_log(2.5066282746310005 * p / x);

        return temp2;
    }

}
