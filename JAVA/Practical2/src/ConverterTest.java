import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ConverterTest
{
    private static final double ACCURACY = 0.05;

    private static Converter converter;

    @BeforeAll
    public static void setup()
    {
        // This method only setups the unit testing.
        // In other words, this method is responsible for instantiating or initializing
        // any variables that unit test methods need.
        // There are different annotations as can be seen here
        // https://junit.org/junit5/docs/current/user-guide/
        // https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/package-summary.html
        converter = new Converter();
    }

    @Test
    public void test_mph2kph()
    {
        // Test convert mph to kph -- comparing doubles using assertEquals
        assertEquals("mph2kmh failed:", 38.6243, converter.mph2kph(24), ACCURACY);
        assertEquals("mph2kmh failed:", 96.5606, converter.mph2kph(60), ACCURACY);


        assertEquals("cel2fahr failed:", 35.6, converter.cel2fahr(2), ACCURACY);
        assertEquals("cel2fahr failed:", 113, converter.cel2fahr(45), ACCURACY);

        assertEquals("p2dol failed:", 30.81, converter.p2dol(24), ACCURACY);
        assertEquals("p2dol failed:", 771.671, converter.p2dol(601), ACCURACY);


        assertEquals("sec2hours failed:", 1.25, converter.sec2hours(4500), ACCURACY);
        assertEquals("sec2hours failed:", 8.916725, converter.sec2hours(32100.21), ACCURACY);

    }//ok thanks!

    @Test
    public void test_mph2kmh_printing()
    {
        // Test convert_array -- comparing Strings using assertEquals
        assertEquals("mph2kmh_printing failed:", "60.0 mph = 96.5 kph", converter.mph2kph_printing(60));
    }

    @Test
    public void test_mph2kph_compare()
    {
        assertTrue("mph2kmh_compare failed:",converter.mph2kph_compare(38.6243,38.6243) );

    }

    @Test
    public void test_convert_array()
    {
        double[] expectedOutput1 = {38.616,96.5399 };
        double[] actuals = {24,60};
        assertArrayEquals("test_convert_array failed",expectedOutput1,converter.convert_array("mph2kph",actuals),ACCURACY);

        double[] expectedOutput2 = {35.6,113 };
        double[] actuals2 = {2,45};
        assertArrayEquals("test_convert_array failed",expectedOutput2,converter.convert_array("cel2fahr",actuals2),ACCURACY);

        double[] expectedOutput3 = {30.81,771.671};
        double[] actuals3 = {24,601};
        assertArrayEquals("test_convert_array failed",expectedOutput3,converter.convert_array("p2dol",actuals3),ACCURACY);

        double[] expectedOutput4 = {1.25,8.916725};
        double[] actuals4 = {4500,32100.21};
        assertArrayEquals("test_convert_array failed",expectedOutput4,converter.convert_array("sec2hours",actuals4),ACCURACY);


    }



}
