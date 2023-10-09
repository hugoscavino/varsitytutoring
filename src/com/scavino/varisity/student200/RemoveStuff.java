package com.scavino.varisity.student200;

public class RemoveStuff {

    public static void main (String[] args){
        System.out.println("RemoveStuff : " + removeStuff("Hey, how are you?"));
        System.out.println("RemoveStuff : " + removeStuff("Do?n?'?t catch ?fish"));
        System.out.println("RemoveStuff : " + removeStuff("Green? apples"));
    }

    private static String removeStuff(String s) {
        // step 1 - remove the spaces
        final char characterToRemove = ' ';

        // Step 1.1 - Convert to char array

        char[] charactersWithSpacesAndExclaimation = s.toCharArray();
        String charactersWithoutSpaces = "";
        for (int i = 0; i < charactersWithSpacesAndExclaimation.length; i++){

            if (s.charAt(i) == characterToRemove){
                // ignore
            } else {
                charactersWithoutSpaces = charactersWithoutSpaces + s.charAt(i);
            }
        }

        // Step 2 - We have removed all the spaces now spaces remove (b)
        // all characters that are immediately preceded by a question mark.

        String result = "";

        char[] charactersWithExclaimation = charactersWithoutSpaces.toCharArray();
        final char characterToPrecede = '?';
        for (int i = 0; i < charactersWithExclaimation.length; i++){
            if ( charactersWithoutSpaces.charAt(i) == characterToPrecede){
                // skip me and skip next one, move the i IF not at the end
                result = result + charactersWithoutSpaces.charAt(i);
                i = i + 1;
                if (i >= charactersWithExclaimation.length){
                    break;
                }
            } else {
                result = result + charactersWithoutSpaces.charAt(i);
            }
        }

        return result;
    }
}
