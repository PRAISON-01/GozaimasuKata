package test.java;

public class GozaimasuKata {

    private final static String REGEX = "^[a-zA-Z]+";


    public static String getShortestWord(String sentence) {

        String[] array = sentence.split(" ");
        boolean checkingString = true;
        int smallestLength = array[0].length();
        String smallestWord = "";
        for(String element : array) {
            if(element.matches(REGEX)) {
                if(element.length() < smallestLength || smallestWord.trim().isEmpty() ) {
                    smallestLength = element.length();
                    smallestWord = element;
                }

            }
        }

        return smallestWord;
    }

    public static int[] squareAndSortArray(int[] array) {
        int[] newArray = new int[array.length];
        int count = 0;
        for(int element : array) {
            newArray[count] = element * element;
            count++;
        }

        return sort(newArray);
    }





    private static int[] sort(int[] array) {
        for(int count = 0; count < array.length; count++) {
            for(int counter = 0; counter < array.length; counter++) {
                if(array[count] < array[counter]) {
                    int temp = array[count];
                    array[count] = array[counter];
                    array[counter] = temp;
                }
            }
        }
        return array;
    }
}
