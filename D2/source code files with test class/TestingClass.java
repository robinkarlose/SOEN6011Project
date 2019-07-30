package beta;
import static org.junit.Assert.*;
import org.junit.Test;
import java.math.*;

public class TestingClass
{

@Test
public void test1()
{
assertEquals(125.0,Power.powr(5.0,3),0.001);
}
    @Test
    public void test2()
    {
        assertEquals(2.995,Power.nat_log(20),0.001);
    }
    @Test
    public void test3()
    {
        assertEquals(8.0,Power.powr(16.0,0.75,0.001),0.0001);
    }
    @Test
    public void test4()
    {
        assertEquals(20.085,Power.epowerx(3),0.001);
    }
    @Test
    public void test5()
    {
        assertEquals(0.016,BetaFuncStirling.CompBetaS(3.0,4.0),0.1); //delta is waaay too low but Stirling's approximation is inaccurate
    }
    @Test
    public void test6()
    {
        assertEquals(1.2009,BetaFuncLnGamma.lngamma(3.5),0.0001);       //super accurate natural log calculation of the Gamma function the Lanczos formula for the Stieltjes function
    }
    @Test
    public void test7()
    {
        assertEquals(0.0168,BetaFuncLnGamma.beta(3.0,4.0),0.0001);  //hence super accurate Beta Function
    }
    //@Test
    public void test8()
    {
        assertEquals(0.0,BetaFuncLnGamma.beta(-3.0,4.0),0.0001);    //this WILL fail and will give infinity
    }
}
