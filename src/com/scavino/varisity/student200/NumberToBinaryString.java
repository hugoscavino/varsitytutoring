package com.scavino.varisity.student200;

public class NumberToBinaryString {

    public static void main (String[] args){
        System.out.println("NumberToBinaryString :   0 : " + numberToBinaryString(0));
        System.out.println("NumberToBinaryString :   1 : " + numberToBinaryString(1));
        System.out.println("NumberToBinaryString :  12 : " + numberToBinaryString(12));
        System.out.println("NumberToBinaryString :  23 : " + numberToBinaryString(23));
        System.out.println("NumberToBinaryString : 128 : " + numberToBinaryString(128));
        System.out.println("NumberToBinaryString : 255 : " + numberToBinaryString(255));
    }

    /**
     * To convert integer to binary, start with the integer in question and divide it by 2 keeping notice of the
     * quotient and the remainder. Continue dividing the quotient by 2 until you get a quotient of zero. Then just
     * write out the remainders in the reverse order.
     * <br>
     * Here is an example of such conversion using the integer 12.
     * First, let’s divide the number by two specifying quotient and remainder:
     * <br>
     * Now, we simply need to write out the remainder in the reverse order —1100.
     * So, 12 in decimal system is represented as 1100 in binary.
     * <br>
     * @param dividendToConvert The number to parse down
     * @return Binary representation of number as a String
     */
    private static String numberToBinaryString(int dividendToConvert) {
        String result = "";
        final int divisor = 2;

        while (dividendToConvert != 0){
            int remainder          = dividendToConvert % divisor;
            dividendToConvert      = dividendToConvert / divisor;
            result = result + remainder;
        }

        String reversedString = getReversedString(result);

        return frontPad("0", reversedString, 8);
    }

    public static String frontPad(String pad, String str, int length) {
        StringBuilder result = new StringBuilder(str);
        while (result.length() < length){
            result.insert(0, pad);
        }

        return result.toString();
    }

    public static String getReversedString(String str){
        String result = "";
        char[] charArray = str.toCharArray();
        for (int i = (charArray.length-1); i >= 0; i--){
            result = result + str.charAt(i);
        }
        return result;
    }
}
