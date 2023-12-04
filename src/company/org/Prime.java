package company.org;

import java.math.BigInteger;

public class Prime {
    private BigInteger silnia(int x) {
        BigInteger temp = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            temp = temp.multiply(BigInteger.valueOf(i));
        }
        return temp;
    }

    public BigInteger liczba(int n) {
        BigInteger temp_2 = BigInteger.valueOf(-1);
        if (n < 4) {
            System.out.println("Błąd, podano za mały argument");
            return BigInteger.valueOf(-1);
        } else {
            for (int j = 3; j <= n; j++) {
                BigInteger pom = silnia(j - 2);
                temp_2 = temp_2.add(pom.subtract(BigInteger.valueOf(j).multiply(pom.divide(BigInteger.valueOf(j)))));
            }
            return temp_2;
        }
    }
}
