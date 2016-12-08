package day4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Objects;

/**
 * Created by Sneeuwpopsneeuw on 07-Dec-16.
 */
public class part1 {

    public static void main(String args[]) throws Exception {
        String secretKey = "iwrupvqb", s, v;
        MessageDigest m = MessageDigest.getInstance("MD5");

        for (int i = 0; i < 9_999_999; i++) {
            s = secretKey + "" + i;
            m.update(s.getBytes());
            v = String.format("%032x", new BigInteger(1, m.digest()));  // String.format("%032x" is used to keep the leading zero's

            if (i % 10_000 == 0)
                System.out.print(".");
            if (i % 1_000_000 == 0)
                System.out.println("");

            if (Objects.equals(v.substring(0, 5), "00000")) {
                System.out.println("");
                System.out.println("MD5: " + v + " : " + v.substring(0, 5));
                System.out.println("secretKey: " + s);
                return;
            }
        }
    }
}