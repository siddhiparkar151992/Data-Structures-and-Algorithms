package main.java.algorithms.strings;

public class FindAllSubStrings {

    public void substring(String str,int i) {
        if(i >= str.length()) {
            return;
        }
        String currentStr = String.valueOf(str.charAt(i));
        System.out.println(currentStr);
        for (int j= i+1;j< str.length();j++) {
            currentStr+=str.charAt(j);
            System.out.println(currentStr);
        }
        substring(str, i+1);
    }

    public static void main(String... args) {
        FindAllSubStrings f = new FindAllSubStrings();
        f.substring("abcd", 0);
    }
}
