package com.scavino.varisity.student200;

/**
 * https://www.baeldung.com/java-character-ascii-value
 */
public class StringManipulation {

    public static boolean isDigit(char c){
        int charInt = (int)c;
        //System.out.println("char as int [" +charInt + "]");
        return (charInt > 47) && (charInt < 58);
    }
    public static int digitPosition(String s, boolean first){
        int j = -1;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            boolean isDigit = isDigit(s.charAt(i));
            if (isDigit ){
                j = i;
                if (first){
                    break;
                }
            }
        }
        return j;
    }

    public static void main (String[] args){
        System.out.println("digitPosition : hello result " + digitPosition("hello", true));
        System.out.println("digitPosition : h3ll0 result " + digitPosition("h3ll0", true));
        System.out.println("digitPosition : h3ll0 result " + digitPosition("h3ll0", false));

    }
}
