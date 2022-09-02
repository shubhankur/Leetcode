package Misc;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger a2 = new BigInteger(b, 2);
        a1 = a1.add(a2);
        return a1.toString(2);
    }
}
