import java.math.BigInteger;

public class AddBinary67 {
    public static void main(String[] args) {
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    static String addBinary(String a, String b) {
        BigInteger m=new BigInteger(a,2);
        BigInteger n=m.add(new BigInteger(b,2));

        return n.toString(2);
    }




//    static String addBinary(String a, String b) {
//        long aValue = binaryToDecimal(a);
//        long bValue = binaryToDecimal(b);
//        long sum = aValue + bValue;
//
//        return decimalToBinary(sum);
//    }
//
//    static long binaryToDecimal(String a) {
//        long result = 0;
//        char[] digits = a.toCharArray();
//
//        for(int i = 0; i < digits.length; i++) {
//            result += (long) (((long)(digits[i]) - 48) * Math.pow(2, (digits.length - i - 1)));
//        }
//        return result;
//    }
//
//    static String decimalToBinary(long number) {
//        StringBuilder sb = new StringBuilder();
//        int binaryLength = 0;
//
//        while(true) {
//            if(number < Math.pow(2, binaryLength)) {
//                break;
//            }
//            binaryLength++;
//        }
//
//        for(int i = binaryLength; i > 0; i--) {
//            long current = (long) Math.pow(2, (i - 1));
//            if(number >= current) {
//                sb.append("1");
//                number -= current;
//            } else {
//                sb.append("0");
//            }
//        }
//
//        return sb.toString();
//    }
}
