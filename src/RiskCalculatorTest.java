import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RiskCalculatorTest
{
    RiskCalculator rc;

    @BeforeClass
    public static void setUpClass()
    {
    }

    @org.junit.Before
    public void setUp() throws Exception
    {
        rc = new RiskCalculator();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculatorRisk1() {
        int likelihood = 0, impact = 0;
        String expected = "Zero", actual = rc.calculateRisk(impact, likelihood);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorRisk2() {
        int likelihood = 2, impact = 0;
        String expected = "Small", actual = rc.calculateRisk(impact, likelihood);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorRisk3() {
        int likelihood = 3, impact = 2;
        String expected = "Medium", actual = rc.calculateRisk(impact, likelihood);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorRisk4() {
        int likelihood = 3, impact = 4;
        String expected = "High", actual = rc.calculateRisk(impact, likelihood);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorRisk5() {
        int likelihood = 2, impact = 4;
        String expected = "High", actual = rc.calculateRisk(impact, likelihood);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatorRisk6() {
        int likelihood = 4, impact = 1;
        String expected = "Medium", actual = rc.calculateRisk(impact, likelihood);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCasesInvalid()
    {
        rc.calculateRisk(5,2);
        rc.calculateRisk(-1,3);
        rc.calculateRisk(6,1);
        rc.calculateRisk(3,-1);
        rc.calculateRisk(2,6);
    }
}