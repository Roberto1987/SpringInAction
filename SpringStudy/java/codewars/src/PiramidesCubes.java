package codewars.src;

import java.lang.*;
import java.math.*;

public class PiramidesCubes {
    public static final int sqrtPrecision = 30;
    public static long findNb(long m) {
        BigDecimal pNfour;
        MathContext mathSetts = new MathContext(sqrtPrecision,RoundingMode.HALF_UP);
        BigDecimal dM = new BigDecimal(m);

        //formula: n = 0.5*(Math.sqrt( 8*Math.sqrt(m)+1)+1);

        pNfour = squareRoot(dM,sqrtPrecision); //sqrt(m)
        pNfour = pNfour.multiply(new BigDecimal(8)); //8*sqrt(m)
        pNfour = pNfour.add(new BigDecimal(1));      //8*sqrt(m)+1
        pNfour = squareRoot(pNfour,sqrtPrecision);   //sqrt(8*sqrt(m)+1)
        pNfour = pNfour.add(new BigDecimal(1));      //sqrt(8*sqrt(m)+1)+1
        pNfour = pNfour.multiply(new BigDecimal(0.5)); // 0.5*(sqrt(8*sqrt(m)+1)+1)


        BigDecimal rounded = new BigDecimal(pNfour.toString(),mathSetts); //Copy of the solution

        /**
         *  Different scaling to detect a difference between integer solution and
         *  real solution
         */

        rounded = rounded.setScale(1,RoundingMode.FLOOR);
        pNfour = pNfour.setScale(15,RoundingMode.FLOOR);

        BigDecimal remaind = pNfour.subtract(rounded);

        System.out.println("Remaind = "+rounded.toString()+" - "+pNfour.toString());

        remaind.setScale(15,RoundingMode.FLOOR);

        System.out.println("Remaind: "+remaind.toString());

        if( remaind.doubleValue()>0){
            return -1;
        }

        return (long)pNfour.doubleValue()-1;
    }

    public static BigDecimal squareRoot(BigDecimal n, int precision)
    {

        MathContext mathSetts = new MathContext(precision);
        BigDecimal x = new BigDecimal(estimate(n),mathSetts);
        BigDecimal oneHalf = new BigDecimal(0.5,mathSetts);
        System.out.println(x.toString());
        BigDecimal tmp = new BigDecimal(0,mathSetts);
        int i = 0;
        while(i < precision+2){
            tmp = new BigDecimal(x.toString(),mathSetts);
            x = n.divide(x,mathSetts); // S/x
            x = x.add(tmp);  // S/x + x
            x = x.multiply(oneHalf);
            //System.out.println("x: "+x.toString()+", x' :"+tmp.toString());
            i++;
        }
        return x;
    }
    public static double estimate(BigDecimal n){
        BigDecimal hundred = new BigDecimal(100);

        double exp = 0;
        while(n.compareTo(hundred) == 1){
            n = n.divide((BigDecimal.TEN));
            exp++;
        }
        exp = Math.floor(exp/2);
        return 6*Math.pow(10,exp);
    }

}