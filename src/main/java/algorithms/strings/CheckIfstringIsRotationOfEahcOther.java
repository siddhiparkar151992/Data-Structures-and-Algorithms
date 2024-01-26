package main.java.algorithms.strings;

public class CheckIfstringIsRotationOfEahcOther {

    public static boolean check(String s1, String s2) {
        int i=0;
        if (s1.length()!=s2.length()) {
          return false;
        }
        int iteraration = 1;
        for (int j=0;j<s1.length();j++){
            if(iteraration == s1.length()) {
                break;
            }
            if (s1.charAt(0) == s2.charAt(j)) {
                i = j;
                break;
            }
        }

        int s1s= 1;
        int s2s=i+1;
        while (true) {
            if (iteraration == s1.length()) {
                break;
            }
            if (s1s>=0 && s1s<s1.length() && s2s >=0 && s2s<s1.length()) {
                if (s1.charAt(s1s) != s2.charAt(s2s)) {
                    return false;
                }
            }
            iteraration++;

        }
        return true;
    }

    public static void main(String... args) {
        System.out.println(check("ABCDG", "CDAB"));
    }
}
