package codewars.test;

import codewars.src.LongestConsec;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rob on 5/30/17.
 */
public class LongestConsecTest {

    private static String[] stringArray;
    private static int k;

    @Before
    public void pre(){
        stringArray = new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        k = 2;
    }

    @Test
    public void longestConsec() throws Exception {
    LongestConsec.longestConsec(stringArray,k);

    }




}