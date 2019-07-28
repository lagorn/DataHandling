import java.math.BigDecimal;

public class NumberService {

    public BigDecimal circleSquare(double radius) {

        return new BigDecimal(radius).pow(2).multiply(new BigDecimal(Math.PI)).setScale(50, BigDecimal.ROUND_HALF_UP);

    }

    public boolean isThirdSumOfFirstTwo(String str1, String str2, String str3) {

        BigDecimal bd1 = new BigDecimal(str1);
        BigDecimal bd2 = new BigDecimal(str2);
        BigDecimal bd3 = new BigDecimal(str3);

        return bd1.add(bd2).compareTo(bd3) == 0;
    }

    public int findMin(int i1, int i2, int i3) {
        return Math.min(i1, Math.min(i2, i3));
    }

    public int findMax(int i1, int i2, int i3) {
        return Math.max(i1, Math.max(i2, i3));
    }
}

