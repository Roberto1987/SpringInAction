package codewars.test;

import codewars.src.PiramidesCubes;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by rob on 5/28/17.
 */
public class PiramidesCubesTest {
    private static long numberTest;

    @Before
    public void pre(){
        numberTest = 132232496;
    }
    @Test
    public void squareRoot() throws Exception {
        MathContext mathSetts = new MathContext(20);
        assert(PiramidesCubes.squareRoot(new BigDecimal(900),10).
                compareTo(new BigDecimal(30,mathSetts)) == 0);
    }

    /**
     * Test the seed estimation for the Newton-Raphson algorithm for Square root.
     * The tested function determine it by iterative divisions of a BigDecimal , while
     * the test function determine it by using a string on a long type and then counting
     * the length of the String.
     *
     * @throws Exception
     */
    @Test
    public void estimate() throws Exception {

        double a = PiramidesCubes.estimate(new BigDecimal(numberTest));
        String numWidth = Long.toString(numberTest).trim();
        double numCiphers = Math.floor((numWidth.length()-2)/2);
        assertThat("Sizes of approximations doesn't match",
                Math.pow(10,numCiphers)*6,is(equalTo(a)));
    }


    @Test
    public void test1() {
        assertEquals(2022, PiramidesCubes.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, PiramidesCubes.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, PiramidesCubes.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, PiramidesCubes.findNb(40539911473216L));
    }


}