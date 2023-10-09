package com.scavino.varisity.student200;

public class RemoveStuff {

    public static void main (String[] args){
        //System.out.println("RemoveStuff : " + removeStuff("Hey, how are you?"));
        System.out.println("RemoveStuff : " + removeStuff("Do?n?'?t catch ?fish"));
        System.out.println("RemoveStuff : " + removeStuff("Green? apples"));
    }

    private static String removeStuff(String s) {

        String charsWithoutPrecedingQMark = "";
        // Step 2 - Remove all characters that are immediately preceded by a question mark.

        char[] charactersWithSpacesAndExclaimation = s.toCharArray();
        final char characterToPrecede = '?';
        for (int i = 0; i < charactersWithSpacesAndExclaimation.length; i++){
            if ( charactersWithSpacesAndExclaimation[i] == characterToPrecede){
                // skip me and skip next one, move the i IF not at the end
                charsWithoutPrecedingQMark = charsWithoutPrecedingQMark + charactersWithSpacesAndExclaimation[i];
                i = i + 1;
                if (i >= charactersWithSpacesAndExclaimation.length){
                    break;
                }
            } else {
                charsWithoutPrecedingQMark = charsWithoutPrecedingQMark + charactersWithSpacesAndExclaimation[i];
            }
        }

        // step 2 - remove the spaces
        final char characterToRemove = ' ';
        char[] charactersWithoutSpaces = charsWithoutPrecedingQMark.toCharArray();
        String result = "";
        for (int i = 0; i < charactersWithoutSpaces.length; i++){

            if (charactersWithoutSpaces[i] == characterToRemove){
                // ignore
            } else {
                result = result + charactersWithoutSpaces[i];
            }
        }

        return result;
    }
}
