package main.java.algorithms.strings;

public class PrintAllSentencesFromListOfWords {


    public void printRecursively(String[][] arr, int i, String currentStr) {
        if (i == arr.length-1) {
            System.out.println(currentStr);
            return;
        }
        for (int r = i + 1; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (!arr[r][c].isEmpty()) {
                    printRecursively(arr, r, currentStr + " "+ arr[r][c]);
                }
            }
        }
    }

    public void print(String[][] arr) {

        for (int i = 0; i < arr[0].length; i++) {
            if (!arr[0][i].isEmpty()) {
                String startWord = arr[0][i];
                printRecursively(arr, 0, startWord);
            }
        }
    }

    public static void main(String... args) {
        String[][] arr = {{"you", "we", ""},
                {"have", "are", ""},
                {"sleep", "eat", "drink"}};

        PrintAllSentencesFromListOfWords p = new PrintAllSentencesFromListOfWords();
        p.print(arr);
    }

}
