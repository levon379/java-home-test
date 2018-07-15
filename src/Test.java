
import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        String a = "0";
        String b = "99999999999999999";
        BigInteger az = new BigInteger(a);
        BigInteger bz = new BigInteger(b);

        int lengthA = a.length();
        int lengthB = b.length();
        Test t = new Test();
        if (lengthA > lengthB) {
            b = t.appendZero(b, lengthA);
        } else {
            a = t.appendZero(a, lengthB);
        }
        String c = t.getPlus(b, a);
        System.out.println(c);
        System.out.println(az.add(bz));

      /*  Test t = new Test();
        String s = t.appendZero(a,4);*/

        //String c = t.getPlus(a, b);

    }

    public String appendZero(String a, int length) {

        int strLength = a.length();
        int sum = length - strLength;
        String zero = "";
        for (int i = 0; i < sum; i++) {
            zero += 0;
        }
        return zero + a;
    }

    public String getPlus(String a, String b) {
        int sum;
        int val;
        boolean plus = false;

        int lengthA = a.length();
        int lengthB = b.length();
        int[] newArray = new int[lengthA + 1];
        int currentA, currentB;
        for (int i = 0; i < lengthA; i++) {

            /*newArray[lengthA - i] = new ArrayList<Integer>();*/
            currentA = Character.getNumericValue(a.charAt(lengthA - i - 1));
            currentB = Character.getNumericValue(b.charAt(lengthB - i - 1));
            sum = currentA + currentB + newArray[lengthA - i];
            plus = false;
            if (sum >= 10) {
                plus = true;
                val = sum % 10;
                newArray[lengthA - i] = val;
            } else {
                newArray[lengthA - i] = sum;
            }
            if (plus) {
                newArray[lengthA - i - 1] = 1;
            }
        }
        String res = "";
        for (int i = 0; i < newArray.length; i++) {
            if (i == 0 && newArray[i] == 0) {
                continue;
            }
            res += "" + newArray[i];
        }
        return res;
    }


}
