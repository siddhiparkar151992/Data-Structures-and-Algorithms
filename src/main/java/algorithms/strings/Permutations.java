package main.java.algorithms.strings;

public class Permutations {


    public String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    public void findPermutationUtil(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            findPermutationUtil(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    public static void main(String... args) {
        Permutations p = new Permutations();
        String str = "ABC";
        p.findPermutationUtil(str, 0, str.length() - 1);
    }
}
