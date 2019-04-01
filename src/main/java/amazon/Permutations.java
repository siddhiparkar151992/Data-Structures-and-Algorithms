package main.java.amazon;

public class Permutations {

    public static void main(String[] args){
        int[][] data = {{123},{4,5,6}};
        int[][] copy = data.clone();

        copy[0][0] = 100;

        System.out.println(data[0][0]);
        System.out.println(copy[0][0]);

        copy[1] = new int[]{300,400,500};

        System.out.println(data[1][1]);
        System.out.println(copy[1][1]);
    }
    public static void main1(String[] args) {
        Permutations p = new Permutations();
        p.findPermutations("abcd");
    }

    public void findPermutations(String str) {
        StringBuilder b = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            permutations(b, 0);
        }
    }

    public void permutations(StringBuilder str, int i) {
        StringBuilder original = new StringBuilder(str);
        System.out.println(original);
        for (int j = i + 1; j < str.length(); j++) {
            char charToReplace = str.charAt(j);
            str = str.replace(j, j + 1, String.valueOf(str.charAt(i)));
            str = str.replace(i, i + 1, String.valueOf(charToReplace));
            permutations(str, j);
            str = original;
        }
    }

}
